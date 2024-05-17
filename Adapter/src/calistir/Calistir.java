package calistir;

import ogrenci.Ogrenci;

public class Calistir {
	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setOzellik("adi", "Mahmut");
		ogrenci.setOzellik("soyadi", "Tuncer");
		ogrenci.setOzellik("yas", 48);
		System.out.println(ogrenci.getOzellik("adi"));
		System.out.println(ogrenci.getOzellik("yas"));
	}
}
