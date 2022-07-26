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
		Optional<Ogrenci> listedeBulunan = ogrenciListesi
			.stream() // strem e dönüþtür.
			.filter( // filtrelemek için methodu çaðýr ve lambda ile arama yap.
			  //listedeki ogrencinin id ile dýþarýdan verilen ogrencinin id si eþit ise 
					x-> x.getId().equals(ogrenci.getId())
			).findFirst();
		if(listedeBulunan.isPresent()) {
				listedeBulunan.get().setAd(ogrenci.getAd());
				listedeBulunan.get().setSoyad(ogrenci.getSoyad());	
		}else
			throw new OgrenciException(ErrorType.REPOSITORY_ERROR_UPDATEERROR,
					"Güncelleme içnin gönderilen id ye karþýlýk bir deðer bulunamadý");
	}
	
	public Ogrenci findById(Long id) {		
		Optional<Ogrenci> ogrenci = ogrenciListesi.stream()
				.filter(x-> x.getId().equals(id)).findFirst();
		if(ogrenci.isEmpty()) {
			throw new OgrenciException(ErrorType.REPOSITORY_ERROR_NOTFOUND_ID);
		}else		
			return ogrenci.get();
		
	}
	
	public List<Ogrenci> findAll(){
		return ogrenciListesi;
	}
	
	
}
