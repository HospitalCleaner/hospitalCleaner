package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.entity.BossEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Optional;

public interface BossEntityRepository extends JpaRepository<BossEntity, Integer> {



}