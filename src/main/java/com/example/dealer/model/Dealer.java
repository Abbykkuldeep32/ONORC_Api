package com.example.dealer.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"dealer\"", schema = "public")
public class Dealer {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="address")
	private String address;
	
	@Column(name="nomineefathername")
	private String nomineefathername;
	
	@Column(name="fps_owner_father_name")
	private String fps_owner_father_name;
	
	@Column(name="fpsid")
	private int fpsid;
	
	@Column(name="fpstype")
	private String fpstype;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="fpsarea")
	private String fpsarea;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="age")
	private int age;
	
	@Column(name="latitute")
	private String latitute;
	
	@Column(name="longitute")
	private String longitute;
	
	@Column(name="vigilance")
	private String vigilance;
	
	@Column(name="districtname")
	private String districtname;
	
	@Column(name="validity_upto")
	private Date validity_upto;
	
	@Column(name="accuracy")
	private int accuracy;
	
	@Column(name="adhaar_no")
	private String adhaar_no;
	
	@Column(name="fpsownername")
	private String fpsownername;
	
	@Column(name="mobileno")
	private String mobileno;
	
	@Column(name="license_no")
	private String license_no;
	
	@Column(name="fps_issue_date")
	private Date fps_issue_date;
	
	@Column(name="tehsilname")
	private String tehsilname;
	
	@Column(name="auth_type")
	private String auth_type;
	
	@Column(name="fpsnomineename")
	private String fpsnomineename;
	
	@Column(name="fps_open_mode")
	private String fps_open_mode;
	
	@Column(name="fps_mobileno")
	private String fps_mobileno;
	
	@Column(name="state")
	private String state;

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getNomineefathername() {
		return nomineefathername;
	}



	public void setNomineefathername(String nomineefathername) {
		this.nomineefathername = nomineefathername;
	}



	public String getFps_owner_father_name() {
		return fps_owner_father_name;
	}



	public void setFps_owner_father_name(String fps_owner_father_name) {
		this.fps_owner_father_name = fps_owner_father_name;
	}



	public int getFpsid() {
		return fpsid;
	}



	public void setFpsid(int fpsid) {
		this.fpsid = fpsid;
	}



	public String getFpstype() {
		return fpstype;
	}



	public void setFpstype(String fpstype) {
		this.fpstype = fpstype;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getFpsarea() {
		return fpsarea;
	}



	public void setFpsarea(String fpsarea) {
		this.fpsarea = fpsarea;
	}



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getLatitute() {
		return latitute;
	}



	public void setLatitute(String latitute) {
		this.latitute = latitute;
	}



	public String getLongitute() {
		return longitute;
	}



	public void setLongitute(String longitute) {
		this.longitute = longitute;
	}



	public String getVigilance() {
		return vigilance;
	}



	public void setVigilance(String vigilance) {
		this.vigilance = vigilance;
	}



	public String getDistrictname() {
		return districtname;
	}



	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}



	public Date getValidity_upto() {
		return validity_upto;
	}



	public void setValidity_upto(Date validity_upto) {
		this.validity_upto = validity_upto;
	}



	public int getAccuracy() {
		return accuracy;
	}



	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}



	public String getAdhaar_no() {
		return adhaar_no;
	}



	public void setAdhaar_no(String adhaar_no) {
		this.adhaar_no = adhaar_no;
	}



	public String getFpsownername() {
		return fpsownername;
	}



	public void setFpsownername(String fpsownername) {
		this.fpsownername = fpsownername;
	}



	public String getMobileno() {
		return mobileno;
	}



	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}



	public String getLicense_no() {
		return license_no;
	}



	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}



	public Date getFps_issue_date() {
		return fps_issue_date;
	}



	public void setFps_issue_date(Date fps_issue_date) {
		this.fps_issue_date = fps_issue_date;
	}



	public String getTehsilname() {
		return tehsilname;
	}



	public void setTehsilname(String tehsilname) {
		this.tehsilname = tehsilname;
	}



	public String getAuth_type() {
		return auth_type;
	}



	public void setAuth_type(String auth_type) {
		this.auth_type = auth_type;
	}



	public String getFpsnomineename() {
		return fpsnomineename;
	}



	public void setFpsnomineename(String fpsnomineename) {
		this.fpsnomineename = fpsnomineename;
	}



	public String getFps_open_mode() {
		return fps_open_mode;
	}



	public void setFps_open_mode(String fps_open_mode) {
		this.fps_open_mode = fps_open_mode;
	}



	public String getFps_mobileno() {
		return fps_mobileno;
	}



	public void setFps_mobileno(String fps_mobileno) {
		this.fps_mobileno = fps_mobileno;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}

	

	public Dealer(Long id, String address, String nomineefathername, String fps_owner_father_name, int fpsid,
			String fpstype, String gender, String fpsarea, int pincode, int age, String latitute, String longitute,
			String vigilance, String districtname, Date validity_upto, int accuracy, String adhaar_no,
			String fpsownername, String mobileno, String license_no, Date fps_issue_date, String tehsilname,
			String auth_type, String fpsnomineename, String fps_open_mode, String fps_mobileno, String state) {
		super();
		this.id = id;
		this.address = address;
		this.nomineefathername = nomineefathername;
		this.fps_owner_father_name = fps_owner_father_name;
		this.fpsid = fpsid;
		this.fpstype = fpstype;
		this.gender = gender;
		this.fpsarea = fpsarea;
		this.pincode = pincode;
		this.age = age;
		this.latitute = latitute;
		this.longitute = longitute;
		this.vigilance = vigilance;
		this.districtname = districtname;
		this.validity_upto = validity_upto;
		this.accuracy = accuracy;
		this.adhaar_no = adhaar_no;
		this.fpsownername = fpsownername;
		this.mobileno = mobileno;
		this.license_no = license_no;
		this.fps_issue_date = fps_issue_date;
		this.tehsilname = tehsilname;
		this.auth_type = auth_type;
		this.fpsnomineename = fpsnomineename;
		this.fps_open_mode = fps_open_mode;
		this.fps_mobileno = fps_mobileno;
		this.state = state;
	}



	public Dealer() {
		
	}
}
