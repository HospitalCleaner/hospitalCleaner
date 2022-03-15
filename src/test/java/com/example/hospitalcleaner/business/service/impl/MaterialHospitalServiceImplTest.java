package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.MaterialHospitalMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.dto.MaterialHospitalEntityDto;
import com.example.hospitalcleaner.dataAccess.MaterialHospitalEntityRepository;
import com.example.hospitalcleaner.entity.HospitalEntity;
import com.example.hospitalcleaner.entity.MaterialHospitalEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MaterialHospitalServiceImplTest {
    @InjectMocks
   private MaterialHospitalServiceImpl materialHospitalService;

    @Mock
    private MaterialHospitalEntityRepository materialHospitalEntityRepository;

    @Spy
    private MaterialHospitalMapper materialHospitalMapper= Mappers.getMapper(MaterialHospitalMapper.class);


    @Test
    void testgetAllByHospitalIdWhenHospitalIdExists() {
        MaterialHospitalEntity materialHospitalEntity = new MaterialHospitalEntity();
        HospitalEntity hospital = new HospitalEntity();
        hospital.setId(1);
        materialHospitalEntity.setHospital(hospital);
        List<MaterialHospitalEntity> materialHospitalEntities = new ArrayList<>();
        for (int i=0;i<5;i++){
            materialHospitalEntity.setId(i);
            materialHospitalEntities.add(materialHospitalEntity);
        }
        List<MaterialHospitalEntityDto> materialHospitalEntityDtos = this.materialHospitalMapper.materialEntitiesToDto(materialHospitalEntities);


        Mockito.when(this.materialHospitalEntityRepository.existsByHospitalId(Mockito.anyInt())).thenReturn(true);
        Mockito.when(this.materialHospitalEntityRepository.getAllByHospitalId(Mockito.anyInt())).thenReturn(materialHospitalEntities);
        Mockito.when(this.materialHospitalMapper.materialEntitiesToDto(Mockito.any())).thenReturn(materialHospitalEntityDtos);
        DataResult<List<MaterialHospitalEntityDto>> result = this.materialHospitalService.getAllByHospitalId(Mockito.anyInt());

        assertEquals(materialHospitalEntityDtos,result.getData());
        assertEquals(null,result.getMessage());
        assertTrue(result.isSuccess());

    }

    @Test
    void testgetAllByHospitalIdWhenHospitalIdNotExists() {
        Mockito.when(this.materialHospitalEntityRepository.existsByHospitalId(Mockito.anyInt())).thenReturn(false);
        DataResult<List<MaterialHospitalEntityDto>> result = this.materialHospitalService.getAllByHospitalId(Mockito.anyInt());

        assertFalse(result.isSuccess());
        assertEquals(null,result.getData());
        assertEquals("hastane bulunamadı",result.getMessage());

    }



}