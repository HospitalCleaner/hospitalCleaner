package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.entity.CleanerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CleanerEntityRepository extends JpaRepository<CleanerEntity, Integer> {
   //DataResult<List<CleanerEntity>> getAllByBossId(int bossId);

    List<CleanerEntity> getAllByBossId(int bossId);



}