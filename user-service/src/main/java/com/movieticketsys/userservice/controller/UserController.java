package com.movieticketsys.userservice.controller;

import com.movieticketsys.userservice.model.User;
import com.movieticketsys.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/id/{userId}")
    public @ResponseBody Optional<User> findById(@PathVariable Long userId) {
        return userRepository.findById(userId);
    }
}
