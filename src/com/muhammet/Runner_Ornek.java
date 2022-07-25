package com.muhammet;

import java.util.Scanner;

public class Runner_Ornek {

	public static void main(String[] args) {
		
		System.out.println("********************************");
		System.out.println("*******  Okul Otomasyonu *******");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1- Ders Oluþtur");
		System.out.println("2- Öðrenci Oluþtur");
		System.out.println("3- Öðrenciye Ders Ata");
		System.out.println("0- ÇIKIÞ");		
		
			int secim = secimYap();
				
				
				
		System.out.println("PROGRAM BÝTTÝ.");		
	}
	
	private static int secimYap() {
		Scanner sc;
		int secim=0;
		boolean isRepeat=false;
		do {
			sc = new Scanner(System.in);
			System.out.print("Seçiminiz.....: ");
			try {
				secim = sc.nextInt();//üç
				if(secim<0 || secim>3) {
					System.out.println("Lütfen (0-3) arasý deðer giriniz..");
					isRepeat=true;
				}else isRepeat=false;
			}catch(Exception exception) {
				System.err.println("Lütfen geçerli sayýsal bir deðer giriniz.");
				isRepeat=true;
			}			
		}while(isRepeat);
		return secim;
	}

}
