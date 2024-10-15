package com.example.dealer.response;

import com.example.dealer.model.Grievance;

public class SaveResponse {
	private boolean success;
	private String message;
    private Grievance grievance;

    // Getters and Setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Grievance getGrievance() {
        return grievance;
    }

    public void setGrievance(Grievance grievance) {
        this.grievance = grievance;
    }

	public SaveResponse(boolean success, String message, Grievance grievance) {
		super();
		this.success = success;
		this.message = message;
		this.grievance = grievance;
	}

	public SaveResponse(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
    
	
    
}
