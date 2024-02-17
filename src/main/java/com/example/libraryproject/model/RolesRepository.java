package com.example.libraryproject.model;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.libraryproject.model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer> {
    Optional<Roles> findByName(String name);
}
