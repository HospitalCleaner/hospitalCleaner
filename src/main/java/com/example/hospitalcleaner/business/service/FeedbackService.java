package com.example.hospitalcleaner.business.service;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.CleanerEntityDto;
import com.example.hospitalcleaner.business.dto.FeedbackEntityDto;
import com.example.hospitalcleaner.business.requests.*;
import com.example.hospitalcleaner.entity.FeedbackEntity;

import java.util.List;

public interface FeedbackService {

    DataResult<List<FeedbackEntityDto>> getAll();
    Result add(FeedbackEntityCRequest feedbackEntityCRequest);
    Result update(FeedbackEntityURequest feedbackEntityURequest);
    Result delete(FeedbackEntityDRequest feedbackEntityDRequest);
    DataResult<List<FeedbackEntityDto>> getByRoomId(int roomId);
}
