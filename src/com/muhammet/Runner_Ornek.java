package com.muhammet;

import java.util.Scanner;

public class Runner_Ornek {

	public static void main(String[] args) {
		
		System.out.println("********************************");
		System.out.println("*******  Okul Otomasyonu *******");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1- Ders Olu�tur");
		System.out.println("2- ��renci Olu�tur");
		System.out.println("3- ��renciye Ders Ata");
		System.out.println("0- �IKI�");		
		
			int secim = secimYap();
				
				
				
		System.out.println("PROGRAM B�TT�.");		
	}
	
	private static int secimYap() {
		Scanner sc;
		int secim=0;
		boolean isRepeat=false;
		do {
			sc = new Scanner(System.in);
			System.out.print("Se�iminiz.....: ");
			try {
				secim = sc.nextInt();//��
				if(secim<0 || secim>3) {
					System.out.println("L�tfen (0-3) aras� de�er giriniz..");
					isRepeat=true;
				}else isRepeat=false;
			}catch(Exception exception) {
				System.err.println("L�tfen ge�erli say�sal bir de�er giriniz.");
				isRepeat=true;
			}			
		}while(isRepeat);
		return secim;
	}

}
