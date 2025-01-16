package com.example.dealer.godown.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "get_fps_godown_details_by_stcd_mobile_no")
public class GodownLogin {
	@Id
	@Column(name="godown_code")
	private String godown_code;
	
	@Column(name="state_code")
	private String statecode;
	
	@Column(name="statename")
	private String statename;
	
	@Column(name="godown_name")
	private String godown_name;
	
	@Column(name="godown_name_ll")
	private String godown_name_ll;
	
	@Column(name="contact_person")
	private String contact_person;
	
	@Column(name="contact_person_ll")
	private String contact_person_ll;
	
	@Column(name="godown_mobile_no")
	private String mobileno;
	
	@Column(name="godown_email")
	private String godown_email;
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="district_code")
	private String district_code;
	
	@Column(name="district_name")
	private String district_name;
	
	@Column(name="tehsil_code")
	private String tehsil_code;
	
	@Column(name="tehsil_name_en")
	private String tehsil_name_en;
	
	@Column(name="town_vill")
	private String town_vill;
	
	@Column(name="village_town_en")
	private String village_town_en;
	
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="covered_capacity_mt")
	private String covered_capacity_mt;
	
	public String getGodown_code() {
		return godown_code;
	}



	public void setGodown_code(String godown_code) {
		this.godown_code = godown_code;
	}



	public String getStatecode() {
		return statecode;
	}



	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}



	public String getStatename() {
		return statename;
	}



	public void setStatename(String statename) {
		this.statename = statename;
	}



	public String getGodown_name() {
		return godown_name;
	}



	public void setGodown_name(String godown_name) {
		this.godown_name = godown_name;
	}



	public String getGodown_name_ll() {
		return godown_name_ll;
	}



	public void setGodown_name_ll(String godown_name_ll) {
		this.godown_name_ll = godown_name_ll;
	}



	public String getContact_person() {
		return contact_person;
	}



	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}



	public String getContact_person_ll() {
		return contact_person_ll;
	}



	public void setContact_person_ll(String contact_person_ll) {
		this.contact_person_ll = contact_person_ll;
	}



	public String getMobileno() {
		return mobileno;
	}



	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}



	public String getGodown_email() {
		return godown_email;
	}



	public void setGodown_email(String godown_email) {
		this.godown_email = godown_email;
	}



	public String getLongitude() {
		return longitude;
	}



	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}



	public String getLatitude() {
		return latitude;
	}



	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}



	public String getDistrict_code() {
		return district_code;
	}



	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}



	public String getDistrict_name() {
		return district_name;
	}



	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}



	public String getTehsil_code() {
		return tehsil_code;
	}



	public void setTehsil_code(String tehsil_code) {
		this.tehsil_code = tehsil_code;
	}



	public String getTehsil_name_en() {
		return tehsil_name_en;
	}



	public void setTehsil_name_en(String tehsil_name_en) {
		this.tehsil_name_en = tehsil_name_en;
	}



	public String getTown_vill() {
		return town_vill;
	}



	public void setTown_vill(String town_vill) {
		this.town_vill = town_vill;
	}



	public String getVillage_town_en() {
		return village_town_en;
	}



	public void setVillage_town_en(String village_town_en) {
		this.village_town_en = village_town_en;
	}



	public String getAddress1() {
		return address1;
	}



	public void setAddress1(String address1) {
		this.address1 = address1;
	}



	public String getAddress2() {
		return address2;
	}



	public void setAddress2(String address2) {
		this.address2 = address2;
	}



	public String getPincode() {
		return pincode;
	}



	public void setPincode(String pincode) {
		this.pincode = pincode;
	}



	public String getCovered_capacity_mt() {
		return covered_capacity_mt;
	}



	public void setCovered_capacity_mt(String covered_capacity_mt) {
		this.covered_capacity_mt = covered_capacity_mt;
	}



	public GodownLogin(String godown_code, String statecode, String statename, String godown_name,
			String godown_name_ll, String contact_person, String contact_person_ll, String mobileno,
			String godown_email, String longitude, String latitude, String district_code, String district_name,
			String tehsil_code, String tehsil_name_en, String town_vill, String village_town_en, String address1,
			String address2, String pincode, String covered_capacity_mt) {
		super();
		this.godown_code = godown_code;
		this.statecode = statecode;
		this.statename = statename;
		this.godown_name = godown_name;
		this.godown_name_ll = godown_name_ll;
		this.contact_person = contact_person;
		this.contact_person_ll = contact_person_ll;
		this.mobileno = mobileno;
		this.godown_email = godown_email;
		this.longitude = longitude;
		this.latitude = latitude;
		this.district_code = district_code;
		this.district_name = district_name;
		this.tehsil_code = tehsil_code;
		this.tehsil_name_en = tehsil_name_en;
		this.town_vill = town_vill;
		this.village_town_en = village_town_en;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.covered_capacity_mt = covered_capacity_mt;
	}



	public GodownLogin() {
		
	}
}

