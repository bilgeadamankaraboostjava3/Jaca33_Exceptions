package com.muhammet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner_Ornek2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("1. say�....:");
		int s1 = sc.nextInt();
		
		System.out.print("2. say�....:");
		int s2 = sc.nextInt();
		
		int bolum = s2/s1;
		
		System.out.println("Bol�m.....: "+ bolum);
		/**
		 * catch -> f�rlat�lan hatay� yakalar.
		 * o zaman �zel olarak belirledi�imiz hatalar i�in �zelle�tirme yapabiliriz.
		 */
		}catch(InputMismatchException exception) {
			System.out.println("L�tfen ge�erli bir say�sal de�er giriniz.");
		}catch(ArithmeticException exception) {
			System.out.println("��lem Hatas� olu�tu. L�tfen  girdi�iniz de�erleri kontrol ediniz.");
		}catch(Exception ex){
			/**
			 * t�m istisnalar� belirleyip kapsad�ktan sonra olu�abilecek hatalar i�in log lama yap�n�z.
			 * Db -> hatay� datbase e log lar�m
			 * ---- timestamp
			 * ---- kullan�c� ad�
			 * ---- hatan�n oldu�u class-> method al�r�m
			 * ---- olu�an hatan�n ayr�nt�s�n� 
			 * ------------
			 * txt -> not defterinin i�erisine sat�r sat�r i�lerim.
			 */
			System.out.println("Beklenmeyen bir hata olu�tu. L�tfen 0000 ile ileti�ime ge�iniz.");
		}
	}

}
