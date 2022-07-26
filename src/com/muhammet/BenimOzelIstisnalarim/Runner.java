package com.muhammet.BenimOzelIstisnalarim;

public class Runner {
	private static OgrenciRepository db = new OgrenciRepository();
	public static void main(String[] args) {
	
		/**
		 * Buras� bir ba�ka arkada��m�n benim kodlar�m� denedi�i k�s�m olsun
		 */
		ogrenciOlustur();
		ogrenciListesiGoruntule();
		
		System.out.println(db.findById(10L).toString());
		
		

		
	}
	
	private static  void ogrenciOlustur() {
		db.save("Ay�e", "G�L");
		db.save("Deniz", "TEK");
		db.save("G�m��", "TURAN");
		db.save("Hande", "BEBEK");
		db.save("Ayhan", "KA�IK");
	}
	
	public static void ogrenciListesiGoruntule() {
		// ��renci listesi    her bir ��renciyi d�ner
		db.findAll()          .forEach(System.out::println);
		
		//db.findAll()          .forEach(x-> System.out.println(x.toString()));
	}
}
