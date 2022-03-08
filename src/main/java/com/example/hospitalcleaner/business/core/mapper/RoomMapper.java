package com.example.hospitalcleaner.business.core.mapper;


import com.example.hospitalcleaner.business.dto.RoomEntityDto;
import com.example.hospitalcleaner.business.requests.RoomEntityCRequest;
import com.example.hospitalcleaner.business.requests.RoomEntityURequest;
import com.example.hospitalcleaner.entity.RoomEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoomMapper {

    @Mapping(source = "cleaner.id",target = "cleanerId")
    @Mapping(source = "hospital.id",target = "hospitalId")
    List<RoomEntityDto> roomEntitytoDto(List<RoomEntity> roomEntities);

    @Mapping(source = "cleanerId" , target = "cleaner.id")
    @Mapping(source = "hospitalId",target = "hospital.id")
    RoomEntity roomCreateToEntity(RoomEntityCRequest roomEntityCRequest);

    @Mapping(source = "cleanerId" , target = "cleaner.id")
    @Mapping(source = "hospitalId",target = "hospital.id")
    RoomEntity roomUpdateToEntity(RoomEntityURequest roomEntityURequest);
}
