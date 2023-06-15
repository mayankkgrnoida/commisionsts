package com.example.comisssion.status.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comisssion.status.model.CommissionStatus;
import com.example.comisssion.status.repository.CommissionRepository;

@Service
public class CommissionStatusService {
	@Autowired
private  CommissionRepository commissionRepository;

    public List<CommissionStatus> getAllCommisssionStatus() {
        return commissionRepository.findAll();
    }

}
