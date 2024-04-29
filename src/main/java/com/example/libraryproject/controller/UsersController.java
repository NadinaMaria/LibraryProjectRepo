package com.example.libraryproject.controller;

import com.example.libraryproject.model.Users;
import com.example.libraryproject.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersRepository usersRepository;
    @GetMapping("/users")
    public List<Users> getUsers()
    {
        return usersRepository.findAll();
    }
}
