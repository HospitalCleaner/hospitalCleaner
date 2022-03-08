package com.example.hospitalcleaner.business.core.mapper;

import com.example.hospitalcleaner.business.dto.FeedbackEntityDto;
import com.example.hospitalcleaner.business.requests.FeedbackEntityCRequest;
import com.example.hospitalcleaner.business.requests.FeedbackEntityURequest;
import com.example.hospitalcleaner.entity.FeedbackEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FeedbackMapper {

    @Mapping(source ="roomId",target ="room.id" )
    FeedbackEntity feedbackCreateToEntity (FeedbackEntityCRequest feedbackEntityCRequest);
    @Mapping(source ="roomId",target ="room.id" )
    FeedbackEntity feedbackUpdateToEntity (FeedbackEntityURequest feedbackEntityURequest);
    @Mapping(source = "room.id" , target = "roomId")
    List<FeedbackEntityDto> feedbackEntitytoDtos(List<FeedbackEntity> feedbackEntities);



}
