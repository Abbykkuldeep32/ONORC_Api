package com.example.dealer.dfso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "onorc_dfso_mobile")
public class Login {
	@Id
	@Column(name="dfsocode")
	private Long dfsocode;
	
	@Column(name="statecode")
	private Long statecode;
	
	@Column(name="statename")
	private String statename;
	
	@Column(name="lgddistrictcode")
	private Long lgddistrictcode;
	
	@Column(name="districtname")
	private String districtname;
	
	@Column(name="lgdtehsilcode")
	private Long lgdtehsilcode;
	
	@Column(name="tehsilname")
	private String tehsilname;
	
	@Column(name="dfsoname")
	private String dfsoname;
	
	@Column(name="mobileno")
	private String mobileno;
	
	@Column(name="dfsonamell")
	private String dfsonamell;
	
	@Column(name="office_locality")
	private String office_locality;
	
	@Column(name="contact_person")
	private String contact_person;
	
	@Column(name="office_plc")
	private String office_plc;
	
	@Column(name="office_no")
	private String office_no;
	
	@Column(name="office_mailid")
	private String office_mailid;
	
	@Column(name="office_pin")
	private String office_pin;

	public Long getDfsocode() {
		return dfsocode;
	}

	public void setDfsocode(Long dfsocode) {
		this.dfsocode = dfsocode;
	}

	public Long getStatecode() {
		return statecode;
	}

	public void setStatecode(Long statecode) {
		this.statecode = statecode;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public Long getLgddistrictcode() {
		return lgddistrictcode;
	}

	public void setLgddistrictcode(Long lgddistrictcode) {
		this.lgddistrictcode = lgddistrictcode;
	}

	public String getDistrictname() {
		return districtname;
	}

	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}

	public Long getLgdtehsilcode() {
		return lgdtehsilcode;
	}

	public void setLgdtehsilcode(Long lgdtehsilcode) {
		this.lgdtehsilcode = lgdtehsilcode;
	}

	public String getTehsilname() {
		return tehsilname;
	}

	public void setTehsilname(String tehsilname) {
		this.tehsilname = tehsilname;
	}

	public String getDfsoname() {
		return dfsoname;
	}

	public void setDfsoname(String dfsoname) {
		this.dfsoname = dfsoname;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getDfsonamell() {
		return dfsonamell;
	}

	public void setDfsonamell(String dfsonamell) {
		this.dfsonamell = dfsonamell;
	}

	public String getOffice_locality() {
		return office_locality;
	}

	public void setOffice_locality(String office_locality) {
		this.office_locality = office_locality;
	}

	public String getContact_person() {
		return contact_person;
	}

	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}

	public String getOffice_plc() {
		return office_plc;
	}

	public void setOffice_plc(String office_plc) {
		this.office_plc = office_plc;
	}

	public String getOffice_no() {
		return office_no;
	}

	public void setOffice_no(String office_no) {
		this.office_no = office_no;
	}

	public String getOffice_mailid() {
		return office_mailid;
	}

	public void setOffice_mailid(String office_mailid) {
		this.office_mailid = office_mailid;
	}

	public String getOffice_pin() {
		return office_pin;
	}

	public void setOffice_pin(String office_pin) {
		this.office_pin = office_pin;
	}

	public Login(Long dfsocode, Long statecode, String statename, Long lgddistrictcode, String districtname,
			Long lgdtehsilcode, String tehsilname, String dfsoname, String mobileno, String dfsonamell,
			String office_locality, String contact_person, String office_plc, String office_no, String office_mailid,
			String office_pin) {
		super();
		this.dfsocode = dfsocode;
		this.statecode = statecode;
		this.statename = statename;
		this.lgddistrictcode = lgddistrictcode;
		this.districtname = districtname;
		this.lgdtehsilcode = lgdtehsilcode;
		this.tehsilname = tehsilname;
		this.dfsoname = dfsoname;
		this.mobileno = mobileno;
		this.dfsonamell = dfsonamell;
		this.office_locality = office_locality;
		this.contact_person = contact_person;
		this.office_plc = office_plc;
		this.office_no = office_no;
		this.office_mailid = office_mailid;
		this.office_pin = office_pin;
	}
	
	public Login() {
		
	}
}
