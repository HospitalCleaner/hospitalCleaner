package com.example.hospitalcleaner.controller;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.FeedbackEntityDto;
import com.example.hospitalcleaner.business.requests.FeedbackEntityCRequest;
import com.example.hospitalcleaner.business.requests.FeedbackEntityDRequest;
import com.example.hospitalcleaner.business.requests.FeedbackEntityURequest;
import com.example.hospitalcleaner.business.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("getAll")
    public DataResult<List<FeedbackEntityDto>> getAll(){
        return this.feedbackService.getAll();
    }

    @GetMapping("getAllByRoomId")
    public DataResult<List<FeedbackEntityDto>> getAllByRoomId( @RequestParam int roomId){
        return this.feedbackService.getByRoomId(roomId);
    }

    @PostMapping("add")
    public Result add(@RequestBody FeedbackEntityCRequest feedbackEntityCRequest){
        return this.feedbackService.add(feedbackEntityCRequest);
    }

    @PutMapping("update")
    public Result update(FeedbackEntityURequest feedbackEntityURequest){
        return this.feedbackService.update(feedbackEntityURequest);
    }
    @DeleteMapping("delete")
    public Result delete(FeedbackEntityDRequest feedbackEntityDRequest){
        return this.feedbackService.delete(feedbackEntityDRequest);
    }

}
