package com.example.hospitalcleaner.business.core.mapper;

import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.business.requests.BossEntityCRequest;
import com.example.hospitalcleaner.business.requests.BossEntityURequest;
import com.example.hospitalcleaner.business.service.BossService;
import com.example.hospitalcleaner.entity.BossEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BossMapper {

    //BossEntity bossDtoToEntity(BossEntityDto bossEntityDto);

    BossEntity bossCreateToEntity(BossEntityCRequest entityCRequest);
    BossEntity bossUpdateToEntity(BossEntityURequest bossEntityURequest);
    BossEntityDto bossEntityToDto(BossEntity bossEntity);
    List<BossEntityDto> toBossDtoList(List<BossEntity> bossEntities);

}
