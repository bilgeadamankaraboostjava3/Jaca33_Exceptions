package com.muhammet;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		/**
		 * Exceptions -> Beklenmeyen bir durum olduðunda oluþan, ya da
		 * fýrlatýlan istisnadýr. Kodlarýmýzý bu durumlara göre incelememiz
		 * gerekebilir. kontrol etmek için;
		 * try...catch bloðu kullanýlýr. 
		 */
		int s1=0,s2=0,toplam=0;
		Scanner sc;
		/**
		 * gövdesine yazýlan kodu çalýþtýrmayý dener, eðer bir hata olmaz
		 * ise uygulama normal akýþýnda devam eder.
		 * ancak, beklenmeyen bir durum olur ise o zaman oluþan istisna yakalanýr.
		 */
		boolean isException= false;
		do {
			try {
				sc = new Scanner(System.in);
				System.out.print("1. sayýyý giriniz....: ");
				s1 = sc.nextInt();
				System.out.print("2. sayýyý giriniz....: ");
				s2 = sc.nextInt();
				toplam = s1+s2;
				System.out.println("Toplam.....: "+toplam);
				/**
				 * Eðer uygulama öncesinde hata ile karþýlaþýr ise isException true
				 * olarak kalýr bu nedenle sorunsuz çalýþan kod bittiðinde 
				 * isException deðeri false çekilmelidir.
				 */
				isException=false;
			}catch (Exception e) {
				System.err.println("Lütfen geçerli bir sayýsal deðer giriniz.");
				System.out.println("Oluþan hata....: "+e.toString());
				isException=true;
			}
			/**
			 *  parantezin içi doðru ise döngü devam etsin
			 *  isException ==true -> bir hata var ise döngü devam etsin
			 */
		}while(isException);
		
		System.out.println("UYGULAMA SONLANDI");

	}//Main Sonu
}//Class Sonu
