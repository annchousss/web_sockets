package ru.itis.chats.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.chats.configs.Statics;
import ru.itis.chats.dto.UserDto;
import ru.itis.chats.models.Role;
import ru.itis.chats.models.User;
import ru.itis.chats.repositories.UsersRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UsersService { // пришел нэйм с фронта закидываем в бд, шенерим токен, отпр обратно юзеру его токен на фронт через контроллер

    @Autowired
    private UsersRepository usersRepository;

    public UserDto registerUserByName(String username) {
        User user = User.builder()
                .username(username)
                //  .token(userDto.getToken())
                .role(Role.USER)
                .build();
        usersRepository.saveUser(user);

        Map<String, Object> claims = new HashMap<>();

        claims.put("userId", user.getId());
        claims.put("username", user.getUsername());
        claims.put("role", user.getRole().toString());

        String token = Jwts.builder().setClaims(claims)
                .setSubject(user.getId().toString())
                // .setIssuedAt(createdDate)
                .setId(claims.get("userId").toString())
                //.setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS512, Statics.jwtSecret).compact();

        // чтобы кинуть токен обратно юзеру
        return UserDto.builder()
                .username(user.getUsername())
                .token(token)
                .role(user.getRole())
                .build();
    }

}
