package com.muhammet.BenimOzelIstisnalarim;

public enum ErrorType {

	REPOSITORY_ERROR_NOTFOUND_ID(20,"Aranılan id ile veriye ulaşılamamıştır"),
	REPOSITORY_ERROR_UPDATEERROR(21,"Kullanıcı güncellenirken hata oldu");
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
