package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialEntityRepository extends JpaRepository<MaterialEntity, Integer> {
}