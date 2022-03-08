package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.MaterialMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.core.results.SuccessDataResult;
import com.example.hospitalcleaner.business.core.results.SuccessResult;
import com.example.hospitalcleaner.business.dto.MaterialEntityDto;
import com.example.hospitalcleaner.business.requests.MaterialEntityCRequest;
import com.example.hospitalcleaner.business.requests.MaterialEntityDRequest;
import com.example.hospitalcleaner.business.requests.MaterialEntityURequest;
import com.example.hospitalcleaner.business.service.MaterialService;
import com.example.hospitalcleaner.dataAccess.MaterialEntityRepository;
import com.example.hospitalcleaner.entity.MaterialEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialMapper materialMapper;

    @Autowired
    private MaterialEntityRepository materialEntityRepository;

    @Override
    public DataResult<List<MaterialEntityDto>> getAll() {
        return new SuccessDataResult<>(this.materialMapper.materialEntityToDto(this.materialEntityRepository.findAll()));
    }

    @Override
    public Result add(MaterialEntityCRequest materialEntityCRequest) {
        this.materialEntityRepository.save(materialMapper.materialCreateToEntity(materialEntityCRequest));
        return new SuccessResult("eklendi.");
    }

    @Override
    public Result update(MaterialEntityURequest materialEntityURequest) {

        this.materialEntityRepository.save(this.materialMapper.materialUpdateToEntity(materialEntityURequest));
        return new SuccessResult("eklendi");
    }

    @Override
    public Result delete(MaterialEntityDRequest materialEntityDRequest) {
        this.materialEntityRepository.deleteById(materialEntityDRequest.getId());
        return new SuccessResult("silindi.");
    }
}
