package com.bytestree.restful.controller.exception;

public class ExceptionThrower {

	public void throwGeneralException()throws Exception{
		Exception e = new Exception("Error from General Exeption");
		throw e;
	}
	
	public void throwCustomException()throws CustomException{
		CustomException e = new CustomException();
		e.setCode(10);
		e.setMessage("wrong id entered");
		throw e;
	}
	
	public void throwNotaValidAgeException()throws CustomException{
		CustomException e = new CustomException();
		e.setCode(10);
		e.setMessage("Employee age is Not Valid");
		throw e;
	}
	
}
