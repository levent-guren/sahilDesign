package hesap;

import yorumlayici.KarakterYorumlayici;
import yorumlayici.SayiYorumlayici;

public class PostFixHesapMakinesi {
	private KarakterYorumlayici karakterYorumlayici = new KarakterYorumlayici();
	private SayiYorumlayici sayiYorumlayici = new SayiYorumlayici();

	public int hesapla(String ifade) {
		karakterYorumlayici.yorumla(ifade);
		sayiYorumlayici.yorumla(ifade);
		while (karakterYorumlayici.getKalanIslemSayisi() > 0) {
			int sayi1 = sayiYorumlayici.getIlkSayi();
			int sayi2 = sayiYorumlayici.getIlkSayi();
			String islem = karakterYorumlayici.getIlkIslem();
			int sonuc = hesapla(sayi1, sayi2, islem);
			sayiYorumlayici.basaSayiEkle(sonuc);
		}
		return sayiYorumlayici.getIlkSayi();
	}

	private int hesapla(int sayi1, int sayi2, String islem) {
		switch (islem) {
		case "+":
			return sayi1 + sayi2;
		case "-":
			return sayi1 - sayi2;
		case "*":
			return sayi1 * sayi2;
		case "/":
			return sayi1 / sayi2;
		}
		System.out.println("Yanlış işlem");
		return 0;
	}

}
