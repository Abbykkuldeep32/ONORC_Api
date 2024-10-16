package com.example.dealer.response;

public class SaveResponse {
	private boolean status;
	private String message;
    //private Grievance grievance;

    // Getters and Setters
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


	public SaveResponse(boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
    
	
    
}
