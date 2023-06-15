package com.example.comisssion.status.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comisssion.status.model.BuildingStructure;
import com.example.comisssion.status.model.State;
import com.example.comisssion.status.service.BuildingStructureService;
import com.example.comisssion.status.service.StateService;

@RestController
@RequestMapping("/api/v1")
public class BuildingStructureController {
	@Autowired
	private BuildingStructureService buildingStructureService;

	
	public BuildingStructureController(BuildingStructureService buildingStructureService) {
		this.buildingStructureService = buildingStructureService;
	}
	//to get the all building structure details .
		@GetMapping("/building")
		public ResponseEntity<Object> getAllBuildingStructure() {
			try {
				List<BuildingStructure> buildingStructure = buildingStructureService.getAllBuildingStructure();
				return new ResponseEntity<>(buildingStructure, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

}
