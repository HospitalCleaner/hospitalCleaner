package com.example.hospitalcleaner.authjwt.repository;

import com.example.hospitalcleaner.authjwt.models.ERole;
import com.example.hospitalcleaner.authjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);

}
