package com.example.hospitalcleaner.controller;


import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.business.requests.BossEntityCRequest;
import com.example.hospitalcleaner.business.service.BossService;
import com.example.hospitalcleaner.entity.BossEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("api/boss")
public class BossController {

    private BossService bossService;

    @Autowired
    public BossController(BossService bossService) {
        this.bossService = bossService;
    }

    @GetMapping("getAll")
    public DataResult<List<BossEntityDto>> getAll()  {
        return this.bossService.getAll();
    }

    @PostMapping("add")
    public Result add(@RequestBody BossEntityCRequest bossEntityCRequest) {
        return this.bossService.add(bossEntityCRequest);
    }

    @GetMapping("getById")
    public DataResult<BossEntityDto> getById(int id){
        return this.bossService.getById(id);
    }

}
