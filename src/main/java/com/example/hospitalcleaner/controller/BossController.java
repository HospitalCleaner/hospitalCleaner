package com.example.hospitalcleaner.controller;


import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import com.example.hospitalcleaner.business.requests.BossEntityCRequest;
import com.example.hospitalcleaner.business.requests.BossEntityDRequest;
import com.example.hospitalcleaner.business.requests.BossEntityURequest;
import com.example.hospitalcleaner.business.service.BossService;
import com.example.hospitalcleaner.entity.BossEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @GetMapping("getAllPage")
    public DataResult<List<BossEntityDto>> getAllPage(
            @RequestParam(name = "page",required = false,defaultValue = "1")int page,
            @RequestParam(name = "size",required = false,defaultValue = "1")int size){
        return bossService.getAllPage(page,size);
    }


    @GetMapping("getAll")
    public DataResult<List<BossEntityDto>> getAll()  {
        return this.bossService.getAll();
    }

    @PostMapping("add")
    public DataResult<BossEntityDto> add(@RequestBody BossEntityCRequest bossEntityCRequest) {
        return this.bossService.add(bossEntityCRequest);
    }

    @PutMapping("update")
    public DataResult<BossEntityDto> update(@RequestBody BossEntityURequest bossEntityURequest) {
        return this.bossService.update(bossEntityURequest);
    }

    @DeleteMapping("delete")
    public DataResult<BossEntityDto> delete(@RequestBody BossEntityDRequest bossEntityDRequest) {
        return this.bossService.delete(bossEntityDRequest);
    }

    @GetMapping("getById")
    public DataResult<BossEntityDto> getById(int id){
        return this.bossService.getById(id);
    }

    @GetMapping("getByBossId")
    public String getByBossId(int id){
        return this.bossService.getByBossId(id);
    }

}
