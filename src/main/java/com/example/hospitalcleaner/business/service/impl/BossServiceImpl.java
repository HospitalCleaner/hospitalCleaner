package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.Logging;
import com.example.hospitalcleaner.business.core.mapper.BossMapper;
import com.example.hospitalcleaner.business.core.mapper.BossMapperImpl;
import com.example.hospitalcleaner.business.core.results.*;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.business.requests.BossEntityCRequest;
import com.example.hospitalcleaner.business.requests.BossEntityDRequest;
import com.example.hospitalcleaner.business.requests.BossEntityURequest;
import com.example.hospitalcleaner.business.service.BossService;
import com.example.hospitalcleaner.dataAccess.BossEntityRepository;
import com.example.hospitalcleaner.entity.BossEntity;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BossServiceImpl implements BossService {

    @Autowired
    private BossMapper bossMapper;
    @Autowired
    private BossEntityRepository bossEntityRepository;

    @Override
    public DataResult<List<BossEntityDto>> getAll() {
    List<BossEntity> bossEntities=this.bossEntityRepository.findAll();
    List<BossEntityDto> bossEntityDtos=bossMapper.toBossDtoList(bossEntities);



        return new SuccessDataResult<>(bossEntityDtos);
    }



    @Override
    public DataResult<BossEntityDto> add(BossEntityCRequest bossEntityCRequest) {
        BossEntity boss = this.bossMapper.bossCreateToEntity(bossEntityCRequest);
        BossEntityDto bossEntityDto = this.bossMapper.bossEntityToDto(this.bossEntityRepository.save(boss));
        return new SuccessDataResult<BossEntityDto>(bossEntityDto);
    }

    @Override
    public DataResult<BossEntityDto> update(BossEntityURequest bossEntityURequest) {

        Optional<BossEntity> optionalBossEntity=this.bossEntityRepository.findById(bossEntityURequest.getId());
        if(!optionalBossEntity.isPresent()){
            return new ErrorDataResult<>(null,"boss bulunamadı.");
        }
        BossEntity bossEntity=bossMapper.bossUpdateToEntity(bossEntityURequest);
        bossEntity =bossEntityRepository.save(bossEntity);
        BossEntityDto bossEntityDto = this.bossMapper.bossEntityToDto(bossEntity);
            return new SuccessDataResult<>(bossEntityDto,"güncellendi.");

    }

    @Override
    public DataResult<BossEntityDto> delete(BossEntityDRequest bossEntityDRequest) {
       Optional<BossEntity> optionalBossEntity= bossEntityRepository.findById(bossEntityDRequest.getId());
        if(!optionalBossEntity.isPresent()){
            return new ErrorDataResult<>(null,"boss bulunamadı.");
        }
        BossEntity bossEntity=optionalBossEntity.get();
        bossEntity.setIsActive(0);
       bossEntity= bossEntityRepository.save(bossEntity);
       BossEntityDto bossEntityDto =this.bossMapper.bossEntityToDto(bossEntity);

       return new SuccessDataResult(bossEntityDto,"silindi.");
    }

    @Override
    public DataResult<BossEntityDto> getById(int id) {
        if(!bossEntityRepository.existsById(id)){
            return new ErrorDataResult<>(null);
        }
        BossEntity bossEntity=this.bossEntityRepository.getById(id);
        BossEntityDto bossEntityDto=bossMapper.bossEntityToDto(bossEntity);
        return new SuccessDataResult<BossEntityDto> (bossEntityDto);
    }
}
