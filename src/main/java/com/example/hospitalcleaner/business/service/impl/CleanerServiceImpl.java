package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.CleanerMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.core.results.SuccessDataResult;
import com.example.hospitalcleaner.business.core.results.SuccessResult;
import com.example.hospitalcleaner.business.dto.CleanerEntityDto;
import com.example.hospitalcleaner.business.requests.CleanerEntityCRequest;
import com.example.hospitalcleaner.business.requests.CleanerEntityDRequest;
import com.example.hospitalcleaner.business.requests.CleanerEntityURequest;
import com.example.hospitalcleaner.business.service.CleanerService;
import com.example.hospitalcleaner.dataAccess.CleanerEntityRepository;
import com.example.hospitalcleaner.entity.CleanerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CleanerServiceImpl implements CleanerService {
    @Autowired
    private CleanerMapper cleanerMapper;
    @Autowired
    private CleanerEntityRepository cleanerEntityRepository;


    @Override
    public DataResult<List<CleanerEntityDto>> getAll() {
    return new SuccessDataResult<List<CleanerEntityDto>>(this.cleanerMapper.cleanerEntityToDtos(this.cleanerEntityRepository.findAll()));
    }

    @Override
    public Result add(CleanerEntityCRequest cleanerEntityCRequest) {
        CleanerEntity cleanerEntity=cleanerMapper.cleanerCreateToEntity(cleanerEntityCRequest);
        this.cleanerEntityRepository.save(cleanerEntity);
        return new SuccessResult("eklendi.");
    }

    @Override
    public Result update(CleanerEntityURequest cleanerEntityURequest) {
        this.cleanerEntityRepository.save(cleanerMapper.cleanerUpdateToEntity(cleanerEntityURequest));
        return new SuccessResult("güncellendi");
    }

    @Override
    public Result delete(CleanerEntityDRequest cleanerEntityDRequest) {
       this.cleanerEntityRepository.deleteById(cleanerEntityDRequest.getId());
       return new SuccessResult("silindi.");
    }

    @Override
    public DataResult<CleanerEntityDto> getById(int id) {
       CleanerEntity cleanerEntity=this.cleanerEntityRepository.getById(id);
       CleanerEntityDto cleanerEntityDto=cleanerMapper.cleanerEntityToDto(cleanerEntity);
       return new SuccessDataResult<>(cleanerEntityDto);
    }

    @Override
    public DataResult<List<CleanerEntityDto>> getAllByBossId(int bossId) {
        List<CleanerEntity> cleanerEntities = this.cleanerEntityRepository.getAllByBossId(bossId);
        List<CleanerEntityDto> cleanerEntityDtos = this.cleanerMapper.cleanerEntityToDtos(cleanerEntities);
       return new SuccessDataResult<List<CleanerEntityDto>>(cleanerEntityDtos);
    }
}
