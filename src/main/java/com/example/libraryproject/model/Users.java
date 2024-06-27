package com.example.libraryproject.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;

@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Users {

    @PrimaryKey
    private int id;
    private String username;
    private String password;

    private Role role;

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
