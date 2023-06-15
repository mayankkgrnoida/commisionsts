package com.example.comisssion.status.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.comisssion.status.model.CommissionStatus;
@Repository
public interface CommissionRepository extends JpaRepository<CommissionStatus,Long> {

}
