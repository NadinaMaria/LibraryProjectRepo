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
public class Role {
    @PrimaryKey
    private int id;

    private String name;


//    int size(List<Integer> ids) {
//        if (ids.size() == 1) {
//            return 1;
//        } else if (ids.size() == 2) {
//            return 2;
//        } else return 0;
//    }

    public Role (int id) {
        this.id = id;
        if (id == 1) {
            this.name = "ADMIN";
        } else if (id == 2) {
            this.name = "USER";
        } else
            System.out.println("ERROR adding role");
    }

    public String getRoleName(int id) {
        if (id == 1) {

            return "ADMIN";
        } else if (id == 2) {

            return "USER";
        } else
            return "ERROR adding role";
    }
}
