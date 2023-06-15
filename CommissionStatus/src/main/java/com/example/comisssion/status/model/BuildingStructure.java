package com.example.comisssion.status.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "buildingstructure")
public class BuildingStructure implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "buildingstructure_id")
	private Long buildingStructureId;
	@Column(name="buildingstructure_name")
	private String buildingStructureName;
	public Long getBuildingStructureId() {
		return buildingStructureId;
	}
	public void setBuildingStructureId(Long buildingStructureId) {
		this.buildingStructureId = buildingStructureId;
	}
	public String getBuildingStructureName() {
		return buildingStructureName;
	}
	public void setBuildingStructureName(String buildingStructureName) {
		this.buildingStructureName = buildingStructureName;
	}
	public BuildingStructure(Long buildingStructureId, String buildingStructureName) {
		super();
		this.buildingStructureId = buildingStructureId;
		this.buildingStructureName = buildingStructureName;
	}
	public BuildingStructure() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
