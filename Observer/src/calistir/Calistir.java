package calistir;

import observer.Musteri;
import observer.Urun;

public class Calistir {
	public static void main(String[] args) {
		Musteri musteri1 = new Musteri("Ahmet");
		Musteri musteri2 = new Musteri("Mehmet");
		Urun urun = new Urun();
		// musteri1 ve musteri2 urun için subscribe oluyor.
		urun.stokBilgisiIcinMusteriEkle(musteri1);
		urun.stokBilgisiIcinMusteriEkle(musteri2);
		// urun stok miktarı değiştiğinde bilgi publish ediliyor.
		urun.setStokMiktari(10);
		urun.setStokMiktari(20);
	}
}
