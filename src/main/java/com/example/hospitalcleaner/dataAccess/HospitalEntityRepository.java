package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.HospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalEntityRepository extends JpaRepository<HospitalEntity, Integer> {
}