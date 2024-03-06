package com.example.libraryproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class LibraryProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryProjectApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello you";
    }

//    @Bean
//    public CommandLineRunner clr(BookRepository bookRepository) {
//        return args -> {
//            bookRepository.saveAll(Arrays.asList(
//                    new Book(1,"Tolstoy"),
//                    new Book(2, "Rowling, J.K."),
//                    new Book(3, "Tolstoy")
//            ));
//
//            Book harryPotter = bookRepository.findBookById(1);
//            harryPotter.setTitle("Harry Potter and the Philosopher's Stone");
//            bookRepository.save(harryPotter);
//
//        };
//    }
}

