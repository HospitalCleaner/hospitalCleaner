package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.BossMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.business.requests.BossEntityCRequest;
import com.example.hospitalcleaner.business.requests.BossEntityDRequest;
import com.example.hospitalcleaner.business.requests.BossEntityURequest;
import com.example.hospitalcleaner.dataAccess.BossEntityRepository;
import com.example.hospitalcleaner.entity.BossEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
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
public class BossServiceImplTest {

    @InjectMocks
    private BossServiceImpl bossService;

    @Mock
    private BossEntityRepository bossEntityRepository;

    @Spy
    private BossMapper bossMapper= Mappers.getMapper(BossMapper.class);

    @Test
    public void testGetAll() {
        List<BossEntity> bossEntities=new ArrayList<>();
        for(int i=1;i<=5;i++){
            bossEntities.add(new BossEntity());
        }

        Mockito.when(bossEntityRepository.findAll()).thenReturn(bossEntities);
        List<BossEntityDto> bossEntityDtos=bossMapper.toBossDtoList(bossEntities);
        Mockito.when(bossMapper.toBossDtoList(bossEntities)).thenReturn(bossEntityDtos);
        DataResult<List<BossEntityDto>> result=bossService.getAll();

        assertEquals(bossEntityDtos,result.getData());
        assertEquals(5,result.getData().size());

    }

    @Test
    public void when_bossEntityCRequest_Expect_saveBossDb(){

        BossEntityCRequest bossEntityCRequest=new BossEntityCRequest();
        bossEntityCRequest.setDeneme("test-deneme");
        bossEntityCRequest.setEmail("test@test");
        bossEntityCRequest.setName("test-name");
        bossEntityCRequest.setNumber("12345");
        bossEntityCRequest.setSurName("test-surname");
        bossEntityCRequest.setPassword("123");

        BossEntity bossEntity=bossMapper.bossCreateToEntity(bossEntityCRequest);

        Mockito.when(bossEntityRepository.save(Mockito.any())).thenReturn(bossEntity);


        assertEquals(bossEntity,bossService.add(bossEntityCRequest).getData());
        assertTrue(bossService.add(bossEntityCRequest).isSuccess());
    }

    @Test
    public void when_bossEntityURequest_Expect_updateBossDb(){
        BossEntityURequest bossEntityURequest=new BossEntityURequest();
        bossEntityURequest.setId(1);
        bossEntityURequest.setEmail("test-email");
        bossEntityURequest.setName("test-name");
        bossEntityURequest.setSurName("test-surname");
        bossEntityURequest.setNumber("12345");
        bossEntityURequest.setPassword("test");
        bossEntityURequest.setIsActive(1);

        BossEntity bossEntity=new BossEntity();

        Optional<BossEntity> optionalBossEntity=Optional.of(bossEntity);
        Mockito.when(bossEntityRepository.findById(Mockito.eq(1))).thenReturn(optionalBossEntity);
        //assertTrue(optionalBossEntity.isPresent());
        bossEntity=bossMapper.bossUpdateToEntity(bossEntityURequest);
        Mockito.when(bossEntityRepository.save(Mockito.any())).thenReturn(bossEntity);
        BossEntityDto bossEntityDto = bossMapper.bossEntityToDto(bossEntity);
        //olmasa referans farklı oluyor
        Mockito.when(this.bossMapper.bossEntityToDto(Mockito.any())).thenReturn(bossEntityDto);
        DataResult<BossEntityDto> result=this.bossService.update(bossEntityURequest);

        assertEquals("güncellendi.",result.getMessage());
        assertTrue(result.isSuccess());
        //sor referanslar farklı oldugu için hata veriyor ama içindeki veriler birebir aynı
        assertEquals(bossEntityDto,result.getData());


    }

    @Test
    public void when_GivenIdNotExists_Expect_NotUpdate(){
        BossEntityURequest bossEntityURequest=new BossEntityURequest();
        bossEntityURequest.setId(1);
        Mockito.when(bossEntityRepository.findById(Mockito.eq(1))).thenReturn(Optional.empty());

        DataResult<BossEntityDto> result=bossService.update(bossEntityURequest);
        assertEquals("boss bulunamadı.",result.getMessage());
        assertFalse(result.isSuccess());
        assertNull(result.getData());

    }
    //test olmayan ıd verildiginde hatalı donmesi gerekir
    @Test
    public void testDeleteWhenGivenIdNotExists() {

        BossEntityDRequest bossEntityDRequest=new BossEntityDRequest();
        bossEntityDRequest.setId(1);
        Mockito.when(bossEntityRepository.findById(Mockito.eq(1))).thenReturn(Optional.empty());

        DataResult<BossEntityDto> result=bossService.delete(bossEntityDRequest);

        assertEquals("boss bulunamadı.",result.getMessage());
        assertFalse(result.isSuccess());
        assertEquals(null,result.getData());
    }

    @Test
    public void testDeleteWhenGivenIdExists() {
        BossEntity bossEntity=new BossEntity();
        bossEntity.setNumber("012873124");
        bossEntity.setEmail("asdklşfjkajsf@ajskldfaf.com");
        bossEntity.setName("asdklfşjalkf");
        bossEntity.setDeneme("deneme");
        bossEntity.setPassword("ajsdflkşajsf");
        bossEntity.setSurName("ajsdfkljafs");
        bossEntity.setId(1);
        Optional<BossEntity> optionalBossEntity=Optional.of(bossEntity);
        BossEntityDRequest bossEntityDRequest=new BossEntityDRequest();
        bossEntityDRequest.setId(1);
        BossEntityDto bossEntityDto = bossMapper.bossEntityToDto(bossEntity);
        Mockito.when(bossEntityRepository.findById(bossEntityDRequest.getId())).thenReturn(optionalBossEntity);
        Mockito.when(bossEntityRepository.save(bossEntity)).thenReturn(bossEntity);
        Mockito.when(bossMapper.bossEntityToDto(bossEntity)).thenReturn(bossEntityDto);
        DataResult<BossEntityDto> result=bossService.delete(bossEntityDRequest);
        assertEquals("silindi.",result.getMessage());
        assertTrue(result.isSuccess());
        assertEquals(bossEntityDto.getSurName(),result.getData().getSurName());


    }

    @Test
    public  void testGetByIdWhenGivenIdExists() {

        BossEntity bossEntity=new BossEntity();
        bossEntity.setId(15);
        bossEntity.setSurName("kolay");
        Mockito.when(bossEntityRepository.existsById(15)).thenReturn(true);
        Mockito.when(bossEntityRepository.getById(15)).thenReturn(bossEntity);
        BossEntityDto bossEntityDto=bossMapper.bossEntityToDto(bossEntity);
        //yukarda kinin aynısı referanslar farklı oluyor ama degerler aynı
       //  Mockito.when(bossMapper.bossEntityToDto(bossEntity)).thenReturn(bossEntityDto);
        DataResult<BossEntityDto> result=bossService.getById(15);

        assertEquals(bossEntityDto,result.getData());
    }

    @Test
    public  void testGetByIdWhenGivenIdNotExists() {
        Mockito.when(bossEntityRepository.existsById(Mockito.anyInt())).thenReturn(false);

        DataResult<?> result=bossService.getById(Mockito.anyInt());

        assertEquals(null,result.getData());
        assertFalse(result.isSuccess());
        assertNull(result.getData());
    }
}