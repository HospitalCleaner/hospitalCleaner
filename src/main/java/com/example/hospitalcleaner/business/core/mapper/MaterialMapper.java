package com.example.hospitalcleaner.business.core.mapper;


import com.example.hospitalcleaner.business.dto.MaterialEntityDto;
import com.example.hospitalcleaner.business.requests.MaterialEntityCRequest;
import com.example.hospitalcleaner.business.requests.MaterialEntityURequest;
import com.example.hospitalcleaner.entity.MaterialEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MaterialMapper {

    MaterialEntity materialCreateToEntity(MaterialEntityCRequest materialEntityCRequest);
    MaterialEntity materialUpdateToEntity(MaterialEntityURequest materialEntityURequest);


    List<MaterialEntityDto> materialEntityToDto(List<MaterialEntity> materialEntities);


}
