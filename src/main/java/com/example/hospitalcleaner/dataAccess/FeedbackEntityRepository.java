package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackEntityRepository extends JpaRepository<FeedbackEntity, Integer> {
    List<FeedbackEntity> getAllByRoomId(int roomId);
}