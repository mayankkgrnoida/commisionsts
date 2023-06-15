package com.example.comisssion.status.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comisssion.status.dtos.DistrictDtos;
import com.example.comisssion.status.model.District;
import com.example.comisssion.status.repository.DistrictRepository;
@Service
public class DistrictService {
	@Autowired
	DistrictRepository districtRepository;
	public List<DistrictDtos> getDistrictsByStateId(Long stateId) {
		List<District> districts = districtRepository.getState(stateId);
		List<DistrictDtos> districtDTOs = new ArrayList<>();
		for (District district : districts) {
			DistrictDtos districtDTO = new DistrictDtos();
			districtDTO.setDistrictId(district.getDistrictId());
			districtDTO.setDistrictName(district.getDistrictName());

			districtDTOs.add(districtDTO);
		}

		return districtDTOs;
	}
	

}
