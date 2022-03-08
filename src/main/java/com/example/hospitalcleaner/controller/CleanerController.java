package com.example.hospitalcleaner.controller;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.CleanerEntityDto;
import com.example.hospitalcleaner.business.requests.CleanerEntityCRequest;
import com.example.hospitalcleaner.business.requests.CleanerEntityDRequest;
import com.example.hospitalcleaner.business.requests.CleanerEntityURequest;
import com.example.hospitalcleaner.business.service.CleanerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cleaner")
public class CleanerController {
    @Autowired
    private CleanerService cleanerService;


    @GetMapping("getAll")
    public DataResult<List<CleanerEntityDto>> getAll(){
        return cleanerService.getAll();
    }
    @GetMapping("getById")
    public DataResult<CleanerEntityDto> getById(@RequestParam int cleanerId){
        return this.cleanerService.getById(cleanerId);
    }
    @GetMapping("getAllByBossId")
    public DataResult<List<CleanerEntityDto>> getAllByBossId(@RequestParam int bossId){
        return this.cleanerService.getAllByBossId(bossId);
    }


    @PostMapping("add")
    public Result add(@RequestBody CleanerEntityCRequest cleanerEntityCRequest){
       return this.cleanerService.add(cleanerEntityCRequest);
    }


    @PutMapping("update")
    public Result update(@RequestBody CleanerEntityURequest cleanerEntityURequest){
       return this.cleanerService.update(cleanerEntityURequest);
    }


    @DeleteMapping("delete")
    public Result delete(@RequestBody CleanerEntityDRequest cleanerEntityDRequest){
       return this.cleanerService.delete(cleanerEntityDRequest);
    }
}
