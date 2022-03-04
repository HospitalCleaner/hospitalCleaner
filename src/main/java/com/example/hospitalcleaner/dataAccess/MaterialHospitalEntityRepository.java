package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.MaterialHospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialHospitalEntityRepository extends JpaRepository<MaterialHospitalEntity, Integer> {
}