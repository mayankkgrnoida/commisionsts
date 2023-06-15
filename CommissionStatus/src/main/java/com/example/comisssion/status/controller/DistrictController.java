package com.example.comisssion.status.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.comisssion.status.dtos.DistrictDtos;
import com.example.comisssion.status.service.DistrictService;



@RestController
@RequestMapping("/api/v1")
public class DistrictController {
    @Autowired
    private  DistrictService districtService;
    @GetMapping("/district")
	public ResponseEntity<Object> getDistrictsByStateId(@RequestParam Long stateId) {
		List<DistrictDtos> districts = districtService.getDistrictsByStateId(stateId);
		return ResponseEntity.ok(districts); 
		
		//return ResponseHandler.generateResponse("sucess  ", HttpStatus.OK, "", districtService.getDistrictsByStateId(stateId));
	}
}


