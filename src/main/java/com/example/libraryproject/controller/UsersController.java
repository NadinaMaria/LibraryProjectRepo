package com.example.libraryproject.controller;

import com.example.libraryproject.model.Role;
import com.example.libraryproject.model.Users;
import com.example.libraryproject.repositories.RoleRepository;
import com.example.libraryproject.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    AuthenticationManager authenticationManager;
    @Autowired
    UsersRepository usersRepository;

    RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UsersController(AuthenticationManager authenticationManager, UsersRepository usersRepository,
                           PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        this.authenticationManager = authenticationManager;
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;

    }
    @GetMapping("/users")
    public List<Users> getUsers()
    {
        return usersRepository.findAll();
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Users user) {

//        if (usersRepository.existsByUsername(user.getUsername())) {
//            return new ResponseEntity<String>("Username is already taken", HttpStatus.BAD_REQUEST);
//        } else {
            Users u = new Users();
            u.setUsername(user.getUsername());
            u.setPassword(passwordEncoder.encode(user.getPassword()));
            u.setId(user.getId());
//            if (roleRepository.findById(user.))
//            {
//
//
//            }


            usersRepository.save(user);

            return new ResponseEntity<>("User registered successfully!", HttpStatus.OK);

    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Users admin)
    {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(admin.getUsername(),
                        admin.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        return new ResponseEntity<>("Admin signed in!", HttpStatus.OK);

    }

}
