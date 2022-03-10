package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.CleanerMapper;
import com.example.hospitalcleaner.business.core.results.*;
import com.example.hospitalcleaner.business.dto.CleanerEntityDto;
import com.example.hospitalcleaner.business.requests.CleanerEntityCRequest;
import com.example.hospitalcleaner.business.requests.CleanerEntityDRequest;
import com.example.hospitalcleaner.business.requests.CleanerEntityURequest;
import com.example.hospitalcleaner.business.service.BossService;
import com.example.hospitalcleaner.business.service.CleanerService;
import com.example.hospitalcleaner.dataAccess.CleanerEntityRepository;
import com.example.hospitalcleaner.entity.CleanerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CleanerServiceImpl implements CleanerService {
    @Autowired
    private CleanerMapper cleanerMapper;
    @Autowired
    private CleanerEntityRepository cleanerEntityRepository;
    @Autowired
    private BossService bossService;


    @Override
    public DataResult<List<CleanerEntityDto>> getAll() {
    return new SuccessDataResult<List<CleanerEntityDto>>(this.cleanerMapper.cleanerEntityToDtos(this.cleanerEntityRepository.findAll()));
    }

    @Override
    public Result add(CleanerEntityCRequest cleanerEntityCRequest) {
        if(bossService.getById(cleanerEntityCRequest.getBossId()).getData()==null){
            return new ErrorResult("boss bulunamadı.");
        }
        CleanerEntity cleanerEntity=cleanerMapper.cleanerCreateToEntity(cleanerEntityCRequest);
        this.cleanerEntityRepository.save(cleanerEntity);
        return new SuccessResult("eklendi.");
    }

    @Override
    public Result update(CleanerEntityURequest cleanerEntityURequest) {
        Optional<CleanerEntity> optionalCleanerEntity=this.cleanerEntityRepository.findById(cleanerEntityURequest.getId());
        if(!optionalCleanerEntity.isPresent()){
            return new ErrorResult("cleaner bulunamadı.");
        }
        this.cleanerEntityRepository.save(cleanerMapper.cleanerUpdateToEntity(cleanerEntityURequest));
        return new SuccessResult("güncellendi");
    }

    @Override
    public Result delete(CleanerEntityDRequest cleanerEntityDRequest) {
        Optional<CleanerEntity> cleanerEntity=this.cleanerEntityRepository.findById(cleanerEntityDRequest.getId());
        if(!cleanerEntity.isPresent()){
            return new ErrorResult("cleaner bulunamadı.");
        }
       this.cleanerEntityRepository.deleteById(cleanerEntityDRequest.getId());
       return new SuccessResult("silindi.");
    }

    @Override
    public DataResult<CleanerEntityDto> getById(int id) {
        if(!this.cleanerEntityRepository.existsById(id)){
            return new ErrorDataResult<>(null);
        }
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
