package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.business.dto.MaterialHospitalEntityDto;
import com.example.hospitalcleaner.entity.MaterialHospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface MaterialHospitalEntityRepository extends JpaRepository<MaterialHospitalEntity, Integer> {

    List<MaterialHospitalEntity> getAllByHospitalId(int hospitalId);


    @Query("SELECT new com.example.hospitalcleaner.business.dto.MaterialHospitalEntityDto"
    +" (m.id,m.name,h.id,h.name,h.address,mh.quantity,mh.expiryDate)"
            +" FROM MaterialHospitalEntity mh INNER JOIN mh.hospital h INNER JOIN mh.material m where mh.quantity<:quantity")
    List<MaterialHospitalEntityDto> getAllByRequirement(int quantity);

    boolean existsByHospitalId(int hospitalId);

}