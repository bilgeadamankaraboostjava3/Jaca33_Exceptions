package com.muhammet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Runner_Finaly {

	public static void main(String[] args) {
		File fl ;
		BufferedWriter bw=null;
		try {
			// Dosyaya eri�im sa�l�yorum.
			fl = new File("c:\\Ornek\\deneme.txt");
			bw = new BufferedWriter(new FileWriter(fl, false));
			bw.append("yeni bir sat�r ekledim");
			bw.newLine();
			// Hata oldu
			String ifade = "bir ifade";
			System.out.println(ifade.charAt(0));
		
		}catch(Exception exception) {
			System.out.println("Hata oldu....: "+ exception.toString());
		}finally {
			/**
			 * �rn;
			 * bir dosya okuma i�leminde dosya �nce a��l�r ve i�lem yap�l�r.
			 * bu arada bir sorun olur ise dosya a��k kal�r.
			 * bu tarz sorunlarla ba�a ��kmak i�in bu blok kullan�lmal�d�r.
			 * Hata olsa da(istisna f�rlat�lsa da) olmasa da bu blok �al���r.
			 */
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("Ben her zaman �al���r�m");
		}

	}
}
