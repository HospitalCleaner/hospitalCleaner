package com.example.hospitalcleaner.business.service;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.business.dto.CleanerEntityDto;
import com.example.hospitalcleaner.business.requests.*;

import java.util.List;

public interface CleanerService {
    DataResult<List<CleanerEntityDto>> getAll();
    Result add(CleanerEntityCRequest cleanerEntityCRequest);
    Result update(CleanerEntityURequest cleanerEntityURequest);
    Result delete(CleanerEntityDRequest cleanerEntityDRequest);
    DataResult<CleanerEntityDto> getById(int id);
    DataResult<List<CleanerEntityDto>> getAllByBossId(int bossId);
}
