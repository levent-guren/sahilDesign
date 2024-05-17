package calistir;

import kutuphane.Kitap;
import kutuphane.Kitap.TUR;
import kutuphane.Kutuphane;
import kutuphane.Kutuphaneci;

public class Calistir {
	public static void main(String[] args) {
		Kutuphaneci kutuphaneci = new Kutuphaneci(new Kutuphane());
		kutuphaneci.kitapEkle(new Kitap("Kaşağı", TUR.OYKU));
		kutuphaneci.kitapEkle(new Kitap("Harem", TUR.OYKU));
		kutuphaneci.kitapEkle(new Kitap("Sefiller", TUR.ROMAN));
		kutuphaneci.kitapEkle(new Kitap(
				"Denizler Altında 20000 Fersah", TUR.BILIMKURGU));
		kutuphaneci.kitapEkle(
				new Kitap("Kendini Şımart", TUR.KISISEL_GELISIM));

		Kitap kitap = kutuphaneci.kitapCikar("Harem", TUR.OYKU);
		System.out.println(kitap);

		Kitap kitap2 = kutuphaneci.kitapCikar("Harem", TUR.OYKU);
		System.out.println(kitap2);

	}
}
