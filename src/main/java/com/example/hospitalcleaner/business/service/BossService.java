package com.example.hospitalcleaner.business.service;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.business.requests.BossEntityCRequest;
import com.example.hospitalcleaner.business.requests.BossEntityDRequest;
import com.example.hospitalcleaner.business.requests.BossEntityURequest;
import com.example.hospitalcleaner.entity.BossEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BossService {
    DataResult<List<BossEntityDto>> getAll();
    DataResult<BossEntityDto> add(BossEntityCRequest bossEntityCRequest);
    DataResult<BossEntityDto> update(BossEntityURequest bossEntityURequest);
    DataResult<BossEntityDto> delete(BossEntityDRequest bossEntityDRequest);
    DataResult<BossEntityDto> getById(int id);
    String getByBossId(int id);
    DataResult<List<BossEntityDto>> getAllPage(int page,int size);

}
