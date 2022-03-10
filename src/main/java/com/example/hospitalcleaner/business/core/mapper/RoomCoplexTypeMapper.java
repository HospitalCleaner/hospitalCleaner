package com.example.hospitalcleaner.business.core.mapper;


import com.example.hospitalcleaner.entity.RoomEntity;
import com.example.hospitalcleaner.entity.complexType.RoomEntityDtoComplexType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoomCoplexTypeMapper {

    RoomEntityDtoComplexType roomEntitytoComplexType(RoomEntity room);


}
