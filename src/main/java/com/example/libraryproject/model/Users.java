package com.example.libraryproject.model;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

@Table(value="library.users")
public class Users implements Serializable {

    @PrimaryKey
    private String username;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    public Users() {

    }
    public Users(String username, String name, String email, String password)
    {
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
