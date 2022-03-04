package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackEntityRepository extends JpaRepository<FeedbackEntity, Integer> {
}