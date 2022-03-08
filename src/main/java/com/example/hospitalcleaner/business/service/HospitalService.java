package com.example.hospitalcleaner.business.service;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.CleanerEntityDto;
import com.example.hospitalcleaner.business.dto.HospitalEntityDto;
import com.example.hospitalcleaner.business.requests.*;

import java.util.List;

public interface HospitalService {
    DataResult<List<HospitalEntityDto>> getAll();
    Result add(HospitalEntityCRequest hospitalEntityCRequest);
    Result update(HospitalEntityURequest hospitalEntityURequest);
    Result delete(HospitalEntityDRequest hospitalEntityDRequest);
}
