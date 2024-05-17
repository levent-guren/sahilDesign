package calistir;

import hesaplayici.HesapMakinesi;
import hesaplayici.IHesapMakinesi;
import hesaplayici.ProxyHesapMakinesi;

public class Calistir {
	public static void main(String[] args) {
		IHesapMakinesi hesapMakinesi = new ProxyHesapMakinesi(
				new HesapMakinesi());
		hesapMakinesi.hesapla(2, 3, '*');
		hesapMakinesi.hesapla(5, 2, '+');
		hesapMakinesi.hesapla(3, 1, '-');
		hesapMakinesi.hesapla(15, 3, '/');

		((ProxyHesapMakinesi) hesapMakinesi).yapilanIslemleriBas();

	}
}
