package com.example.dealer.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="onorc_fpswise_txn_data")
public class SaleFPS {
	
		@Id
		@Column(name="id")
		private Long id;
		
		@Column(name="sale_state")
		private String sale_state;
		
		@Column(name="sale_district")
		private String sale_district;
		
		@Column(name="rationcardid")
		private String rationcardid;
			
		@Column(name="sale_fpsid")
		private String fpsid;
		
		@Column(name="transaction_date")
		private String transactionDate;
		
		@Column(name="allocation_month")
		private String allocation_month;
		
		@Column(name="allocation_year")
		private String allocation_year;
		
		@Column(name="membername")
		private String membername;
		
		@Column(name="membernamell")
		private String membernameII;
			
		@Column(name="no_of_member")
		private String no_of_member;
		
		@Column(name="card_type")
		private String card_type;
		
		@Column(name="transaction_id")
		private String transaction_id;
		
		@Column(name="allocation_orderno")
		private String allocation_orderno;
		
		@Column(name="auth_type")
		private String auth_type;
		
		@Column(name="home_fps_id")
		private String home_fps_id;
		
		@Column(name="home_district")
		private String home_district;
			
		@Column(name="home_state_name")
		private String home_state_name;
		
		@Column(name="txn_type")
		private String txn_type;
		
		@Column(name="comm_code")
		private String comm_code;
		
		@Column(name="commodity_name")
		private String commodity_name;
		
		@Column(name="distributed_quanitity")
		private String distributed_quantity;
			
		@Column(name="entitlement_quanitity")
		private String entitlement_quantity;
		
		@Column(name="allocation_type")
		private String allocation_type;

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

		public String getRationcardid() {
			return rationcardid;
		}

		public void setRationcardid(String rationcardid) {
			this.rationcardid = rationcardid;
		}

		public String getFpsid() {
			return fpsid;
		}

		public void setFpsid(String fpsid) {
			this.fpsid = fpsid;
		}

		public String getTransaction_date() {
//			DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//	        LocalDateTime dateTime = LocalDateTime.parse(transactionDate, originalFormat);
//	        LocalDate date = dateTime.toLocalDate();
//	        
//	        return date.toString();
			return transactionDate;
		}

		public void setTransaction_date(String transactionDate) {
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

		public String getMembernameII() {
			return membernameII;
		}

		public void setMembernameII(String membernameII) {
			this.membernameII = membernameII;
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

		public String getDistributed_quantity() {
			return distributed_quantity;
		}

		public void setDistributed_quantity(String distributed_quantity) {
			this.distributed_quantity = distributed_quantity;
		}

		public String getEntitlement_quantity() {
			return entitlement_quantity;
		}

		public void setEntitlement_quantity(String entitlement_quantity) {
			this.entitlement_quantity = entitlement_quantity;
		}

		public String getAllocation_type() {
			return allocation_type;
		}

		public void setAllocation_type(String allocation_type) {
			this.allocation_type = allocation_type;
		}

		public SaleFPS(Long id, String sale_state, String sale_district, String rationcardid, String fpsid,
				String transactionDate, String allocation_month, String allocation_year, String membername,
				String membernameII, String no_of_member, String card_type, String transaction_id,
				String allocation_orderno, String auth_type, String home_fps_id, String home_district,
				String home_state_name, String txn_type, String comm_code, String commodity_name,
				String distributed_quantity, String entitlement_quantity, String allocation_type) {
			super();
			this.id = id;
			this.sale_state = sale_state;
			this.sale_district = sale_district;
			this.rationcardid = rationcardid;
			this.fpsid = fpsid;
			this.transactionDate = transactionDate;
			this.allocation_month = allocation_month;
			this.allocation_year = allocation_year;
			this.membername = membername;
			this.membernameII = membernameII;
			this.no_of_member = no_of_member;
			this.card_type = card_type;
			this.transaction_id = transaction_id;
			this.allocation_orderno = allocation_orderno;
			this.auth_type = auth_type;
			this.home_fps_id = home_fps_id;
			this.home_district = home_district;
			this.home_state_name = home_state_name;
			this.txn_type = txn_type;
			this.comm_code = comm_code;
			this.commodity_name = commodity_name;
			this.distributed_quantity = distributed_quantity;
			this.entitlement_quantity = entitlement_quantity;
			this.allocation_type = allocation_type;
		}
		
		public SaleFPS() {
			
		}

}
