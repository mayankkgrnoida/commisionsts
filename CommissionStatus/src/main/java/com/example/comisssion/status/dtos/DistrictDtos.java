package com.example.comisssion.status.dtos;

public class DistrictDtos {
	private Long districtId;
	private String districtName;
	public Long getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public DistrictDtos(Long districtId, String districtName) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
	}
	public DistrictDtos() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
