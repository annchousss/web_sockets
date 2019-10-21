package ru.itis.chats.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import ru.itis.chats.configs.Statics;
import ru.itis.chats.dto.UserDto;

import java.util.UUID;

@Service
public class UsersService {

    public UserDto registerUserByName(String username) {
        String userId = UUID.randomUUID().toString();
        Statics.ids.add(userId);
        String userToken = Jwts.builder().signWith(SignatureAlgorithm.HS512, Statics.jwtSecret).setSubject(userId).compact();

        UserDto user = UserDto.builder()
                .id(userId)
                .username(username)
                .token(userToken)
                .build();

        return user;
    }

}
