package com.example.hospitalcleaner.business.service;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.MaterialEntityDto;
import com.example.hospitalcleaner.business.dto.MaterialHospitalEntityDto;
import com.example.hospitalcleaner.business.requests.*;

import java.util.List;

public interface MaterialHospitalService {
    DataResult<List<MaterialHospitalEntityDto>> getAll();
    Result add(MaterialHospitalEntityCRequest materialHospitalEntityCRequest);
    Result update(MaterialHospitalEntityURequest materialHospitalEntityURequest);
    Result delete(MaterialHospitalEntityDRequest materialHospitalEntityDRequest);
    DataResult<List<MaterialHospitalEntityDto>> getAllByHospitalId(int hospitalId);
    DataResult<List<MaterialHospitalEntityDto>> getRequirements(int quantity);

}
