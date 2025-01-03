package com.example.dealer.inspector.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "onorc_inspector_mobile")
public class InspectorLogin {
		@Id
		@Column(name="inspectorcode")
		private String inspectorcode;
		
		@Column(name="statecode")
		private Long statecode;
		
		@Column(name="statename")
		private String statename;
		
		@Column(name="lgddistrictcode")
		private String lgddistrictcode;
		
		@Column(name="districtname")
		private String districtname;
		
		@Column(name="lgdtehsilcode")
		private String lgdtehsilcode;
		
		@Column(name="tehsilname")
		private String tehsilname;
		
		@Column(name="dfsocode")
		private String dfsocode;
		
		@Column(name="dfsoname")
		private String dfsoname;
		
		@Column(name="inspectorname")
		private String inspectorname;
		
		@Column(name="mobileno")
		private String mobileno;
		
		@Column(name="inspectornamell")
		private String inspectornamell;
		
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

		public String getInspectorcode() {
			return inspectorcode;
		}

		public void setInspectorcode(String inspectorcode) {
			this.inspectorcode = inspectorcode;
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

		public String getLgddistrictcode() {
			return lgddistrictcode;
		}

		public void setLgddistrictcode(String lgddistrictcode) {
			this.lgddistrictcode = lgddistrictcode;
		}

		public String getDistrictname() {
			return districtname;
		}

		public void setDistrictname(String districtname) {
			this.districtname = districtname;
		}

		public String getLgdtehsilcode() {
			return lgdtehsilcode;
		}

		public void setLgdtehsilcode(String lgdtehsilcode) {
			this.lgdtehsilcode = lgdtehsilcode;
		}

		public String getTehsilname() {
			return tehsilname;
		}

		public void setTehsilname(String tehsilname) {
			this.tehsilname = tehsilname;
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

		public String getInspectorname() {
			return inspectorname;
		}

		public void setInspectorname(String inspectorname) {
			this.inspectorname = inspectorname;
		}

		public String getMobileno() {
			return mobileno;
		}

		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}

		public String getInspectornamell() {
			return inspectornamell;
		}

		public void setInspectornamell(String inspectornamell) {
			this.inspectornamell = inspectornamell;
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

		public InspectorLogin(String inspectorcode, Long statecode, String statename, String lgddistrictcode,
				String districtname, String lgdtehsilcode, String tehsilname, String dfsocode, String dfsoname,
				String inspectorname, String mobileno, String inspectornamell, String office_locality,
				String contact_person, String office_plc, String office_no, String office_mailid, String office_pin) {
			super();
			this.inspectorcode = inspectorcode;
			this.statecode = statecode;
			this.statename = statename;
			this.lgddistrictcode = lgddistrictcode;
			this.districtname = districtname;
			this.lgdtehsilcode = lgdtehsilcode;
			this.tehsilname = tehsilname;
			this.dfsocode = dfsocode;
			this.dfsoname = dfsoname;
			this.inspectorname = inspectorname;
			this.mobileno = mobileno;
			this.inspectornamell = inspectornamell;
			this.office_locality = office_locality;
			this.contact_person = contact_person;
			this.office_plc = office_plc;
			this.office_no = office_no;
			this.office_mailid = office_mailid;
			this.office_pin = office_pin;
		}
		
		public InspectorLogin() {
			
		}
		
}
