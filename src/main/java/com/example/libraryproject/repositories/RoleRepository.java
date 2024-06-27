package com.example.libraryproject.repositories;

import com.example.libraryproject.model.Role;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface RoleRepository extends CassandraRepository<Role, Integer> {

}
