package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.BossEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BossEntityRepository extends JpaRepository<BossEntity, Integer> {



}