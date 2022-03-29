package com.example.hospitalcleaner.authjwt.repository;

import com.example.hospitalcleaner.authjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String userName);
    Boolean existsByUsername(String userName);
    Boolean existsByEmail(String email);


}
