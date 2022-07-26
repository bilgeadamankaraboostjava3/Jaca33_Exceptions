package com.muhammet.BenimOzelIstisnalarim;

public class Ogrenci {
	
	private static long count=1L;
	private Long id;
	private String ad;
	private String soyad;
	
	
		
	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + "]";
	}


	public Ogrenci() {
		super();
	}
	
	
	public Ogrenci(Long id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
	}


	public Ogrenci(String ad, String soyad) {
		super();
		id = count++;
		this.ad = ad;
		this.soyad = soyad;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	
}
