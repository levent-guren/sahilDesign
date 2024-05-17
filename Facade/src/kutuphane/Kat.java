package kutuphane;

import java.util.HashMap;
import java.util.Map;

public class Kat {
	private Map<Character, Raf> raflar = new HashMap<>();

	public Raf getRaf(char rafNo) {
		rafNo = Character.toUpperCase(rafNo);
		Raf raf = raflar.get(rafNo);
		if (raf == null) {
			raf = new Raf();
			raflar.put(rafNo, raf);
		}
		return raf;
	}

	public void kitapEkle(Kitap kitap) {
		Raf raf = getRaf(kitap.getAdi().charAt(0));
		raf.ekle(kitap);
	}

	public Kitap kitapCikar(String adi) {
		Raf raf = getRaf(adi.charAt(0));
		return raf.kitapCikar(adi);
	}
}
