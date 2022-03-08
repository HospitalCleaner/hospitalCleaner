package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.FeedbackMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.core.results.SuccessDataResult;
import com.example.hospitalcleaner.business.core.results.SuccessResult;
import com.example.hospitalcleaner.business.dto.CleanerEntityDto;
import com.example.hospitalcleaner.business.dto.FeedbackEntityDto;
import com.example.hospitalcleaner.business.requests.*;
import com.example.hospitalcleaner.business.service.FeedbackService;
import com.example.hospitalcleaner.dataAccess.FeedbackEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackEntityRepository feedbackEntityRepository;
    @Autowired
    private FeedbackMapper feedbackMapper;


    @Override
    public DataResult<List<FeedbackEntityDto>> getAll() {
        return new SuccessDataResult<>(this.feedbackMapper.feedbackEntitytoDtos(this.feedbackEntityRepository.findAll()));
    }

    @Override
    public Result add(FeedbackEntityCRequest feedbackEntityCRequest) {
        this.feedbackEntityRepository.save(feedbackMapper.feedbackCreateToEntity(feedbackEntityCRequest));
        return new SuccessResult("eklendi.");
    }

    @Override
    public Result update(FeedbackEntityURequest feedbackEntityURequest) {
        this.feedbackEntityRepository.save(this.feedbackMapper.feedbackUpdateToEntity(feedbackEntityURequest));
        return new SuccessResult("güncellendi");
    }

    @Override
    public Result delete(FeedbackEntityDRequest feedbackEntityDRequest) {
        this.feedbackEntityRepository.deleteById(feedbackEntityDRequest.getId());
        return new SuccessResult("silindi.");
    }

    @Override
    public DataResult<List<FeedbackEntityDto>> getByRoomId(int roomId) {
      return new SuccessDataResult<>(this.feedbackMapper.feedbackEntitytoDtos(this.feedbackEntityRepository.getAllByRoomId(roomId)));
    }
}
