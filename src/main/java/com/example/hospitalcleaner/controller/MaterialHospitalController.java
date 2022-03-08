package com.example.hospitalcleaner.controller;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.core.results.Result;
import com.example.hospitalcleaner.business.dto.MaterialHospitalEntityDto;
import com.example.hospitalcleaner.business.requests.MaterialHospitalEntityCRequest;
import com.example.hospitalcleaner.business.requests.MaterialHospitalEntityDRequest;
import com.example.hospitalcleaner.business.requests.MaterialHospitalEntityURequest;
import com.example.hospitalcleaner.business.service.MaterialHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
 @RequestMapping("api/materialHospital")
public class MaterialHospitalController {
    @Autowired
    private MaterialHospitalService materialHospitalService;

    @GetMapping("getAll")
    public DataResult<List<MaterialHospitalEntityDto>> getAll(){
        return this.materialHospitalService.getAll();
    }

    @GetMapping("getByHospitalId")
    public DataResult<List<MaterialHospitalEntityDto>> getByHospitalId(@RequestParam int hospitalId){
        return this.materialHospitalService.getAllByHospitalId(hospitalId);
    }

    @GetMapping("requirement")
    public DataResult<List<MaterialHospitalEntityDto>> getByRequirement(@RequestParam int requirementQuantity){
        return this.materialHospitalService.getRequirements(requirementQuantity);
    }

    @PostMapping("add")
    public Result add(@RequestBody MaterialHospitalEntityCRequest materialHospitalEntityCRequest){
        return this.materialHospitalService.add(materialHospitalEntityCRequest);
    }
    @PutMapping("update")
    public Result update(@RequestBody MaterialHospitalEntityURequest materialHospitalEntityURequest){
        return this.materialHospitalService.update(materialHospitalEntityURequest);
    }

    @DeleteMapping("delete")
    public Result delete(@RequestBody MaterialHospitalEntityDRequest materialHospitalEntityDRequest){
        return this.materialHospitalService.delete(materialHospitalEntityDRequest);
    }
}
