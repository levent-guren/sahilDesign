package kutuphane;

import java.util.ArrayList;
import java.util.List;

public class Raf {
	private List<Kitap> kitaplar = new ArrayList<>();

	public void ekle(Kitap kitap) {
		kitaplar.add(kitap);
	}

	public Kitap kitapCikar(String adi) {
		Kitap kitap = kitaplar.stream()
				.filter(k -> k.getAdi().equals(adi)).findFirst()
				.orElse(null);

		if (kitap != null) {
			kitaplar.remove(kitap);
		}

		return kitap;
	}
}
