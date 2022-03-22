package com.example.hospitalcleaner.business.service.impl;

import com.example.hospitalcleaner.business.core.mapper.MaterialHospitalMapper;
import com.example.hospitalcleaner.business.core.results.*;
import com.example.hospitalcleaner.business.dto.MaterialHospitalEntityDto;
import com.example.hospitalcleaner.business.requests.MaterialHospitalEntityCRequest;
import com.example.hospitalcleaner.business.requests.MaterialHospitalEntityDRequest;
import com.example.hospitalcleaner.business.requests.MaterialHospitalEntityURequest;
import com.example.hospitalcleaner.business.service.MaterialHospitalService;
import com.example.hospitalcleaner.business.service.MaterialService;
import com.example.hospitalcleaner.dataAccess.MaterialHospitalEntityRepository;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialHospitalServiceImpl implements MaterialHospitalService {

    @Autowired
    private MaterialHospitalMapper materialHospitalMapper;

   @Autowired
   private MaterialHospitalEntityRepository materialHospitalEntityRepository;

    @Override
    public DataResult<List<MaterialHospitalEntityDto>> getAll() {
        return new SuccessDataResult<>(this.materialHospitalMapper.materialEntitiesToDto(this.materialHospitalEntityRepository.findAll()));
    }

    @Override
    public DataResult<List<MaterialHospitalEntityDto>> getAllByHospitalId(int hospitalId) {
        if (!this.materialHospitalEntityRepository.existsByHospitalId(hospitalId)){
            return new ErrorDataResult<>(null,"hastane bulunamadı");
        }
        return new SuccessDataResult<>(
                this.materialHospitalMapper.materialEntitiesToDto(
                        this.materialHospitalEntityRepository
                                .getAllByHospitalId(hospitalId)));
    }

    @Override
    public DataResult<List<MaterialHospitalEntityDto>> getRequirements(int quantity) {
        return new SuccessDataResult<>(this.materialHospitalEntityRepository.getAllByRequirement(quantity));
    }

    @Override
    public Result add(MaterialHospitalEntityCRequest materialHospitalEntityCRequest) {
        this.materialHospitalEntityRepository.save(materialHospitalMapper.materialHospitalCreateToEntity(materialHospitalEntityCRequest));
        return new SuccessResult("eklendi");
    }

    @Override
    public Result update(MaterialHospitalEntityURequest materialHospitalEntityURequest) {
        this.materialHospitalEntityRepository.save(materialHospitalMapper.materialHospitalUpdateToEntity(materialHospitalEntityURequest));
        return new SuccessResult("güncellendi.");
    }

    @Override
    public Result delete(MaterialHospitalEntityDRequest materialHospitalEntityDRequest) {
        this.materialHospitalEntityRepository.deleteById(materialHospitalEntityDRequest.getId());
        return new SuccessResult("silindi");
    }


}
