package yemek;

import java.util.ArrayList;
import java.util.List;

public abstract class Yemek {
	private String adi;
	private List<String> malzemeler = new ArrayList<>();

	public void malzemeEkle(String malzeme) {
		malzemeler.add(malzeme);
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	// Factory Method pattern'i
	public abstract String getTarif();

	@Override
	public String toString() {
		StringBuilder sonuc = new StringBuilder();
		sonuc.append("Yemeğin adı: ");
		sonuc.append(adi);
		sonuc.append("\n\nMalzemeler: \n");
		malzemeler.forEach(malzeme -> {
			sonuc.append(malzeme);
			sonuc.append("\n");
		});
		sonuc.append("\nTarif: \n");
		sonuc.append(getTarif());
		return sonuc.toString();
	}
}
