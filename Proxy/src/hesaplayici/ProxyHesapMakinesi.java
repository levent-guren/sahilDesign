package hesaplayici;

import java.util.ArrayList;
import java.util.List;

public class ProxyHesapMakinesi implements IHesapMakinesi {
	private HesapMakinesi hesapMakinesi;
	private List<String> islemler = new ArrayList<>();

	public ProxyHesapMakinesi(HesapMakinesi hesapMakinesi) {
		this.hesapMakinesi = hesapMakinesi;
	}

	@Override
	public int hesapla(int sayi1, int sayi2, char islem) {
		int sonuc = hesapMakinesi.hesapla(sayi1, sayi2, islem);
		StringBuilder log = new StringBuilder();
		log.append(sayi1);
		log.append(islem);
		log.append(sayi2);
		log.append("=");
		log.append(sonuc);
		islemler.add(log.toString());
		return sonuc;
	}

	public void yapilanIslemleriBas() {
		islemler.forEach(System.out::println);
	}

}
