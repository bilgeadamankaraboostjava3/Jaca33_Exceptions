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
			// Dosyaya eriþim saðlýyorum.
			fl = new File("c:\\Ornek\\deneme.txt");
			bw = new BufferedWriter(new FileWriter(fl, false));
			bw.append("yeni bir satýr ekledim");
			bw.newLine();
			// Hata oldu
			String ifade = "bir ifade";
			System.out.println(ifade.charAt(0));
		
		}catch(Exception exception) {
			System.out.println("Hata oldu....: "+ exception.toString());
		}finally {
			/**
			 * Örn;
			 * bir dosya okuma iþleminde dosya önce açýlýr ve iþlem yapýlýr.
			 * bu arada bir sorun olur ise dosya açýk kalýr.
			 * bu tarz sorunlarla baþa çýkmak için bu blok kullanýlmalýdýr.
			 * Hata olsa da(istisna fýrlatýlsa da) olmasa da bu blok çalýþýr.
			 */
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("Ben her zaman çalýþýrým");
		}

	}
}
