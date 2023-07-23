package com.jwt.example.jwtExample.services;

import com.jwt.example.jwtExample.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    public List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Jagriti Rabindra", "xyz.com"));
        store.add(new User(UUID.randomUUID().toString(), "Mpnu Rabindra", "monu.com"));
        store.add(new User(UUID.randomUUID().toString(), "Sita Rabindra", "sita.com"));
        store.add(new User(UUID.randomUUID().toString(), "Binu Rabindra", "binu.com"));
    }

    public List<User> getUser(){
         return this.store;
    }
}
