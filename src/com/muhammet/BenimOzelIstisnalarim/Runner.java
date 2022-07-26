package com.muhammet.BenimOzelIstisnalarim;

public class Runner {
	private static OgrenciRepository db = new OgrenciRepository();
	public static void main(String[] args) {
	
		/**
		 * Burasý bir baþka arkadaþýmýn benim kodlarýmý denediði kýsým olsun
		 */
		ogrenciOlustur();
		ogrenciListesiGoruntule();
		
		System.out.println(db.findById(10L).toString());
		
		

		
	}
	
	private static  void ogrenciOlustur() {
		db.save("Ayþe", "GÜL");
		db.save("Deniz", "TEK");
		db.save("Gümüþ", "TURAN");
		db.save("Hande", "BEBEK");
		db.save("Ayhan", "KAÞIK");
	}
	
	public static void ogrenciListesiGoruntule() {
		// öðrenci listesi    her bir öðrenciyi döner
		db.findAll()          .forEach(System.out::println);
		
		//db.findAll()          .forEach(x-> System.out.println(x.toString()));
	}
}
