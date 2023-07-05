package com.jsp.hospital.exception;

import lombok.Getter;

@Getter
public class IdNotFoundException extends RuntimeException {

	private String message;

	public IdNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	
	
}
