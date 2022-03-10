package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.HospitalMapper;
import com.example.hospitalcleaner.dataAccess.HospitalEntityRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class HospitalServiceImplTest {

    @InjectMocks
    private HospitalServiceImpl hospitalService;

    @Mock
    private HospitalEntityRepository hospitalEntityRepository;

    @Spy
    private HospitalMapper hospitalMapper= Mappers.getMapper(HospitalMapper.class);

    @Test
    public void testGetAll() {
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void testUpdateWhenGivenIdExists() {
    }

    @Test
    public void testUpdateWhenGivenIdNotExists() {
    }

    @Test
    public void testDeleteWhenGivenIdExists() {
    }

    @Test
    public void testDeleteWhenGivenIdNotExists() {
    }
}