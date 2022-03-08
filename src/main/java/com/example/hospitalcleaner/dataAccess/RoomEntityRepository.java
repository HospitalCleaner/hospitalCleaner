package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.CleanerEntity;
import com.example.hospitalcleaner.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomEntityRepository extends JpaRepository<RoomEntity, Integer> {

    List<RoomEntity> getAllByHospitalId(int hospitalId);
    List<RoomEntity> getAllByCleanerId(int cleanerId);
}