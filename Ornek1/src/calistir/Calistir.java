package calistir;

import bean.Personel;

public class Calistir {
	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.setAdi("Şazument");
		deneme(personel);
		System.out.println(personel.getAdi());
		System.out.println(1);
		deneme2(personel.getAdi());
		System.out.println(personel.getAdi());
	}

	private static void deneme2(String adi) {
		System.out.println(adi);
		adi = "Murteza";
	}

	private static void deneme(Personel personel) {
		System.out.println(personel.getAdi());
		personel.setAdi("Şaziye");
	}
}
