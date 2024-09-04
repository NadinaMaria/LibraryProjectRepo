package com.example.libraryproject.repositories;

import com.example.libraryproject.model.Role;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface RoleRepository extends CassandraRepository<Role, Integer> {

//    Role findAllById(List<Integer> ids);

}
