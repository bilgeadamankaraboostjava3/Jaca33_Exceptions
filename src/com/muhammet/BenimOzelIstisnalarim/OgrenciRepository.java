package com.muhammet.BenimOzelIstisnalarim;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OgrenciRepository {

	private List<Ogrenci> ogrenciListesi;

	public OgrenciRepository() {
		ogrenciListesi = new ArrayList<Ogrenci>();
	}
	
	public void save(String ad,String soyad) {
		ogrenciListesi.add(new Ogrenci(ad,soyad));
	}
	
	public void update(Ogrenci ogrenci) {
		Ogrenci listedeBulunan = ogrenciListesi
			.stream() // strem e d�n��t�r.
			.filter( // filtrelemek i�in methodu �a��r ve lambda ile arama yap.
			  //listedeki ogrencinin id ile d��ar�dan verilen ogrencinin id si e�it ise 
					x-> x.getId().equals(ogrenci.getId())
			).findFirst().get();
		listedeBulunan.setAd(ogrenci.getAd());
		listedeBulunan.setSoyad(ogrenci.getSoyad());
	}
	
	public Ogrenci findById(Long id) {		
		Optional<Ogrenci> ogrenci = ogrenciListesi.stream()
				.filter(x-> x.getId().equals(id)).findFirst();
		if(ogrenci.isEmpty()) {
			throw new OgrenciException("Bu id ile ��renci yoktur.");
		}else		
			return ogrenci.get();
		
	}
	
	public List<Ogrenci> findAll(){
		return ogrenciListesi;
	}
	
	
}
