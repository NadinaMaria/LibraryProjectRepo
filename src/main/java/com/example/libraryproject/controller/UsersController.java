package com.example.libraryproject.controller;

import com.example.libraryproject.model.Role;
import com.example.libraryproject.model.Users;
import com.example.libraryproject.repositories.RoleRepository;
import com.example.libraryproject.repositories.UsersRepository;
import com.example.libraryproject.service.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersRepository usersRepository;
    RoleRepository roleRepository;
    @Autowired
    public UsersController(UsersRepository usersRepository,
                           RoleRepository roleRepository) {
//        this.authenticationManager = authenticationManager;
        this.usersRepository = usersRepository;
//        this.passwordEncoder = passwordEncoder;
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
//            u.setPassword(passwordEncoder.encode(user.getPassword()));
        u.setPassword(user.getPassword());
            u.setId(user.getId());
            List<Integer> ids = new ArrayList<Integer>();
            ids.add(user.getRoleId());
            if (roleRepository.findAllById(ids).size() == 0)
            {
                return new ResponseEntity<>("Role doesn't exist!", HttpStatus.BAD_REQUEST);
            }

            Role role = roleRepository.findById(user.getRoleId()).orElseThrow(
                    () -> new ResourceNotFound("Role doesn't exist"));

            role.setName(role.getRoleName(user.getRoleId()));


            u.setRoleId(user.getRoleId());
            usersRepository.save(user);

            return new ResponseEntity<>("User registered successfully!", HttpStatus.OK);

    }
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Users admin)
//    {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(admin.getUsername(),
//                        admin.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String token = jwtGenerator.generateToken(authentication);
//
//        return new ResponseEntity<>("Bearer " + token, HttpStatus.OK);
//
//    }

}
