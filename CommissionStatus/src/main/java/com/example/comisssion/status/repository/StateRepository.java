package com.example.comisssion.status.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.comisssion.status.model.District;
import com.example.comisssion.status.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
	
	
}
