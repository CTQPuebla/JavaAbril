package com.msempleados.exception;

public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	int idException;
	public BusinessException() {
		super();
	}
	public BusinessException(String message) {
		super(message);
	}
	public BusinessException(int idException) {
		this.idException = idException;
	}
	public int getIdException() {
		return idException;
	}
	public void setIdException(int idException) {
		this.idException = idException;
	}
	
	

}

