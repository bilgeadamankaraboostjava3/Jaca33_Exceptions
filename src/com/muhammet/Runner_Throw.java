package com.muhammet;


public class Runner_Throw {

	public static void main(String[] args) {
		
		System.out.println("K�mesteki yumurta say�s�");
		/**
		 * try..catch kullanmak zorunda m�y�m? hay�r de�ilim
		 * peki ilgili methodun istedi�i parameterleri verirsem
		 * try..catch kullanmam�n bir anlam� var m�? yok
		 */
		int kumesid = 10;
		if(kumesid<0 || kumesid>100) {
			System.out.println("ge�erli id gir");
		}else
			System.out.println(yumurtaSay(kumesid));
		
		/**
		 * Checked Exception -> bir istisna f�rlat�r ve bu f�rlat�lan method u kullanmak
		 * isteyen ki�i bunu sarmalamak zorundad�r.
		 * Unchecked Exception -> bir istisna f�rlat�r ancak kullanan ki�inin bir
		 * aksiyon almas� zorunlu de�ildir.
		 */
		
		/**
		 * f�rlatt���n�z hata method u dahil , t�m methodlar istisna f�rlatmaya
		 * zorluyor ise, bunu ya try...catch blo�u i�inde kullan�rs�n�z ya da 
		 * ilgili method u kulland���n�z method ba�l���na throw ile istisna f�rlat�rs�n�z.
		 */
		try {
			yumurtaSayDikkat(11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Sistemde bulunan k�meslerin g�nl�k yumurta �retimlerini veren method tur
	 * @param kumesId -> sisteme kay�tl� k�mes numaras� 0-100 ars�ndad�r
	 * @return -> k�meste bulunan yumurta say�s�n� d�ner
	 */
	public static int yumurtaSay(int kumesId) { // Unchecked Exception using
		if(kumesId<0 || kumesId>100) {
			// sorun var 
			/**
			 * �zelle�tirilmi� istisna f�rlatmak.
			 */
			throw new ArithmeticException("Ge�ersiz bir k�mes id si girdiniz");
		}else {
			return 100;
		}
	}

	public static int yumurtaSayDikkat(int kumesId) throws Exception { // Checked Exception using
		if(kumesId<0 || kumesId>100) {
			// sorun var 
			/**
			 * �zelle�tirilmi� istisna f�rlatmak.
			 */
			throw new ArithmeticException("Ge�ersiz bir k�mes id si girdiniz");
		}else {
			return 100;
		}
	}
}
