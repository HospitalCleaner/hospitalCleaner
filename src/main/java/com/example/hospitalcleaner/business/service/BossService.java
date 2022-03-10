package com.example.hospitalcleaner.business.service;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.business.requests.BossEntityCRequest;
import com.example.hospitalcleaner.business.requests.BossEntityDRequest;
import com.example.hospitalcleaner.business.requests.BossEntityURequest;
import com.example.hospitalcleaner.entity.BossEntity;

import java.util.List;

public interface BossService {
    DataResult<List<BossEntityDto>> getAll();
    DataResult<BossEntityDto> add(BossEntityCRequest bossEntityCRequest);
    DataResult<BossEntityDto> update(BossEntityURequest bossEntityURequest);
    Result delete(BossEntityDRequest bossEntityDRequest);
    DataResult<BossEntityDto> getById(int id);

}
