package com.example.hospitalcleaner.controller;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.MaterialEntityDto;
import com.example.hospitalcleaner.business.requests.MaterialEntityCRequest;
import com.example.hospitalcleaner.business.requests.MaterialEntityDRequest;
import com.example.hospitalcleaner.business.requests.MaterialEntityURequest;
import com.example.hospitalcleaner.business.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/material")
public class MaterialController {
    @Autowired
    private MaterialService materialService;


    @GetMapping("getAll")
    public DataResult<List<MaterialEntityDto>> getAll(){
        return this.materialService.getAll();
    }

    @PostMapping("add")
    public Result add(@RequestBody MaterialEntityCRequest materialEntityCRequest){
        return this.materialService.add(materialEntityCRequest);
    }

    @PutMapping("update")
    public Result update(@RequestBody MaterialEntityURequest materialEntityURequest){
        return this.materialService.update(materialEntityURequest);
    }

    @DeleteMapping("delete")
    public Result add(@RequestBody MaterialEntityDRequest materialEntityDRequest){
        return this.materialService.delete(materialEntityDRequest);
    }


}
