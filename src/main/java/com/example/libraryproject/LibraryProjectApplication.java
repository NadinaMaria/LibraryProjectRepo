package com.example.libraryproject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LibraryProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryProjectApplication.class, args);
    }
    @GetMapping("/hello")
    public String sayHello () {
        return "Hello you";
    }
}

