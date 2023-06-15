package com.example.comisssion.status.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "state")
public class State  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stateid")
	private Long stateId;
	@Column(name = "statename")
	private String stateName;
	@Column(name="LGDstateid")
	private Long lgdStateId;
	@Column(name="LGDstatename")
	private String lgdStateName;
	@OneToMany(mappedBy="state",cascade=CascadeType.ALL)
	private List<District> districtList;
	public Long getStateId() {
		return stateId;
	}
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Long getLgdStateId() {
		return lgdStateId;
	}
	public void setLgdStateId(Long lgdStateId) {
		this.lgdStateId = lgdStateId;
	}
	public String getLgdStateName() {
		return lgdStateName;
	}
	public void setLgdStateName(String lgdStateName) {
		this.lgdStateName = lgdStateName;
	}
	public List<District> getDistrictList() {
		return districtList;
	}
	public void setDistrictList(List<District> districtList) {
		this.districtList = districtList;
	}
	public State(Long stateId, String stateName, Long lgdStateId, String lgdStateName, List<District> districtList) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.lgdStateId = lgdStateId;
		this.lgdStateName = lgdStateName;
		this.districtList = districtList;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
