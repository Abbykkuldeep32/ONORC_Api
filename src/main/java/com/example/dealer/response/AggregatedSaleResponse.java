package com.example.dealer.response;

import java.time.LocalDate;
import java.util.List;

public class AggregatedSaleResponse {
	
	private Long id;
	private String sale_state;
	private String sale_district;
	private String rationCardNo;
	private LocalDate transactionDate;
	private String allocation_month;
	private String allocation_year;
	private String membername;
	private String membernamell;
	private String no_of_member;
	private String card_type;
	private String transaction_id;
	private String allocation_orderno;
	private String auth_type;
	private String home_fps_id;
	private String home_district;
	private String home_state_name;
	private String txn_type;
	private String allocation_type;
	
	
	private List<CommodityDetail> commodities;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSale_state() {
		return sale_state;
	}


	public void setSale_state(String sale_state) {
		this.sale_state = sale_state;
	}


	public String getSale_district() {
		return sale_district;
	}


	public void setSale_district(String sale_district) {
		this.sale_district = sale_district;
	}


	public String getRationCardNo() {
		return rationCardNo;
	}


	public void setRationCardNo(String rationCardNo) {
		this.rationCardNo = rationCardNo;
	}


	public LocalDate getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}


	public String getAllocation_month() {
		return allocation_month;
	}


	public void setAllocation_month(String allocation_month) {
		this.allocation_month = allocation_month;
	}


	public String getAllocation_year() {
		return allocation_year;
	}


	public void setAllocation_year(String allocation_year) {
		this.allocation_year = allocation_year;
	}


	public String getMembername() {
		return membername;
	}


	public void setMembername(String membername) {
		this.membername = membername;
	}


	public String getMembernamell() {
		return membernamell;
	}


	public void setMembernamell(String membernamell) {
		this.membernamell = membernamell;
	}


	public String getNo_of_member() {
		return no_of_member;
	}


	public void setNo_of_member(String no_of_member) {
		this.no_of_member = no_of_member;
	}


	public String getCard_type() {
		return card_type;
	}


	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}


	public String getTransaction_id() {
		return transaction_id;
	}


	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}


	public String getAllocation_orderno() {
		return allocation_orderno;
	}


	public void setAllocation_orderno(String allocation_orderno) {
		this.allocation_orderno = allocation_orderno;
	}


	public String getAuth_type() {
		return auth_type;
	}


	public void setAuth_type(String auth_type) {
		this.auth_type = auth_type;
	}


	public String getHome_fps_id() {
		return home_fps_id;
	}


	public void setHome_fps_id(String home_fps_id) {
		this.home_fps_id = home_fps_id;
	}


	public String getHome_district() {
		return home_district;
	}


	public void setHome_district(String home_district) {
		this.home_district = home_district;
	}


	public String getHome_state_name() {
		return home_state_name;
	}


	public void setHome_state_name(String home_state_name) {
		this.home_state_name = home_state_name;
	}


	public String getTxn_type() {
		return txn_type;
	}


	public void setTxn_type(String txn_type) {
		this.txn_type = txn_type;
	}


	public String getAllocation_type() {
		return allocation_type;
	}


	public void setAllocation_type(String allocation_type) {
		this.allocation_type = allocation_type;
	}


	public List<CommodityDetail> getCommodities() {
		return commodities;
	}


	public void setCommodities(List<CommodityDetail> commodities) {
		this.commodities = commodities;
	}


	public AggregatedSaleResponse(Long id, String sale_state, String sale_district, String rationCardNo,
			LocalDate transactionDate, String allocation_month, String allocation_year, String membername,
			String membernamell, String no_of_member, String card_type, String transaction_id,
			String allocation_orderno, String auth_type, String home_fps_id, String home_district,
			String home_state_name, String txn_type, String allocation_type, List<CommodityDetail> commodities) {
		super();
		this.id = id;
		this.sale_state = sale_state;
		this.sale_district = sale_district;
		this.rationCardNo = rationCardNo;
		this.transactionDate = transactionDate;
		this.allocation_month = allocation_month;
		this.allocation_year = allocation_year;
		this.membername = membername;
		this.membernamell = membernamell;
		this.no_of_member = no_of_member;
		this.card_type = card_type;
		this.transaction_id = transaction_id;
		this.allocation_orderno = allocation_orderno;
		this.auth_type = auth_type;
		this.home_fps_id = home_fps_id;
		this.home_district = home_district;
		this.home_state_name = home_state_name;
		this.txn_type = txn_type;
		this.allocation_type = allocation_type;
		this.commodities = commodities;
	}
	
	public static class CommodityDetail {
		private String comm_code;
		private String commodity_name;
		private String distributed_quanitity;
		private String entitlement_quanitity;
		
		public String getComm_code() {
			return comm_code;
		}
		public void setComm_code(String comm_code) {
			this.comm_code = comm_code;
		}
		public String getCommodity_name() {
			return commodity_name;
		}
		public void setCommodity_name(String commodity_name) {
			this.commodity_name = commodity_name;
		}
		public String getDistributed_quanitity() {
			return distributed_quanitity;
		}
		public void setDistributed_quanitity(String distributed_quanitity) {
			this.distributed_quanitity = distributed_quanitity;
		}
		public String getEntitlement_quanitity() {
			return entitlement_quanitity;
		}
		public void setEntitlement_quanitity(String entitlement_quanitity) {
			this.entitlement_quanitity = entitlement_quanitity;
		}
		
		public CommodityDetail(String comm_code, String commodity_name, String distributed_quanitity,
				String entitlement_quanitity) {
			super();
			this.comm_code = comm_code;
			this.commodity_name = commodity_name;
			this.distributed_quanitity = distributed_quanitity;
			this.entitlement_quanitity = entitlement_quanitity;
		}

        
    }
		

}
