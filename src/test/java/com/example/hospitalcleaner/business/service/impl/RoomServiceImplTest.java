package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.BossMapper;
import com.example.hospitalcleaner.business.core.mapper.RoomCoplexTypeMapper;
import com.example.hospitalcleaner.business.core.mapper.RoomMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.SuccessDataResult;
import com.example.hospitalcleaner.business.service.FeedbackService;
import com.example.hospitalcleaner.business.service.RoomService;
import com.example.hospitalcleaner.dataAccess.RoomEntityRepository;
import com.example.hospitalcleaner.entity.RoomEntity;
import com.example.hospitalcleaner.entity.complexType.RoomEntityDtoComplexType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RoomServiceImplTest {


    @InjectMocks
    private RoomServiceImpl roomService;

    @Mock
    private RoomEntityRepository roomEntityRepository;

    @Mock
    private FeedbackService feedbackService;

    @Spy
    private RoomCoplexTypeMapper roomCoplexTypeMapper = Mappers.getMapper(RoomCoplexTypeMapper.class);

    @Spy
    private RoomMapper roomMapper=Mappers.getMapper(RoomMapper.class);


    @Test
    void testgetRoomAvaregaStarWhenGivenExists() {
        RoomEntity room = new RoomEntity();
        room.setId(1);
        room.setRoomName("asdfedf");

        RoomEntityDtoComplexType roomEntityDtoComplexType = roomCoplexTypeMapper.roomEntitytoComplexType(room);
        Mockito.when(roomEntityRepository.existsById(Mockito.anyInt())).thenReturn(true);
        Mockito.when(roomEntityRepository.getById(Mockito.anyInt())).thenReturn(room);
        Mockito.when(roomCoplexTypeMapper.roomEntitytoComplexType(room)).thenReturn(roomEntityDtoComplexType);
        Mockito.when(feedbackService.getByRoomAverageStar(Mockito.anyInt())).thenReturn(new SuccessDataResult<>(3.2));
        roomEntityDtoComplexType.setStar(3.2);
        DataResult<RoomEntityDtoComplexType> result = roomService.getRoomAvaregaStar(Mockito.anyInt());
        assertEquals(roomEntityDtoComplexType.getStar(),result.getData().getStar());
        assertTrue(result.isSuccess());




    }

    @Test
    public void testgetRoomAvaregaStarWhenGivenNotExists(){


        Mockito.when(roomEntityRepository.existsById(Mockito.anyInt())).thenReturn(false);
        DataResult<RoomEntityDtoComplexType> result =roomService.getRoomAvaregaStar(Mockito.anyInt());

        assertNull(result.getData());
        assertEquals("oda bulunamadı.",result.getMessage());
        assertFalse(result.isSuccess());

    }

}