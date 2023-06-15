package com.example.comisssion.status.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comisssion.status.model.State;
import com.example.comisssion.status.repository.StateRepository;

import java.util.List;
@Service
public class StateService {
	@Autowired
    private  StateRepository stateRepository;

    
	public StateService(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}

    public List<State> getAllStates() {
        return stateRepository.findAll();
    }

//	public State getStateById(Integer stateId) {
//		Optional<State> optionalState = stateRepository.findById(stateId);
//        return optionalState.get();
//	}
}
