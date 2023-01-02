package com.jrferry.javaangularsandbox.controller;

import com.jrferry.javaangularsandbox.entities.AppUser;
import com.jrferry.javaangularsandbox.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/users")
    public List<AppUser> getUsers() {
        return (List<AppUser>)userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody AppUser user) {
        userRepository.save(user);
    }
}
