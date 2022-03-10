package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.RoomCoplexTypeMapper;
import com.example.hospitalcleaner.business.core.mapper.RoomMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.core.results.SuccessDataResult;
import com.example.hospitalcleaner.business.core.results.SuccessResult;
import com.example.hospitalcleaner.business.dto.RoomEntityDto;
import com.example.hospitalcleaner.business.requests.RoomEntityCRequest;
import com.example.hospitalcleaner.business.requests.RoomEntityDRequest;
import com.example.hospitalcleaner.business.requests.RoomEntityURequest;
import com.example.hospitalcleaner.business.service.FeedbackService;
import com.example.hospitalcleaner.business.service.RoomService;
import com.example.hospitalcleaner.dataAccess.RoomEntityRepository;
import com.example.hospitalcleaner.entity.complexType.RoomEntityDtoComplexType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomEntityRepository roomEntityRepository;

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private RoomCoplexTypeMapper roomCoplexTypeMapper;

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public DataResult<List<RoomEntityDto>> getAll() {
        return new SuccessDataResult<>(this.roomMapper.roomEntitytoDto(roomEntityRepository.findAll()));
    }

    @Override
    public DataResult<List<RoomEntityDto>> getAllByHospitalId(int hospitalId) {
        return new SuccessDataResult<>(this.roomMapper.roomEntitytoDto(this.roomEntityRepository.getAllByHospitalId(hospitalId)));
    }

    @Override
    public DataResult<List<RoomEntityDto>> getAllByCleanerId(int cleanerId) {
        return new SuccessDataResult<>(roomMapper.roomEntitytoDto(roomEntityRepository.getAllByCleanerId(cleanerId)));
    }

    @Override
    public DataResult<RoomEntityDtoComplexType> getRoomAvaregaStar(int roomId) {
        RoomEntityDtoComplexType roomEntityDtoComplexType = new RoomEntityDtoComplexType();
        roomEntityDtoComplexType =this.roomCoplexTypeMapper.roomEntitytoComplexType(this.roomEntityRepository.getById(roomId));

        roomEntityDtoComplexType.setStar(feedbackService.getByRoomAverageStar(roomId).getData());

        return new SuccessDataResult<>(roomEntityDtoComplexType);
    }

    @Override
    public Result add(RoomEntityCRequest roomEntityCRequest) {

        this.roomEntityRepository.save(this.roomMapper.roomCreateToEntity(roomEntityCRequest));
        return new SuccessResult("eklendi");
    }

    @Override
    public Result update(RoomEntityURequest roomEntityURequest) {
        this.roomEntityRepository.save(roomMapper.roomUpdateToEntity(roomEntityURequest));
        return new SuccessResult("güncellendi.");
    }

    @Override
    public Result delete(RoomEntityDRequest roomEntityDRequest) {

        this.roomEntityRepository.deleteById(roomEntityDRequest.getId());
        return new SuccessResult("silindi");
    }
}
