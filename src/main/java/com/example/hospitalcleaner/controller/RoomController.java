package com.example.hospitalcleaner.controller;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.RoomEntityDto;
import com.example.hospitalcleaner.business.requests.RoomEntityCRequest;
import com.example.hospitalcleaner.business.requests.RoomEntityDRequest;
import com.example.hospitalcleaner.business.requests.RoomEntityURequest;
import com.example.hospitalcleaner.business.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("getAll")
    public DataResult<List<RoomEntityDto>> getAll(){
        return this.roomService.getAll();
    }

    @GetMapping("getAllByHospital")
    public DataResult<List<RoomEntityDto>> getAllByHospitalId(@RequestParam int hospitalId){
        return this.roomService.getAllByHospitalId(hospitalId);
    }
    @GetMapping("getALlByRoomId")
    public DataResult<List<RoomEntityDto>> getALlByRoomId(@RequestParam int cleanerId){
        return this.roomService.getAllByCleanerId(cleanerId);
    }


    @PostMapping("add")
    public Result add(@RequestBody RoomEntityCRequest roomEntityCRequest){
        return this.roomService.add(roomEntityCRequest);
    }

    @PutMapping("update")
    public Result update(@RequestBody RoomEntityURequest roomEntityURequest){
        return this.roomService.update(roomEntityURequest);

    }

    @DeleteMapping("delete")
    public Result delete(@RequestBody RoomEntityDRequest roomEntityDRequest){
        return this.roomService.delete(roomEntityDRequest);
    }



}
