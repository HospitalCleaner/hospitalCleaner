package com.example.hospitalcleaner.controller;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.HospitalEntityDto;
import com.example.hospitalcleaner.business.requests.HospitalEntityCRequest;
import com.example.hospitalcleaner.business.requests.HospitalEntityDRequest;
import com.example.hospitalcleaner.business.requests.HospitalEntityURequest;
import com.example.hospitalcleaner.business.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;


    @GetMapping("getALl")
    public DataResult<List<HospitalEntityDto>> getAll(){
        return this.hospitalService.getAll();
    }

    @PostMapping("add")
    public Result add(@RequestBody HospitalEntityCRequest hospitalEntityCRequest){
        return this.hospitalService.add(hospitalEntityCRequest);
    }
    @PutMapping("update")
    public Result update(@RequestBody HospitalEntityURequest hospitalEntityURequest){
        return this.hospitalService.update(hospitalEntityURequest);
    }

    @DeleteMapping("delete")
    public Result delete(@RequestBody HospitalEntityDRequest hospitalEntityDRequest){
        return this.hospitalService.delete(hospitalEntityDRequest);
    }


}
