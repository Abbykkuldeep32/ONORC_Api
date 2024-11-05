package com.example.dealer.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "onorc_fps_data")
public class Dealer {
	
	@Id
	@Column(name="fpsid")
	private String fpsid;
	
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
	private int age;
	
	@Column(name="address")
	private String address;
	
	@Column(name="tehsilname")
	private String tehsilname;
	
	@Column(name="villagename")
	private String villagename;
	
	@Column(name="mobile_no")
	private String mobile_no;
	
	@Column(name="issuedate")
	private Date issuedate;
	
	@Column(name="fps_validity_upto")
	private Date fps_validity_upto;
	
	@Column(name="latitute")
	private Double latitute;
	
	@Column(name="longitute")
	private Double longitute;
	
	@Column(name="accuracy")
	private Double accuracy;
	
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
	

	public String getFpsid() {
		return fpsid;
	}



	public void setFpsid(String fpsid) {
		this.fpsid = fpsid;
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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
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



	public Double getLatitute() {
		return latitute;
	}



	public void setLatitute(Double latitute) {
		this.latitute = latitute;
	}



	public Double getLongitute() {
		return longitute;
	}



	public void setLongitute(Double longitute) {
		this.longitute = longitute;
	}



	public Double getAccuracy() {
		return accuracy;
	}



	public void setAccuracy(Double accuracy) {
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

	

	public Dealer(String fpsid, String statename, String license_no, String fpstype, String area_type, String district,
			String fps_operation_name, String fpsname, String fpsowner, String gender, int age, String address,
			String tehsilname, String villagename, String mobile_no, Date issuedate, Date fps_validity_upto,
			Double latitute, Double longitute, Double accuracy, String fps_owner_father_name, String pincode,
			String fps_nomine_name, String fps_nomine_mobile_no, String fps_nomine_father_name, String fps_auth_type) {
		super();
		this.fpsid = fpsid;
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
		this.latitute = latitute;
		this.longitute = longitute;
		this.accuracy = accuracy;
		this.fps_owner_father_name = fps_owner_father_name;
		this.pincode = pincode;
		this.fps_nomine_name = fps_nomine_name;
		this.fps_nomine_mobile_no = fps_nomine_mobile_no;
		this.fps_nomine_father_name = fps_nomine_father_name;
		this.fps_auth_type = fps_auth_type;
	}



	public Dealer() {
		
	}



	@Override
	public String toString() {
		return "Dealer [fpsid=" + fpsid + ", statename=" + statename + ", license_no=" + license_no + ", fpstype="
				+ fpstype + ", area_type=" + area_type + ", district=" + district + ", fps_operation_name="
				+ fps_operation_name + ", fpsname=" + fpsname + ", fpsowner=" + fpsowner + ", gender=" + gender
				+ ", age=" + age + ", address=" + address + ", tehsilname=" + tehsilname + ", villagename="
				+ villagename + ", mobile_no=" + mobile_no + ", issuedate=" + issuedate + ", fps_validity_upto="
				+ fps_validity_upto + ", latitute=" + latitute + ", longitute=" + longitute + ", accuracy=" + accuracy
				+ ", fps_owner_father_name=" + fps_owner_father_name + ", pincode=" + pincode + ", fps_nomine_name="
				+ fps_nomine_name + ", fps_nomine_mobile_no=" + fps_nomine_mobile_no + ", fps_nomine_father_name="
				+ fps_nomine_father_name + ", fps_auth_type=" + fps_auth_type + "]";
	}
	
	
}
