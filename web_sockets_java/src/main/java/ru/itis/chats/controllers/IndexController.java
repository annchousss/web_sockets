package ru.itis.chats.controllers;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.chats.configs.Statics;
import ru.itis.chats.dto.UserDto;
import ru.itis.chats.services.UsersService;

import java.util.UUID;

@Controller
public class IndexController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/getId")
    public String getIndexPage(Model model) {
//        String s = UUID.randomUUID().toString();
//        Statics.ids.add(s);
//        model.addAttribute("id", Jwts.builder().signWith(SignatureAlgorithm.HS512, Statics.jwtSecret).setSubject(s).compact());



        UserDto user = usersService.registerUserByName()

        return ;
    }
}
