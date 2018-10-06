package com.capgemini.customerapp.entity;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;



public class ErrorMessage {

	private String url;
	private String errorMessage;
	private HttpStatus status;
	private LocalDateTime time;

	public ErrorMessage() {
		super();
	}

	public ErrorMessage(String url, String errorMessage, LocalDateTime time, HttpStatus status) {
		super();
		this.url = url;
		this.errorMessage = errorMessage;
		this.time = time;
		this.status = status;
		
		System.out.println(this);
	}


	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ErrorMessage [url=" + url + ", errorMessage=" + errorMessage + ", status=" + status + ", time=" + time
				+ "]";
	}

	
	
	

}
