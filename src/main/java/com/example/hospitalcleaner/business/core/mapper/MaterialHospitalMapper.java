package com.example.hospitalcleaner.business.core.mapper;

import com.example.hospitalcleaner.business.dto.MaterialEntityDto;
import com.example.hospitalcleaner.business.dto.MaterialHospitalEntityDto;
import com.example.hospitalcleaner.business.requests.MaterialHospitalEntityCRequest;
import com.example.hospitalcleaner.business.requests.MaterialHospitalEntityURequest;
import com.example.hospitalcleaner.entity.MaterialEntity;
import com.example.hospitalcleaner.entity.MaterialHospitalEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MaterialHospitalMapper {

    @Mapping(source ="hospitalId",target ="hospital.id" )
    @Mapping(source ="materialId",target ="material.id" )
    MaterialHospitalEntity materialHospitalCreateToEntity(MaterialHospitalEntityCRequest materialHospitalEntityCRequest);
    @Mapping(source ="hospitalId",target ="hospital.id" )
    @Mapping(source ="materialId",target ="material.id" )
    MaterialHospitalEntity materialHospitalUpdateToEntity(MaterialHospitalEntityURequest materialHospitalEntityURequest);
    @Mapping(source ="hospital.id",target ="hospitalId" )
    @Mapping(source ="material.id",target ="materialId" )
    @Mapping(source ="hospital.name",target ="hospitalName" )
    @Mapping(source ="material.name",target ="materialName" )
    List<MaterialHospitalEntityDto> materialEntitiesToDto(List<MaterialHospitalEntity> materialEntities);


}
