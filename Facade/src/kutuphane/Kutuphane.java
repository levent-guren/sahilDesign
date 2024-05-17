package kutuphane;

import java.util.HashMap;
import java.util.Map;

import kutuphane.Kitap.TUR;

public class Kutuphane {
	private Map<Kitap.TUR, Kat> katlar = new HashMap<>();

	public Kutuphane() {
		for (TUR tur : TUR.values()) {
			katlar.put(tur, new Kat());
		}
	}

	public void kitapEkle(Kitap kitap) {
		Kat kat = katlar.get(kitap.getTur());
		kat.kitapEkle(kitap);
	}

	public Kitap kitapCikar(String adi, TUR tur) {
		Kat kat = katlar.get(tur);
		return kat.kitapCikar(adi);
	}

}
