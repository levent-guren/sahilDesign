package yorumlayici;

import java.util.ArrayList;
import java.util.List;

public class SayiYorumlayici implements Yorumlayici {
	private List<Integer> sayilar = new ArrayList<>();

	public void yorumla(String ifade) {
		String[] degerler = ifade.split(" ");
		for (String deger : degerler) {
			try {
				Integer sayi = Integer.valueOf(deger);
				sayilar.add(sayi);
			} catch (NumberFormatException e) {
				// sayi gelmedi.
			}
		}
	}

	public int getIlkSayi() {
		int sayi = sayilar.get(0);
		sayilar.remove(0);
		return sayi;
	}

	public void basaSayiEkle(int sayi) {
		sayilar.add(0, sayi);
	}
}
