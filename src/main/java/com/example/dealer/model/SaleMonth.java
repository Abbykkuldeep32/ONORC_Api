package com.example.dealer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="onorc_fps_txn_detail")
public class SaleMonth {
		
			@Id
			@Column(name="id")
			private Long id;
			
			@Column(name="sale_fpsid")
			private String fpsId;
			
			@Column(name="allocation_month")
			private int allocationMonth;
			
			@Column(name="allocation_year")
			private int allocationYear;
				
			@Column(name="aay_nor_txn")
			private int aay_nor_txn;
			
			@Column(name="aay_intra_txn")
			private int aay_intra_txn;
			
			@Column(name="aay_inter_txn")
			private int aay_inter_txn;
			
			@Column(name="phh_nor_txn")
			private int phh_nor_txn;
			
			@Column(name="phh_intra_txn")
			private int phh_intra_txn;
				
			@Column(name="phh_inter_txn")
			private int phh_inter_txn;
			
			@Column(name="aay_nor_wheat")
			private double aay_nor_wheat;
			
			@Column(name="phh_nor_wheat")
			private double phh_nor_wheat;
			
			@Column(name="aay_nor_rice")
			private double aay_nor_rice;
			
			@Column(name="phh_nor_rice")
			private double phh_nor_rice;
			
			@Column(name="aay_intra_wheat")
			private double aay_intra_wheat;
			
			@Column(name="phh_intra_wheat")
			private double phh_intra_wheat;
			
			@Column(name="aay_intra_rice")
			private double aay_intra_rice;
			
			@Column(name="phh_intra_rice")
			private double phh_intra_rice;
			
			@Column(name="aay_inter_wheat")
			private double aay_inter_wheat;
			
			@Column(name="phh_inter_wheat")
			private double phh_inter_wheat;
			
			@Column(name="aay_inter_rice")
			private double aay_inter_rice;
			
			@Column(name="phh_inter_rice")
			private double phh_inter_rice;

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getFpsId() {
				return fpsId;
			}

			public void setFpsId(String fpsId) {
				this.fpsId = fpsId;
			}

			public int getAllocationMonth() {
				return allocationMonth;
			}

			public void setAllocationMonth(int allocationMonth) {
				this.allocationMonth = allocationMonth;
			}

			public int getAllocationYear() {
				return allocationYear;
			}

			public void setAllocationYear(int allocationYear) {
				this.allocationYear = allocationYear;
			}

			public int getAay_nor_txn() {
				return aay_nor_txn;
			}

			public void setAay_nor_txn(int aay_nor_txn) {
				this.aay_nor_txn = aay_nor_txn;
			}

			public int getAay_intra_txn() {
				return aay_intra_txn;
			}

			public void setAay_intra_txn(int aay_intra_txn) {
				this.aay_intra_txn = aay_intra_txn;
			}

			public int getAay_inter_txn() {
				return aay_inter_txn;
			}

			public void setAay_inter_txn(int aay_inter_txn) {
				this.aay_inter_txn = aay_inter_txn;
			}

			public int getPhh_nor_txn() {
				return phh_nor_txn;
			}

			public void setPhh_nor_txn(int phh_nor_txn) {
				this.phh_nor_txn = phh_nor_txn;
			}

			public int getPhh_intra_txn() {
				return phh_intra_txn;
			}

			public void setPhh_intra_txn(int phh_intra_txn) {
				this.phh_intra_txn = phh_intra_txn;
			}

			public int getPhh_inter_txn() {
				return phh_inter_txn;
			}

			public void setPhh_inter_txn(int phh_inter_txn) {
				this.phh_inter_txn = phh_inter_txn;
			}

			public double getAay_nor_wheat() {
				return aay_nor_wheat;
			}

			public void setAay_nor_wheat(double aay_nor_wheat) {
				this.aay_nor_wheat = aay_nor_wheat;
			}

			public double getPhh_nor_wheat() {
				return phh_nor_wheat;
			}

			public void setPhh_nor_wheat(double phh_nor_wheat) {
				this.phh_nor_wheat = phh_nor_wheat;
			}

			public double getAay_nor_rice() {
				return aay_nor_rice;
			}

			public void setAay_nor_rice(double aay_nor_rice) {
				this.aay_nor_rice = aay_nor_rice;
			}

			public double getPhh_nor_rice() {
				return phh_nor_rice;
			}

			public void setPhh_nor_rice(double phh_nor_rice) {
				this.phh_nor_rice = phh_nor_rice;
			}

			public double getAay_intra_wheat() {
				return aay_intra_wheat;
			}

			public void setAay_intra_wheat(double aay_intra_wheat) {
				this.aay_intra_wheat = aay_intra_wheat;
			}

			public double getPhh_intra_wheat() {
				return phh_intra_wheat;
			}

			public void setPhh_intra_wheat(double phh_intra_wheat) {
				this.phh_intra_wheat = phh_intra_wheat;
			}

			public double getAay_intra_rice() {
				return aay_intra_rice;
			}

			public void setAay_intra_rice(double aay_intra_rice) {
				this.aay_intra_rice = aay_intra_rice;
			}

			public double getPhh_intra_rice() {
				return phh_intra_rice;
			}

			public void setPhh_intra_rice(double phh_intra_rice) {
				this.phh_intra_rice = phh_intra_rice;
			}

			public double getAay_inter_wheat() {
				return aay_inter_wheat;
			}

			public void setAay_inter_wheat(double aay_inter_wheat) {
				this.aay_inter_wheat = aay_inter_wheat;
			}

			public double getPhh_inter_wheat() {
				return phh_inter_wheat;
			}

			public void setPhh_inter_wheat(double phh_inter_wheat) {
				this.phh_inter_wheat = phh_inter_wheat;
			}

			public double getAay_inter_rice() {
				return aay_inter_rice;
			}

			public void setAay_inter_rice(double aay_inter_rice) {
				this.aay_inter_rice = aay_inter_rice;
			}

			public double getPhh_inter_rice() {
				return phh_inter_rice;
			}

			public void setPhh_inter_rice(double phh_inter_rice) {
				this.phh_inter_rice = phh_inter_rice;
			}

			public SaleMonth(Long id, String fpsId, int allocationMonth, int allocationYear, int aay_nor_txn,
					int aay_intra_txn, int aay_inter_txn, int phh_nor_txn, int phh_intra_txn, int phh_inter_txn,
					double aay_nor_wheat, double phh_nor_wheat, double aay_nor_rice, double phh_nor_rice,
					double aay_intra_wheat, double phh_intra_wheat, double aay_intra_rice, double phh_intra_rice,
					double aay_inter_wheat, double phh_inter_wheat, double aay_inter_rice, double phh_inter_rice) {
				super();
				this.id = id;
				this.fpsId = fpsId;
				this.allocationMonth = allocationMonth;
				this.allocationYear = allocationYear;
				this.aay_nor_txn = aay_nor_txn;
				this.aay_intra_txn = aay_intra_txn;
				this.aay_inter_txn = aay_inter_txn;
				this.phh_nor_txn = phh_nor_txn;
				this.phh_intra_txn = phh_intra_txn;
				this.phh_inter_txn = phh_inter_txn;
				this.aay_nor_wheat = aay_nor_wheat;
				this.phh_nor_wheat = phh_nor_wheat;
				this.aay_nor_rice = aay_nor_rice;
				this.phh_nor_rice = phh_nor_rice;
				this.aay_intra_wheat = aay_intra_wheat;
				this.phh_intra_wheat = phh_intra_wheat;
				this.aay_intra_rice = aay_intra_rice;
				this.phh_intra_rice = phh_intra_rice;
				this.aay_inter_wheat = aay_inter_wheat;
				this.phh_inter_wheat = phh_inter_wheat;
				this.aay_inter_rice = aay_inter_rice;
				this.phh_inter_rice = phh_inter_rice;
			}

		public SaleMonth() {
			
		}	
			
}
