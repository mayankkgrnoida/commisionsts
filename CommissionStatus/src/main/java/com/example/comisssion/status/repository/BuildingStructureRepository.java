package com.example.comisssion.status.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.comisssion.status.model.BuildingStructure;
import com.example.comisssion.status.model.State;

public interface BuildingStructureRepository extends JpaRepository<BuildingStructure, Long> {

}
