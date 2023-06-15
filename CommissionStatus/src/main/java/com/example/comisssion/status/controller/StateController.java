package com.example.comisssion.status.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comisssion.status.model.State;
import com.example.comisssion.status.service.StateService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StateController {
	
	@Autowired
	private StateService stateService;

	
	public StateController(StateService stateService) {
		this.stateService = stateService;
	}
//to get the all state data of india.
	@GetMapping("/states")
	public ResponseEntity<Object> getAllStates() {
		try {
			List<State> state = stateService.getAllStates();
			return new ResponseEntity<>(state, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
//	@GetMapping("{id}")
//    public ResponseEntity<State> getUserById(@PathVariable("id") Integer stateId){
//		State user = stateService.getStateById(stateId);
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
}
