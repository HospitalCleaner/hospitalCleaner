package com.example.hospitalcleaner.business.service;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.dto.UserEntityDto;

import java.util.List;
public interface UserService {
    DataResult<List<UserEntityDto>> getAll();

}
