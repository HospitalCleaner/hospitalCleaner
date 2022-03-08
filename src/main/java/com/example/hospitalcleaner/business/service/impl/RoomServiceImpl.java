package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.RoomMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.core.results.SuccessDataResult;
import com.example.hospitalcleaner.business.core.results.SuccessResult;
import com.example.hospitalcleaner.business.dto.RoomEntityDto;
import com.example.hospitalcleaner.business.requests.RoomEntityCRequest;
import com.example.hospitalcleaner.business.requests.RoomEntityDRequest;
import com.example.hospitalcleaner.business.requests.RoomEntityURequest;
import com.example.hospitalcleaner.business.service.RoomService;
import com.example.hospitalcleaner.dataAccess.RoomEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomEntityRepository roomEntityRepository;

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
