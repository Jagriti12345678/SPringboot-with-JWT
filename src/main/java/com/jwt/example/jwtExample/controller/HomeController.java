package com.jwt.example.jwtExample.controller;

import com.jwt.example.jwtExample.model.User;
import com.jwt.example.jwtExample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("getting user");
        return userService.getUser();
    }

    @GetMapping("/current")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
