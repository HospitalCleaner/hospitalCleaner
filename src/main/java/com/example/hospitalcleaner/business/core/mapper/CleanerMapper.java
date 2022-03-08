package com.example.hospitalcleaner.business.core.mapper;


import com.example.hospitalcleaner.business.dto.CleanerEntityDto;
import com.example.hospitalcleaner.business.requests.CleanerEntityCRequest;
import com.example.hospitalcleaner.business.requests.CleanerEntityDRequest;
import com.example.hospitalcleaner.business.requests.CleanerEntityURequest;
import com.example.hospitalcleaner.entity.CleanerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CleanerMapper {

    @Mapping(source ="bossId",target ="boss.id"  )
    CleanerEntity cleanerCreateToEntity(CleanerEntityCRequest cleanerEntityCRequest);
    @Mapping(source ="bossId",target ="boss.id"  )
    CleanerEntity cleanerUpdateToEntity(CleanerEntityURequest cleanerEntityURequest);
    CleanerEntity cleanerDeleteToEntity(CleanerEntityDRequest cleanerEntityDRequest);
    List<CleanerEntityDto> cleanerEntityToDtos(List<CleanerEntity>cleanerEntities );
    CleanerEntityDto cleanerEntityToDto(CleanerEntity cleanerEntity);

}
