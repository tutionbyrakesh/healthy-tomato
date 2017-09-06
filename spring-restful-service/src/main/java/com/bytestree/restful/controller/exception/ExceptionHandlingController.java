package com.bytestree.restful.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlingController {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> generalException(Exception e) throws Exception{
		ExceptionResponse er = new ExceptionResponse();
		er.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		er.setDescription(e.getMessage());
		System.out.println(e);
		return new ResponseEntity<ExceptionResponse>(er,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ExceptionResponse> generalException(CustomException e) throws Exception{
		ExceptionResponse er = new ExceptionResponse();
		er.setCode(HttpStatus.BAD_REQUEST.value());
		er.setDescription(e.getMessage());
		System.out.println(e);
		return new ResponseEntity<ExceptionResponse>(er,HttpStatus.BAD_REQUEST);
	}
}
