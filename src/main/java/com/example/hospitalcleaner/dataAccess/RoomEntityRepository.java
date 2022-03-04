package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomEntityRepository extends JpaRepository<RoomEntity, Integer> {
}