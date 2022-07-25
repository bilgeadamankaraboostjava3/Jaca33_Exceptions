package com.muhammet;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		/**
		 * Exceptions -> Beklenmeyen bir durum oldu�unda olu�an, ya da
		 * f�rlat�lan istisnad�r. Kodlar�m�z� bu durumlara g�re incelememiz
		 * gerekebilir. kontrol etmek i�in;
		 * try...catch blo�u kullan�l�r. 
		 */
		int s1=0,s2=0,toplam=0;
		Scanner sc;
		/**
		 * g�vdesine yaz�lan kodu �al��t�rmay� dener, e�er bir hata olmaz
		 * ise uygulama normal ak���nda devam eder.
		 * ancak, beklenmeyen bir durum olur ise o zaman olu�an istisna yakalan�r.
		 */
		boolean isException= false;
		do {
			try {
				sc = new Scanner(System.in);
				System.out.print("1. say�y� giriniz....: ");
				s1 = sc.nextInt();
				System.out.print("2. say�y� giriniz....: ");
				s2 = sc.nextInt();
				toplam = s1+s2;
				System.out.println("Toplam.....: "+toplam);
				/**
				 * E�er uygulama �ncesinde hata ile kar��la��r ise isException true
				 * olarak kal�r bu nedenle sorunsuz �al��an kod bitti�inde 
				 * isException de�eri false �ekilmelidir.
				 */
				isException=false;
			}catch (Exception e) {
				System.err.println("L�tfen ge�erli bir say�sal de�er giriniz.");
				System.out.println("Olu�an hata....: "+e.toString());
				isException=true;
			}
			/**
			 *  parantezin i�i do�ru ise d�ng� devam etsin
			 *  isException ==true -> bir hata var ise d�ng� devam etsin
			 */
		}while(isException);
		
		System.out.println("UYGULAMA SONLANDI");

	}//Main Sonu
}//Class Sonu
