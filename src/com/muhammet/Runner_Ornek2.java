package com.muhammet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner_Ornek2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("1. sayý....:");
		int s1 = sc.nextInt();
		
		System.out.print("2. sayý....:");
		int s2 = sc.nextInt();
		
		int bolum = s2/s1;
		
		System.out.println("Bolüm.....: "+ bolum);
		/**
		 * catch -> fýrlatýlan hatayý yakalar.
		 * o zaman özel olarak belirlediðimiz hatalar için özelleþtirme yapabiliriz.
		 */
		}catch(InputMismatchException exception) {
			System.out.println("Lütfen geçerli bir sayýsal deðer giriniz.");
		}catch(ArithmeticException exception) {
			System.out.println("Ýþlem Hatasý oluþtu. Lütfen  girdiðiniz deðerleri kontrol ediniz.");
		}catch(Exception ex){
			/**
			 * tüm istisnalarý belirleyip kapsadýktan sonra oluþabilecek hatalar için log lama yapýnýz.
			 * Db -> hatayý datbase e log larým
			 * ---- timestamp
			 * ---- kullanýcý adý
			 * ---- hatanýn olduðu class-> method alýrým
			 * ---- oluþan hatanýn ayrýntýsýný 
			 * ------------
			 * txt -> not defterinin içerisine satýr satýr iþlerim.
			 */
			System.out.println("Beklenmeyen bir hata oluþtu. Lütfen 0000 ile iletiþime geçiniz.");
		}
	}

}
