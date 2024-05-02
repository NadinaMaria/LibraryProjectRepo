package com.example.libraryproject.repositories;

import com.example.libraryproject.model.Users;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UsersRepository extends CassandraRepository<Users, Integer> {

    Users findUsersById(Integer id);
    Users findUsersByUsername(String username);
    Boolean existsByUsername(String userName);
}
