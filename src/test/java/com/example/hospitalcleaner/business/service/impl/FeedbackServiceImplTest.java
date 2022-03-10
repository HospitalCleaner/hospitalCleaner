package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.FeedbackMapper;
import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.FeedbackEntityDto;
import com.example.hospitalcleaner.business.requests.FeedbackEntityDRequest;
import com.example.hospitalcleaner.business.requests.FeedbackEntityURequest;
import com.example.hospitalcleaner.dataAccess.FeedbackEntityRepository;
import com.example.hospitalcleaner.entity.FeedbackEntity;
import com.example.hospitalcleaner.entity.RoomEntity;
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
public class FeedbackServiceImplTest {

    @InjectMocks
    private FeedbackServiceImpl feedbackService;

    @Mock
    private FeedbackEntityRepository feedbackEntityRepository;

    @Spy
    private FeedbackMapper feedbackMapper= Mappers.getMapper(FeedbackMapper.class);

    @Test
    public void testGetAll() {
        List<FeedbackEntity> feedbackEntities=new ArrayList<>();
        Mockito.when(feedbackEntityRepository.findAll()).thenReturn(feedbackEntities);
        List<FeedbackEntityDto> feedbackEntityDtos=feedbackMapper.feedbackEntitytoDtos(feedbackEntities);

        DataResult<List<FeedbackEntityDto>> result=feedbackService.getAll();

        assertEquals(feedbackEntityDtos,result.getData());
    }

    @Test
    public void testAdd(){
    }

    @Test
    public void testUpdateWhenGivenIdExists() {
        FeedbackEntityURequest feedbackEntityURequest=new FeedbackEntityURequest();
        feedbackEntityURequest.setId(1);
        FeedbackEntity feedbackEntity=new FeedbackEntity();
        Optional<FeedbackEntity> optionalFeedbackEntity=Optional.of(feedbackEntity);
        Mockito.when(feedbackEntityRepository.findById(1)).thenReturn(optionalFeedbackEntity);

        Result result=feedbackService.update(feedbackEntityURequest);
        assertEquals("güncellendi",result.getMessage());
        assertTrue(result.isSuccess());
    }

    @Test
    public void testUpdateWhenGivenIdNotExists() {
        FeedbackEntityURequest feedbackEntityURequest=new FeedbackEntityURequest();
        feedbackEntityURequest.setId(1);
        Mockito.when(feedbackEntityRepository.findById(1)).thenReturn(Optional.empty());

        Result result=feedbackService.update(feedbackEntityURequest);
        assertEquals("feedback bulunamadı.",result.getMessage());
        assertFalse(result.isSuccess());
    }

    @Test
    public void testDeleteWhenGivenIdExists() {
        FeedbackEntityDRequest feedbackEntityDRequest=new FeedbackEntityDRequest();
        feedbackEntityDRequest.setId(1);
        FeedbackEntity feedbackEntity=new FeedbackEntity();
        Optional<FeedbackEntity> optionalFeedbackEntity=Optional.of(feedbackEntity);
        Mockito.when(feedbackEntityRepository.findById(1)).thenReturn(optionalFeedbackEntity);

        Result result=feedbackService.delete(feedbackEntityDRequest);

        assertEquals("silindi.",result.getMessage());
        assertTrue(result.isSuccess());
    }

    @Test
    public void testDeleteWhenGivenIdNotExists() {
        FeedbackEntityDRequest feedbackEntityDRequest=new FeedbackEntityDRequest();
        feedbackEntityDRequest.setId(1);
        Mockito.when(feedbackEntityRepository.findById(1)).thenReturn(Optional.empty());

        Result result=feedbackService.delete(feedbackEntityDRequest);

        assertEquals("feedback bulunamadı.",result.getMessage());
        assertFalse(result.isSuccess());
    }

    @Test
    public void testGetByRoomId() {
        RoomEntity roomEntity=new RoomEntity();
        roomEntity.setId(1);
        List<FeedbackEntity> feedbackEntities=new ArrayList<>();
        for(FeedbackEntity feedbackEntity:feedbackEntities){
            feedbackEntity.setRoom(roomEntity);
        }
        Mockito.when(feedbackEntityRepository.getAllByRoomId(Mockito.anyInt())).thenReturn(feedbackEntities);
        List<FeedbackEntityDto> feedbackEntityDtos=feedbackMapper.feedbackEntitytoDtos(feedbackEntities);

        DataResult<List<FeedbackEntityDto>> result=feedbackService.getByRoomId(1);

        assertEquals(feedbackEntityDtos,result.getData());
        assertTrue(result.isSuccess());
    }
}