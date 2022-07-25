package com.muhammet;


public class Runner_Throw {

	public static void main(String[] args) {
		
		System.out.println("Kümesteki yumurta sayýsý");
		/**
		 * try..catch kullanmak zorunda mýyým? hayýr deðilim
		 * peki ilgili methodun istediði parameterleri verirsem
		 * try..catch kullanmamýn bir anlamý var mý? yok
		 */
		int kumesid = 10;
		if(kumesid<0 || kumesid>100) {
			System.out.println("geçerli id gir");
		}else
			System.out.println(yumurtaSay(kumesid));
		
		/**
		 * Checked Exception -> bir istisna fýrlatýr ve bu fýrlatýlan method u kullanmak
		 * isteyen kiþi bunu sarmalamak zorundadýr.
		 * Unchecked Exception -> bir istisna fýrlatýr ancak kullanan kiþinin bir
		 * aksiyon almasý zorunlu deðildir.
		 */
		
		/**
		 * fýrlattýðýnýz hata method u dahil , tüm methodlar istisna fýrlatmaya
		 * zorluyor ise, bunu ya try...catch bloðu içinde kullanýrsýnýz ya da 
		 * ilgili method u kullandýðýnýz method baþlýðýna throw ile istisna fýrlatýrsýnýz.
		 */
		try {
			yumurtaSayDikkat(11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Sistemde bulunan kümeslerin günlük yumurta üretimlerini veren method tur
	 * @param kumesId -> sisteme kayýtlý kümes numarasý 0-100 arsýndadýr
	 * @return -> kümeste bulunan yumurta sayýsýný döner
	 */
	public static int yumurtaSay(int kumesId) { // Unchecked Exception using
		if(kumesId<0 || kumesId>100) {
			// sorun var 
			/**
			 * Özelleþtirilmiþ istisna fýrlatmak.
			 */
			throw new ArithmeticException("Geçersiz bir kümes id si girdiniz");
		}else {
			return 100;
		}
	}

	public static int yumurtaSayDikkat(int kumesId) throws Exception { // Checked Exception using
		if(kumesId<0 || kumesId>100) {
			// sorun var 
			/**
			 * Özelleþtirilmiþ istisna fýrlatmak.
			 */
			throw new ArithmeticException("Geçersiz bir kümes id si girdiniz");
		}else {
			return 100;
		}
	}
}
