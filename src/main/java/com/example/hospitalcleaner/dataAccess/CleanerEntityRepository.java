package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.CleanerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CleanerEntityRepository extends JpaRepository<CleanerEntity, Integer> {
}