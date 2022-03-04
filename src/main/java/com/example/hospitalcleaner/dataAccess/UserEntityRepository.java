package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {
}