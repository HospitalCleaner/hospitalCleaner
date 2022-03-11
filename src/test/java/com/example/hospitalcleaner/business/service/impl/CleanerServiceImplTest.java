package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.CleanerMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.ErrorDataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.core.results.SuccessDataResult;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.business.dto.CleanerEntityDto;
import com.example.hospitalcleaner.business.requests.CleanerEntityCRequest;
import com.example.hospitalcleaner.business.requests.CleanerEntityDRequest;
import com.example.hospitalcleaner.business.requests.CleanerEntityURequest;
import com.example.hospitalcleaner.business.service.BossService;
import com.example.hospitalcleaner.dataAccess.CleanerEntityRepository;
import com.example.hospitalcleaner.entity.BossEntity;
import com.example.hospitalcleaner.entity.CleanerEntity;
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
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CleanerServiceImplTest {

    @InjectMocks
    private CleanerServiceImpl cleanerService;

    @Mock
    private CleanerEntityRepository cleanerEntityRepository;

    @Spy
    private CleanerMapper cleanerMapper= Mappers.getMapper(CleanerMapper.class);

    @Mock
    private BossService bossService;

    @Test
    public void testGetAll() {
        List<CleanerEntity> cleanerEntities=new ArrayList<>();
        for(int i=0;i<3;i++){
            cleanerEntities.add(new CleanerEntity());
        }
        List<CleanerEntityDto> cleanerEntityDtos=cleanerMapper.cleanerEntityToDtos(cleanerEntities);
        Mockito.when(cleanerEntityRepository.findAll()).thenReturn(cleanerEntities);
        Mockito.when(cleanerMapper.cleanerEntityToDtos(cleanerEntities)).thenReturn(cleanerEntityDtos);

        DataResult<List<CleanerEntityDto>> result= cleanerService.getAll();

        assertEquals(cleanerEntityDtos,result.getData());
        assertTrue(result.isSuccess());
        assertEquals(3,result.getData().size());


    }

    @Test
    public void testAddWhenGivenBossIdExists() {
        CleanerEntityCRequest cleanerEntityCRequest=new CleanerEntityCRequest();
        cleanerEntityCRequest.setEmail("test-email");
        cleanerEntityCRequest.setPassword("test-password");
        cleanerEntityCRequest.setName("test-name");
        cleanerEntityCRequest.setSurName("test-surname");
        cleanerEntityCRequest.setBossId(1);
        BossEntityDto bossEntityDto=new BossEntityDto();
        Mockito.when(bossService.getById(1)).thenReturn(new SuccessDataResult<>(bossEntityDto));
        CleanerEntity cleanerEntity=cleanerMapper.cleanerCreateToEntity(cleanerEntityCRequest);
        //Mockito.when(cleanerEntityRepository.save(Mockito.any())).thenReturn(cleanerEntity);
        Result result=cleanerService.add(cleanerEntityCRequest);

        assertEquals("eklendi.",result.getMessage());
        assertTrue(result.isSuccess());
    }

    @Test
    public void testAddWhenGivenBossIdNotExists() {
        CleanerEntityCRequest cleanerEntityCRequest=new CleanerEntityCRequest();
        cleanerEntityCRequest.setEmail("test-email");
        cleanerEntityCRequest.setPassword("test-password");
        cleanerEntityCRequest.setName("test-name");
        cleanerEntityCRequest.setSurName("test-surname");
        cleanerEntityCRequest.setBossId(1);

        Mockito.when(bossService.getById(1)).thenReturn(new ErrorDataResult<>(null));

        Result result=cleanerService.add(cleanerEntityCRequest);

        assertEquals("boss bulunamadı.",result.getMessage());
        assertFalse(result.isSuccess());

    }

    @Test
    public void testUpdateWhenGivenIdNotExists() {

        CleanerEntityURequest cleanerEntityURequest=new CleanerEntityURequest();
        Mockito.when(cleanerEntityRepository.findById(Mockito.anyInt())).thenReturn(Optional.empty());
        Result result=cleanerService.update(cleanerEntityURequest);

        assertEquals("cleaner bulunamadı.",result.getMessage());
        assertFalse(result.isSuccess());

    }

    @Test
    public void testUpdateWhenGivenIdExists() {
        CleanerEntityURequest cleanerEntityURequest=new CleanerEntityURequest();
        cleanerEntityURequest.setId(1);
        cleanerEntityURequest.setEmail("test-email");
        cleanerEntityURequest.setPassword("test-password");
        cleanerEntityURequest.setName("test-name");
        cleanerEntityURequest.setSurName("test-surname");
        cleanerEntityURequest.setBossId(1);
        cleanerEntityURequest.setIsActive(1);
        cleanerEntityURequest.setNumber("12345");

        CleanerEntity cleanerEntity=new CleanerEntity();
        Optional<CleanerEntity> optionalCleanerEntity=Optional.of(cleanerEntity);
        Mockito.when(cleanerEntityRepository.findById(1)).thenReturn(optionalCleanerEntity);
        cleanerEntity=cleanerMapper.cleanerUpdateToEntity(cleanerEntityURequest);
        //Mockito.when(cleanerEntityRepository.save(cleanerEntity)).thenReturn(cleanerEntity);

        Result result=cleanerService.update(cleanerEntityURequest);

        assertEquals("güncellendi",result.getMessage());
    }

    @Test
    public void testDeleteWhenGivenIdNotExists() {
        CleanerEntityDRequest cleanerEntityDRequest=new CleanerEntityDRequest();
        Mockito.when(cleanerEntityRepository.findById(Mockito.anyInt())).thenReturn(Optional.empty());

        Result result=cleanerService.delete(cleanerEntityDRequest);

        assertEquals("cleaner bulunamadı.",result.getMessage());
        assertFalse(result.isSuccess());

    }

    @Test
    public void testDeleteWhenGivenIdExists() {
        CleanerEntityDRequest cleanerEntityDRequest=new CleanerEntityDRequest();
        cleanerEntityDRequest.setId(1);

        CleanerEntity cleanerEntity=new CleanerEntity();
        Optional<CleanerEntity> optionalCleanerEntity=Optional.of(cleanerEntity);
        Mockito.when(cleanerEntityRepository.findById(1)).thenReturn(optionalCleanerEntity);

        assertNotNull(optionalCleanerEntity);
        Result result=this.cleanerService.delete(cleanerEntityDRequest);

        assertEquals("silindi.",result.getMessage());
        assertTrue(result.isSuccess());

    }

    @Test
    public void testGetByIdWhenGivenIdExists() {
        CleanerEntity cleanerEntity=new CleanerEntity();
        cleanerEntity.setId(1);
        cleanerEntity.setEmail("test-email");
        cleanerEntity.setPassword("test-password");
        cleanerEntity.setName("test-name");
        cleanerEntity.setSurName("test-surname");
        Mockito.when(cleanerEntityRepository.existsById(Mockito.anyInt())).thenReturn(true);
        Mockito.when(cleanerEntityRepository.getById(1)).thenReturn(cleanerEntity);
        CleanerEntityDto cleanerEntityDto=cleanerMapper.cleanerEntityToDto(cleanerEntity);
        Mockito.when(cleanerMapper.cleanerEntityToDto(cleanerEntity)).thenReturn(cleanerEntityDto);

        DataResult<?> result=cleanerService.getById(1);

        assertEquals(cleanerEntityDto,result.getData());

    }

    @Test
    public void testGetByIdWhenGivenIdNotExists() {
        Mockito.when(cleanerEntityRepository.existsById(Mockito.anyInt())).thenReturn(false);

        DataResult<?> result=cleanerService.getById(Mockito.anyInt());

        assertEquals(null,result.getData());
        assertNull(result.getData());
        assertFalse(result.isSuccess());
    }

    @Test
    public void testGetAllByBossIdWhenGivenIdNotExists(){
        Mockito.when(bossService.getById(Mockito.anyInt())).thenReturn(new ErrorDataResult<>(null));
        DataResult<List<CleanerEntityDto>> result = cleanerService.getAllByBossId(Mockito.anyInt());
        assertNull(result.getData());
       // assertEquals(2,result.getData().size());
        assertFalse(result.isSuccess());

    }

    @Test
    public void testGetAllByBossId() {
        BossEntity bossEntity=new BossEntity();
        bossEntity.setId(1);
        List<CleanerEntity> cleanerEntities=new ArrayList<>();
        for(int i=0;i<5;i++){
            CleanerEntity cleanerEntity = new CleanerEntity();
            cleanerEntity.setBoss(bossEntity);
            cleanerEntities.add(cleanerEntity);
        }

        Mockito.when(bossService.getById(Mockito.anyInt())).thenReturn(new SuccessDataResult<>(null));
        Mockito.when(cleanerEntityRepository.getAllByBossId(bossEntity.getId())).thenReturn(cleanerEntities);

        List<CleanerEntityDto> cleanerEntityDtos=cleanerMapper.cleanerEntityToDtos(cleanerEntities);
        Mockito.when(cleanerMapper.cleanerEntityToDtos(cleanerEntities)).thenReturn(cleanerEntityDtos);
        DataResult<List<CleanerEntityDto>> result=cleanerService.getAllByBossId(1);

        assertEquals(cleanerEntityDtos,result.getData());
        assertTrue(result.isSuccess());
        assertEquals(cleanerEntityDtos.size(),result.getData().size());

    }
}