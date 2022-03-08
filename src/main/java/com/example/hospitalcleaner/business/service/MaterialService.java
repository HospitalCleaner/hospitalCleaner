package com.example.hospitalcleaner.business.service;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.MaterialEntityDto;
import com.example.hospitalcleaner.business.requests.MaterialEntityCRequest;
import com.example.hospitalcleaner.business.requests.MaterialEntityDRequest;
import com.example.hospitalcleaner.business.requests.MaterialEntityURequest;

import java.util.List;

public interface MaterialService {

    DataResult<List<MaterialEntityDto>> getAll();
    Result add(MaterialEntityCRequest materialEntityCRequest);
    Result update(MaterialEntityURequest materialEntityURequest);
    Result delete(MaterialEntityDRequest materialEntityDRequest);






}
