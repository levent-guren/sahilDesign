package calistir;

import bean.Adres;
import bean.Personel2;

public class Calistir2 {
	public static void main(String[] args) {
		// Personel clone'u çıkarıldığında içindeki adres'in de kopyası çıkıyor.
		// Dolayısı ile sonunda elimizde 2 Personel ve 2 adres oluşuyor. Her 2
		// personelin de adresi farklı instance oluyor.
		Personel2 personel = new Personel2();
		personel.setAdi("Abdulmuttalip");

		Adres adres = new Adres();
		adres.setIl("Ankara");
		adres.setIlce("Çankaya");
		adres.setMahalle("100. Yıl");
		adres.setCadde("12");

		personel.setAdres(adres);
		System.out.println(personel);

		try {
			Personel2 personel2 = (Personel2) personel.clone();
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
