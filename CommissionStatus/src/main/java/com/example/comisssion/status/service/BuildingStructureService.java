package com.example.comisssion.status.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.comisssion.status.model.BuildingStructure;
import com.example.comisssion.status.model.State;
import com.example.comisssion.status.repository.BuildingStructureRepository;
import com.example.comisssion.status.repository.StateRepository;

@Service
public class BuildingStructureService {
private  BuildingStructureRepository buildingStructureRepository;

    
	public BuildingStructureService(BuildingStructureRepository buildingStructureRepository) {
		this.buildingStructureRepository = buildingStructureRepository;
	}

    public List<BuildingStructure> getAllBuildingStructure() {
        return buildingStructureRepository.findAll();
    }
}
	


