package com.example.hospitalcleaner.business.core.mapper;

import com.example.hospitalcleaner.business.dto.HospitalEntityDto;
import com.example.hospitalcleaner.business.requests.HospitalEntityCRequest;
import com.example.hospitalcleaner.business.requests.HospitalEntityURequest;
import com.example.hospitalcleaner.entity.CleanerEntity;
import com.example.hospitalcleaner.entity.HospitalEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HospitalMapper {

    HospitalEntity hospitalCreateToEntity(HospitalEntityCRequest hospitalEntityCRequest);

    HospitalEntity hospitalUpdateToEntity(HospitalEntityURequest hospitalEntityURequest);

    List<HospitalEntityDto> hospitalEntitytoDtos(List<HospitalEntity> hospitalEntities);





}
