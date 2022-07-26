package com.muhammet.BenimOzelIstisnalarim;

public enum ErrorType {

	REPOSITORY_ERROR_NOTFOUND_ID(20,"Aran�lan id ile veriye ula��lamam��t�r"),
	REPOSITORY_ERROR_UPDATEERROR(21,"Kullan�c� g�ncellenirken hata oldu");
	private int code;
	private String message;
	
	
	private ErrorType() {
	}
	private ErrorType(int code, String message) {
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	
}
