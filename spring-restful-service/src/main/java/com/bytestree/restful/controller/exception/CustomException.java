package com.bytestree.restful.controller.exception;

import org.springframework.stereotype.Component;

@Component
public class CustomException extends Exception {
	private static final long serialVersionUID = 565018016831734828L;
	
	private int code;
	private String message;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
