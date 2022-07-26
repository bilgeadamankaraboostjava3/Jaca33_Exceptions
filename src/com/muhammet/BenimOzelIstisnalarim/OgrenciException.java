package com.muhammet.BenimOzelIstisnalarim;

public class OgrenciException extends RuntimeException{	
	private final ErrorType errortype;	
	public OgrenciException(ErrorType type) {
		super(type.getMessage());
		this.errortype = type;
	}

	public OgrenciException(ErrorType type, String message) {
		super(message);
		this.errortype = type;
	}

	public ErrorType getErrortype() {
		return errortype;
	}
	
	
}
