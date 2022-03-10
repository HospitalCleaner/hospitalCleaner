package com.example.hospitalcleaner.dataAccess;

import com.example.hospitalcleaner.entity.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FeedbackEntityRepository extends JpaRepository<FeedbackEntity, Integer> {
    List<FeedbackEntity> getAllByRoomId(int roomId);



    /*@Query("SELECT new com.example.hospitalcleaner.business.dto.MaterialHospitalEntityDto"
            +" (m.id,m.name,h.id,h.name,h.address,mh.quantity,mh.expiryDate)"
            +" FROM MaterialHospitalEntity mh INNER JOIN mh.hospital h INNER JOIN mh.material m where mh.quantity<:quantity")

    */

    @Query("select avg (f.star)"
            +" from FeedbackEntity f where f.room.id=:roomId group by f.room.id")
    Double getByRoomIdAvaregaStar(int roomId);

}