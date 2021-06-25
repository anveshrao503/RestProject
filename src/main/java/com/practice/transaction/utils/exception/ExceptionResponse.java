package com.practice.transaction.utils.exception;

import java.util.Date;

public class ExceptionResponse {
	// this class is used to follow a same exception format through  out the application
	// and to apply this format we need to a Rest controller annotated with Controller
	//annotated with ControllerAdivce
	
	private Date timestamp;
	private String message;
	private String details;
	
	
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	

}
