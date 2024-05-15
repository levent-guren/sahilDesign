package calistir;

import bean.Adres;
import bean.Personel;

public class Calistir {
	public static void main(String[] args) {
		// Personel clone'u çıkarıldığında içindeki adres'in kopyası çıkmıyor.
		// Dolayısı ile sonunda elimizde 2 Personel ve 1 adres oluşuyor. Her 2
		// personelin de adresi aynı instance oluyor.
		Personel personel = new Personel();
		personel.setAdi("Abdulmuttalip");

		Adres adres = new Adres();
		adres.setIl("Ankara");
		adres.setIlce("Çankaya");
		adres.setMahalle("100. Yıl");
		adres.setCadde("12");

		personel.setAdres(adres);
		System.out.println(personel);

		try {
			Personel personel2 = (Personel) personel.clone();
			System.out.println(personel2);
			personel.setAdi("Kamile");
			System.out.println(personel);
			System.out.println(personel2);
			System.out.println("---------");
			personel.getAdres().setIl("İstanbul");
			System.out.println(personel);
			System.out.println(personel2);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
