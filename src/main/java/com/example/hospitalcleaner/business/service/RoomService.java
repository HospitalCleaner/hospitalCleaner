package com.example.hospitalcleaner.business.service;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.FeedbackEntityDto;
import com.example.hospitalcleaner.business.dto.RoomEntityDto;
import com.example.hospitalcleaner.business.requests.*;
import com.example.hospitalcleaner.entity.complexType.RoomEntityDtoComplexType;

import javax.xml.crypto.Data;
import java.util.List;

public interface RoomService {
    DataResult<List<RoomEntityDto>> getAll();
    DataResult<List<RoomEntityDto>> getAllByHospitalId(int hospitalId);
    DataResult<List<RoomEntityDto>> getAllByCleanerId(int cleanerId);

    DataResult<RoomEntityDtoComplexType> getRoomAvaregaStar(int roomId);

    Result add(RoomEntityCRequest roomEntityCRequest);
    Result update(RoomEntityURequest roomEntityURequest);
    Result delete(RoomEntityDRequest roomEntityDRequest);
}
