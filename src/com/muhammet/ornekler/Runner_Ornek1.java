package com.muhammet.ornekler;

import java.util.List;

public class Runner_Ornek1 {

	static String ifade;//unchecked
	static String[] gunler = {"P","S","�","Pe","C","Ct","Pa"};
	static List<String> ogrenciListesi;
	
	
	public static void main(String[] args) {
		try {
		/**
		 * Burada String ifade = null; �eklinde bize gelir.
		 * bir adresin i�aret etti�i hi�bir de�er yoktur.
		 * bu nedenle olmayan bir de�erin index:0 de�erine ula�maya
		 * �al���yoruz.
		 * NullPointerException
		 */
		 //System.out.println("ifadenin i�eri�i.....: "+ ifade.charAt(0));
		// .add
		//ogrenciListesi.add("Yeni ��enci");
		/**
		 * Dizilerin ba�lang�� indisleri -> 0 d�r.
		 * Son de�erleri -> boyut-1 
		 * Burada dizinin s�n�rlar� a��ld��� i�in istisna f�rlat�r
		 * ArrayIndexOutOfBoundsException
		 */
		System.out.println("Haftan�n�n 7. G�n�...: "+ gunler[7]);
		}catch(NullPointerException ex) {
			System.err.println("Null gelen de�ere eri�im yap�ld�.");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("Dizinin s�n�rlar� d���na ��k�ld�. Ge�erli bir index giriniz.");
		}
		
	}
}
