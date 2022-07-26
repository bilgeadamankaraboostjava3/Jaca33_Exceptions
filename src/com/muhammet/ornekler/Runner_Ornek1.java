package com.muhammet.ornekler;

import java.util.List;

public class Runner_Ornek1 {

	static String ifade;//unchecked
	static String[] gunler = {"P","S","Ç","Pe","C","Ct","Pa"};
	static List<String> ogrenciListesi;
	
	
	public static void main(String[] args) {
		try {
		/**
		 * Burada String ifade = null; þeklinde bize gelir.
		 * bir adresin iþaret ettiði hiçbir deðer yoktur.
		 * bu nedenle olmayan bir deðerin index:0 deðerine ulaþmaya
		 * çalýþýyoruz.
		 * NullPointerException
		 */
		 //System.out.println("ifadenin içeriði.....: "+ ifade.charAt(0));
		// .add
		//ogrenciListesi.add("Yeni Öðenci");
		/**
		 * Dizilerin baþlangýç indisleri -> 0 dýr.
		 * Son deðerleri -> boyut-1 
		 * Burada dizinin sýnýrlarý aþýldýðý için istisna fýrlatýr
		 * ArrayIndexOutOfBoundsException
		 */
		System.out.println("Haftanýnýn 7. Günü...: "+ gunler[7]);
		}catch(NullPointerException ex) {
			System.err.println("Null gelen deðere eriþim yapýldý.");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("Dizinin sýnýrlarý dýþýna çýkýldý. Geçerli bir index giriniz.");
		}
		
	}
}
