package com.example.comisssion.status.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.comisssion.status.model.District;
import com.example.comisssion.status.model.State;
@Repository
public interface DistrictRepository extends JpaRepository<District,Long> {

	@Query(value = "SELECT * FROM district u WHERE u.stateid =?1 order by 1 asc", nativeQuery = true)
	 List<District> getState(Long stateId);
	
}
