package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.BossMapper;
import com.example.hospitalcleaner.business.core.mapper.BossMapperImpl;
import com.example.hospitalcleaner.business.core.mapping.ModelMapperService;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.core.results.SuccessDataResult;
import com.example.hospitalcleaner.business.core.results.SuccessResult;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.business.requests.BossEntityCRequest;
import com.example.hospitalcleaner.business.requests.BossEntityDRequest;
import com.example.hospitalcleaner.business.requests.BossEntityURequest;
import com.example.hospitalcleaner.business.service.BossService;
import com.example.hospitalcleaner.dataAccess.BossEntityRepository;
import com.example.hospitalcleaner.entity.BossEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BossServiceImpl implements BossService {

    @Autowired
    private BossMapper bossMapper;
    @Autowired
    private BossEntityRepository bossEntityRepository;

    @Autowired
    private ModelMapperService modelMapperService;


    @Override
    public DataResult<List<BossEntityDto>> getAll(int a) {


       BossEntityDto bossEntities= this.bossEntityRepository.getById(a).getData();
       List<BossEntityDto> b =new ArrayList<>();
       b.add(bossEntities);


        return new SuccessDataResult<List<BossEntityDto>>(b);
    }

    @Override
    public Result add(BossEntityCRequest bossEntityCRequest) {
        BossEntity boss = this.bossMapper.bossCreateToEntity(bossEntityCRequest);
        this.bossEntityRepository.save(boss);
        return new SuccessResult("eklendi");
    }

    @Override
    public Result update(BossEntityURequest bossEntityURequest) {
        return null;
    }

    @Override
    public Result delete(BossEntityDRequest bossEntityDRequest) {
        return null;
    }

    @Override
    public DataResult<BossEntityDto> getById(int id) {
       return new SuccessDataResult<BossEntityDto> (this.bossEntityRepository.getById(id).getData());
    }
}
