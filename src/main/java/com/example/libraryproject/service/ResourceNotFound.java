package com.example.libraryproject.service;

public class ResourceNotFound extends RuntimeException{

    public ResourceNotFound(String message)
    {
        super(message);
        System.out.println(message);
    }
}
