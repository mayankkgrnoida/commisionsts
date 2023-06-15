package com.example.comisssion.status.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CommissionStatus implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comisssionid")
	private Long comisssionId;

	@Column(name = "stateid")
	private Long stateId;
	@Column(name = "districtid")
	private Long districtId;

	@Column(name = "functional")
	private Boolean functional;

	@Column(name = "nonfunctional")
	private Boolean nonfunctional;

	@Column(name = "buildingstructure_id")
	private Integer buildingStructureId;

	@Column(name = "remarks_func")
	private String remarks_func;

	@Column(name = "mediationcell_setup")
	private Boolean mediationcell_setup;
	
	@Column(name = "noofmediatorappointed")
	private Integer noofmediatorappointed;
	
	@Column(name = "noofreferredcases")
	private Integer noofreferredcases;
	
	@Column(name = "noofsolvedcases")
	private Integer noofsolvedcases;
	
	@Column(name = "remarks_mediation")
	private String remarks_mediation;
	
	@Column(name = "president_sanctioned")
	private Integer president_sanctioned;
	
	@Column(name = "presidentinpost")
	private Integer presidentinpost;
	
	@Column(name = "president_vacant")
	private Integer president_vacant;
	
	@Column(name = "member_sanctioned")
	private Integer member_sanctioned;
	
	@Column(name = "memberinpost")
	private Integer memberinpost;
	
	@Column(name = "member_vacant")
	private Integer member_vacant;
	
	@Column(name = "remarks_vacancy")
	private String remarks_vacancy;
	
	@Column(name = "durationfrom")
	private Date durationfrom;
	
	@Column(name = "durationto")
	private Date durationto;
	
	@Column(name = "createdby")
	private String createdby;
	
	@Column(name = "cratedon")
	private Date cratedon;
	
	@Column(name = "modifiedby")
	private String modifiedby;
	
	@Column(name = "modifiedon")
	private Date modifiedon;

	public Long getComisssionId() {
		return comisssionId;
	}

	public void setComisssionId(Long comisssionId) {
		this.comisssionId = comisssionId;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Boolean getFunctional() {
		return functional;
	}

	public void setFunctional(Boolean functional) {
		this.functional = functional;
	}

	public Boolean getNonfunctional() {
		return nonfunctional;
	}

	public void setNonfunctional(Boolean nonfunctional) {
		this.nonfunctional = nonfunctional;
	}

	public Integer getBuildingStructureId() {
		return buildingStructureId;
	}

	public void setBuildingStructureId(Integer buildingStructureId) {
		this.buildingStructureId = buildingStructureId;
	}

	public String getRemarks_func() {
		return remarks_func;
	}

	public void setRemarks_func(String remarks_func) {
		this.remarks_func = remarks_func;
	}

	public Boolean getMediationcell_setup() {
		return mediationcell_setup;
	}

	public void setMediationcell_setup(Boolean mediationcell_setup) {
		this.mediationcell_setup = mediationcell_setup;
	}

	public Integer getNoofmediatorappointed() {
		return noofmediatorappointed;
	}

	public void setNoofmediatorappointed(Integer noofmediatorappointed) {
		this.noofmediatorappointed = noofmediatorappointed;
	}

	public Integer getNoofreferredcases() {
		return noofreferredcases;
	}

	public void setNoofreferredcases(Integer noofreferredcases) {
		this.noofreferredcases = noofreferredcases;
	}

	public Integer getNoofsolvedcases() {
		return noofsolvedcases;
	}

	public void setNoofsolvedcases(Integer noofsolvedcases) {
		this.noofsolvedcases = noofsolvedcases;
	}

	public String getRemarks_mediation() {
		return remarks_mediation;
	}

	public void setRemarks_mediation(String remarks_mediation) {
		this.remarks_mediation = remarks_mediation;
	}

	public Integer getPresident_sanctioned() {
		return president_sanctioned;
	}

	public void setPresident_sanctioned(Integer president_sanctioned) {
		this.president_sanctioned = president_sanctioned;
	}

	public Integer getPresidentinpost() {
		return presidentinpost;
	}

	public void setPresidentinpost(Integer presidentinpost) {
		this.presidentinpost = presidentinpost;
	}

	public Integer getPresident_vacant() {
		return president_vacant;
	}

	public void setPresident_vacant(Integer president_vacant) {
		this.president_vacant = president_vacant;
	}

	public Integer getMember_sanctioned() {
		return member_sanctioned;
	}

	public void setMember_sanctioned(Integer member_sanctioned) {
		this.member_sanctioned = member_sanctioned;
	}

	public Integer getMemberinpost() {
		return memberinpost;
	}

	public void setMemberinpost(Integer memberinpost) {
		this.memberinpost = memberinpost;
	}

	public Integer getMember_vacant() {
		return member_vacant;
	}

	public void setMember_vacant(Integer member_vacant) {
		this.member_vacant = member_vacant;
	}

	public String getRemarks_vacancy() {
		return remarks_vacancy;
	}

	public void setRemarks_vacancy(String remarks_vacancy) {
		this.remarks_vacancy = remarks_vacancy;
	}

	public Date getDurationfrom() {
		return durationfrom;
	}

	public void setDurationfrom(Date durationfrom) {
		this.durationfrom = durationfrom;
	}

	public Date getDurationto() {
		return durationto;
	}

	public void setDurationto(Date durationto) {
		this.durationto = durationto;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCratedon() {
		return cratedon;
	}

	public void setCratedon(Date cratedon) {
		this.cratedon = cratedon;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	public CommissionStatus(Long comisssionId, Long stateId, Long districtId, Boolean functional, Boolean nonfunctional,
			Integer buildingStructureId, String remarks_func, Boolean mediationcell_setup,
			Integer noofmediatorappointed, Integer noofreferredcases, Integer noofsolvedcases, String remarks_mediation,
			Integer president_sanctioned, Integer presidentinpost, Integer president_vacant, Integer member_sanctioned,
			Integer memberinpost, Integer member_vacant, String remarks_vacancy, Date durationfrom, Date durationto,
			String createdby, Date cratedon, String modifiedby, Date modifiedon) {
		super();
		this.comisssionId = comisssionId;
		this.stateId = stateId;
		this.districtId = districtId;
		this.functional = functional;
		this.nonfunctional = nonfunctional;
		this.buildingStructureId = buildingStructureId;
		this.remarks_func = remarks_func;
		this.mediationcell_setup = mediationcell_setup;
		this.noofmediatorappointed = noofmediatorappointed;
		this.noofreferredcases = noofreferredcases;
		this.noofsolvedcases = noofsolvedcases;
		this.remarks_mediation = remarks_mediation;
		this.president_sanctioned = president_sanctioned;
		this.presidentinpost = presidentinpost;
		this.president_vacant = president_vacant;
		this.member_sanctioned = member_sanctioned;
		this.memberinpost = memberinpost;
		this.member_vacant = member_vacant;
		this.remarks_vacancy = remarks_vacancy;
		this.durationfrom = durationfrom;
		this.durationto = durationto;
		this.createdby = createdby;
		this.cratedon = cratedon;
		this.modifiedby = modifiedby;
		this.modifiedon = modifiedon;
	}

	@Override
	public String toString() {
		return "CommissionStatus [comisssionId=" + comisssionId + ", stateId=" + stateId + ", districtId=" + districtId
				+ ", functional=" + functional + ", nonfunctional=" + nonfunctional + ", buildingStructureId="
				+ buildingStructureId + ", remarks_func=" + remarks_func + ", mediationcell_setup="
				+ mediationcell_setup + ", noofmediatorappointed=" + noofmediatorappointed + ", noofreferredcases="
				+ noofreferredcases + ", noofsolvedcases=" + noofsolvedcases + ", remarks_mediation="
				+ remarks_mediation + ", president_sanctioned=" + president_sanctioned + ", presidentinpost="
				+ presidentinpost + ", president_vacant=" + president_vacant + ", member_sanctioned="
				+ member_sanctioned + ", memberinpost=" + memberinpost + ", member_vacant=" + member_vacant
				+ ", remarks_vacancy=" + remarks_vacancy + ", durationfrom=" + durationfrom + ", durationto="
				+ durationto + ", createdby=" + createdby + ", cratedon=" + cratedon + ", modifiedby=" + modifiedby
				+ ", modifiedon=" + modifiedon + "]";
	}
	

}


