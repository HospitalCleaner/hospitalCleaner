package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.HospitalMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.core.results.SuccessDataResult;
import com.example.hospitalcleaner.business.core.results.SuccessResult;
import com.example.hospitalcleaner.business.dto.HospitalEntityDto;
import com.example.hospitalcleaner.business.requests.HospitalEntityCRequest;
import com.example.hospitalcleaner.business.requests.HospitalEntityDRequest;
import com.example.hospitalcleaner.business.requests.HospitalEntityURequest;
import com.example.hospitalcleaner.business.service.HospitalService;
import com.example.hospitalcleaner.dataAccess.HospitalEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalEntityRepository hospitalEntityRepository;
    @Autowired
    private HospitalMapper hospitalMapper;
    @Override
    public DataResult<List<HospitalEntityDto>> getAll() {
        
        return new SuccessDataResult<>(hospitalMapper.hospitalEntitytoDtos(this.hospitalEntityRepository.findAll()));
    }

    @Override
    public Result add(HospitalEntityCRequest hospitalEntityCRequest) {
        this.hospitalEntityRepository.save(hospitalMapper.hospitalCreateToEntity(hospitalEntityCRequest));
        return new SuccessResult("eklendi.");
    }

    @Override
    public Result update(HospitalEntityURequest hospitalEntityURequest) {
        this.hospitalEntityRepository.save(this.hospitalMapper.hospitalUpdateToEntity(hospitalEntityURequest));
        return new SuccessResult("güncellendi");
    }

    @Override
    public Result delete(HospitalEntityDRequest hospitalEntityDRequest) {
        this.hospitalEntityRepository.deleteById(hospitalEntityDRequest.getId());

        return new SuccessResult("silindi");
    }
}
