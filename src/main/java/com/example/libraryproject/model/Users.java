package com.example.libraryproject.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


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
    private int roleId;

    public Users(String username, String password, int roleId) {
        this.username = username;
        this.password = password;
        this.roleId = roleId;
    }

}
