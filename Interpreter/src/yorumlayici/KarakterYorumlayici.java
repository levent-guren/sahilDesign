package yorumlayici;

import java.util.ArrayList;
import java.util.List;

public class KarakterYorumlayici implements Yorumlayici {
	private List<String> islemler = new ArrayList<>();

	public void yorumla(String ifade) {
		String[] degerler = ifade.split(" ");
		for (String deger : degerler) {
			if ("+".equals(deger) || "-".equals(deger)
					|| "*".equals(deger) || "/".equals(deger)) {
				{
					islemler.add(deger);
				}
			}
		}
	}

	public int getKalanIslemSayisi() {
		return islemler.size();
	}

	public String getIlkIslem() {
		String islem = islemler.get(0);
		islemler.remove(0);
		return islem;
	}
}