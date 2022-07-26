package com.muhammet.BenimOzelIstisnalarim;

public enum ErrorType {

	REPOSITORY_ERROR_NOTFOUND_ID(20,"Aranýlan id ile veriye ulaþýlamamýþtýr"),
	REPOSITORY_ERROR_UPDATEERROR(21,"Kullanýcý güncellenirken hata oldu"),
	REPOSITORY_ERROR_UPDATEERROR_ID(211,"Kullanýcý güncellenirken hata oldu, id geçersiz"),
	
	;
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
