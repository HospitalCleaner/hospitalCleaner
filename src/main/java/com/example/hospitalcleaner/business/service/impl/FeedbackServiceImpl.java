package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.FeedbackMapper;
import com.example.hospitalcleaner.business.core.results.*;
import com.example.hospitalcleaner.business.dto.CleanerEntityDto;
import com.example.hospitalcleaner.business.dto.FeedbackEntityDto;
import com.example.hospitalcleaner.business.requests.*;
import com.example.hospitalcleaner.business.service.FeedbackService;
import com.example.hospitalcleaner.dataAccess.FeedbackEntityRepository;
import com.example.hospitalcleaner.entity.FeedbackEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Optional<FeedbackEntity> optionalFeedbackEntity=feedbackEntityRepository.findById(feedbackEntityURequest.getId());
        if(!optionalFeedbackEntity.isPresent()){
            return new ErrorResult("feedback bulunamadı.");
        }
        this.feedbackEntityRepository.save(this.feedbackMapper.feedbackUpdateToEntity(feedbackEntityURequest));
        return new SuccessResult("güncellendi");
    }

    @Override
    public Result delete(FeedbackEntityDRequest feedbackEntityDRequest) {
        Optional<FeedbackEntity> optionalFeedbackEntity=feedbackEntityRepository.findById(feedbackEntityDRequest.getId());
        if(!optionalFeedbackEntity.isPresent()){
            return new ErrorResult("feedback bulunamadı.");
        }
        this.feedbackEntityRepository.deleteById(feedbackEntityDRequest.getId());
        return new SuccessResult("silindi.");
    }

    @Override
    public DataResult<List<FeedbackEntityDto>> getByRoomId(int roomId) {
      return new SuccessDataResult<>(this.feedbackMapper.feedbackEntitytoDtos(this.feedbackEntityRepository.getAllByRoomId(roomId)));
    }

    @Override
    public DataResult<Double> getByRoomAverageStar(int roomId) {
        Double a = this.feedbackEntityRepository.getByRoomIdAvaregaStar(roomId);
        return new SuccessDataResult<Double>(a);
    }
}
