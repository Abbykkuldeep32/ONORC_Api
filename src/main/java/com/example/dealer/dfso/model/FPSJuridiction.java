package com.example.dealer.dfso.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "onorc_fps_data_dfso")
public class FPSJuridiction {
	@Id
	@Column(name="fpsid")
	private String fpsid;
	
	@Column(name="statecode")
	private String statecode;
	
	@Column(name="districtcode")
	private String districtcode;
	
	@Column(name="lgd_state_code")
	private String lgd_state_code;
	
	@Column(name="lgd_district_code")
	private String lgd_district_code;
	
	@Column(name="dfsocode")
	private String dfsocode;
	
	@Column(name="dfsoname")
	private String dfsoname;
	
	@Column(name="afsocode")
	private String afsocode;
	
	@Column(name="afsoname")
	private String afsoname;
	
	@Column(name="statename")
	private String statename;
	
	@Column(name="license_no")
	private String license_no;
	
	@Column(name="fpstype")
	private String fpstype;
	
	@Column(name="area_type")
	private String area_type;
	
	@Column(name="district")
	private String district;
	
	@Column(name="fps_operation_name")
	private String fps_operation_name;
	
	@Column(name="fpsname")
	private String fpsname;
	
	@Column(name="fpsowner")
	private String fpsowner;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private String age;
	
	@Column(name="address")
	private String address;
	
	@Column(name="tehsilname")
	private String tehsilname;
	
	@Column(name="villagename")
	private String villagename;
	
	@Column(name="mobile_no")
	private String mobile_no;
	
	@Column(name="issuedate")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date issuedate;
	
	@Column(name="fps_validity_upto")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date fps_validity_upto;
	
	@Column(name="lattitude")
	private String lattitude;
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="accuracy")
	private String accuracy;
	
	@Column(name="fps_owner_father_name")
	private String fps_owner_father_name;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="fps_nomine_name")
	private String fps_nomine_name;
	
	@Column(name="fps_nomine_mobile_no")
	private String fps_nomine_mobile_no;
	
	@Column(name="fps_nomine_father_name")
	private String fps_nomine_father_name;
	
	@Column(name="fps_auth_type")
	private String fps_auth_type;
	
	@Column(name="inspectorcode")
	private String inspectorcode;
	
	@Column(name="inspectorname")
	private String inspectorname;
	
	@Column(name="godownid")
	private String godownid;
	
	@Column(name="godownname")
	private String godownname;

	public String getFpsid() {
		return fpsid;
	}

	public void setFpsid(String fpsid) {
		this.fpsid = fpsid;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getDistrictcode() {
		return districtcode;
	}

	public void setDistrictcode(String districtcode) {
		this.districtcode = districtcode;
	}

	public String getLgd_state_code() {
		return lgd_state_code;
	}

	public void setLgd_state_code(String lgd_state_code) {
		this.lgd_state_code = lgd_state_code;
	}

	public String getLgd_district_code() {
		return lgd_district_code;
	}

	public void setLgd_district_code(String lgd_district_code) {
		this.lgd_district_code = lgd_district_code;
	}

	public String getDfsocode() {
		return dfsocode;
	}

	public void setDfsocode(String dfsocode) {
		this.dfsocode = dfsocode;
	}

	public String getDfsoname() {
		return dfsoname;
	}

	public void setDfsoname(String dfsoname) {
		this.dfsoname = dfsoname;
	}

	public String getAfsocode() {
		return afsocode;
	}

	public void setAfsocode(String afsocode) {
		this.afsocode = afsocode;
	}

	public String getAfsoname() {
		return afsoname;
	}

	public void setAfsoname(String afsoname) {
		this.afsoname = afsoname;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getLicense_no() {
		return license_no;
	}

	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}

	public String getFpstype() {
		return fpstype;
	}

	public void setFpstype(String fpstype) {
		this.fpstype = fpstype;
	}

	public String getArea_type() {
		return area_type;
	}

	public void setArea_type(String area_type) {
		this.area_type = area_type;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getFps_operation_name() {
		return fps_operation_name;
	}

	public void setFps_operation_name(String fps_operation_name) {
		this.fps_operation_name = fps_operation_name;
	}

	public String getFpsname() {
		return fpsname;
	}

	public void setFpsname(String fpsname) {
		this.fpsname = fpsname;
	}

	public String getFpsowner() {
		return fpsowner;
	}

	public void setFpsowner(String fpsowner) {
		this.fpsowner = fpsowner;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTehsilname() {
		return tehsilname;
	}

	public void setTehsilname(String tehsilname) {
		this.tehsilname = tehsilname;
	}

	public String getVillagename() {
		return villagename;
	}

	public void setVillagename(String villagename) {
		this.villagename = villagename;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public Date getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	public Date getFps_validity_upto() {
		return fps_validity_upto;
	}

	public void setFps_validity_upto(Date fps_validity_upto) {
		this.fps_validity_upto = fps_validity_upto;
	}

	public String getLattitude() {
		return lattitude;
	}

	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public String getFps_owner_father_name() {
		return fps_owner_father_name;
	}

	public void setFps_owner_father_name(String fps_owner_father_name) {
		this.fps_owner_father_name = fps_owner_father_name;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getFps_nomine_name() {
		return fps_nomine_name;
	}

	public void setFps_nomine_name(String fps_nomine_name) {
		this.fps_nomine_name = fps_nomine_name;
	}

	public String getFps_nomine_mobile_no() {
		return fps_nomine_mobile_no;
	}

	public void setFps_nomine_mobile_no(String fps_nomine_mobile_no) {
		this.fps_nomine_mobile_no = fps_nomine_mobile_no;
	}

	public String getFps_nomine_father_name() {
		return fps_nomine_father_name;
	}

	public void setFps_nomine_father_name(String fps_nomine_father_name) {
		this.fps_nomine_father_name = fps_nomine_father_name;
	}

	public String getFps_auth_type() {
		return fps_auth_type;
	}

	public void setFps_auth_type(String fps_auth_type) {
		this.fps_auth_type = fps_auth_type;
	}

	public String getInspectorcode() {
		return inspectorcode;
	}

	public void setInspectorcode(String inspectorcode) {
		this.inspectorcode = inspectorcode;
	}

	public String getInspectorname() {
		return inspectorname;
	}

	public void setInspectorname(String inspectorname) {
		this.inspectorname = inspectorname;
	}

	public String getGodownid() {
		return godownid;
	}

	public void setGodownid(String godownid) {
		this.godownid = godownid;
	}

	public String getGodownname() {
		return godownname;
	}

	public void setGodownname(String godownname) {
		this.godownname = godownname;
	}

	public FPSJuridiction(String fpsid, String statecode, String districtcode, String lgd_state_code,
			String lgd_district_code, String dfsocode, String dfsoname, String afsocode, String afsoname,
			String statename, String license_no, String fpstype, String area_type, String district,
			String fps_operation_name, String fpsname, String fpsowner, String gender, String age, String address,
			String tehsilname, String villagename, String mobile_no, Date issuedate, Date fps_validity_upto,
			String lattitude, String longitude, String accuracy, String fps_owner_father_name, String pincode,
			String fps_nomine_name, String fps_nomine_mobile_no, String fps_nomine_father_name, String fps_auth_type,
			String inspectorcode, String inspectorname, String godownid, String godownname) {
		super();
		this.fpsid = fpsid;
		this.statecode = statecode;
		this.districtcode = districtcode;
		this.lgd_state_code = lgd_state_code;
		this.lgd_district_code = lgd_district_code;
		this.dfsocode = dfsocode;
		this.dfsoname = dfsoname;
		this.afsocode = afsocode;
		this.afsoname = afsoname;
		this.statename = statename;
		this.license_no = license_no;
		this.fpstype = fpstype;
		this.area_type = area_type;
		this.district = district;
		this.fps_operation_name = fps_operation_name;
		this.fpsname = fpsname;
		this.fpsowner = fpsowner;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.tehsilname = tehsilname;
		this.villagename = villagename;
		this.mobile_no = mobile_no;
		this.issuedate = issuedate;
		this.fps_validity_upto = fps_validity_upto;
		this.lattitude = lattitude;
		this.longitude = longitude;
		this.accuracy = accuracy;
		this.fps_owner_father_name = fps_owner_father_name;
		this.pincode = pincode;
		this.fps_nomine_name = fps_nomine_name;
		this.fps_nomine_mobile_no = fps_nomine_mobile_no;
		this.fps_nomine_father_name = fps_nomine_father_name;
		this.fps_auth_type = fps_auth_type;
		this.inspectorcode = inspectorcode;
		this.inspectorname = inspectorname;
		this.godownid = godownid;
		this.godownname = godownname;
	}
	
	public FPSJuridiction() {
		
	}
}
