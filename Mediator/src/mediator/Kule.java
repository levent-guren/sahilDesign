package mediator;

import java.util.ArrayList;
import java.util.List;

public class Kule {
	private List<HavaAraci> araclar = new ArrayList<>();

	public void kuleyeBaglan(HavaAraci arac) {
		araclar.add(arac);
		System.out.println(arac + " kuleye bağlandı");
	}

	public void kuledenAyril(HavaAraci arac) {
		araclar.remove(arac);
		System.out.println(arac + " kuleden ayrıldı");
	}

	public void mesajGonder(HavaAraci arac, String ucusNo,
			String mesaj) {
		if (ucusNo == null) {
			// mesaj kendisi hariç herkese gönderiliyor
			araclar.stream().filter(
					a -> !a.getUcusNo().equals(arac.getUcusNo()))
					.forEach(havaAraci -> havaAraci.mesajAl(mesaj,
							arac.getUcusNo(), null));
		} else {
			// mesaj belirli bir hava aracı için gönderiliyor
			araclar.stream().filter(a -> a.getUcusNo().equals(ucusNo))
					.forEach(havaAraci -> havaAraci.mesajAl(mesaj,
							arac.getUcusNo(), ucusNo));
		}
	}
}
