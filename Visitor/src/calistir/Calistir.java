package calistir;

import okul.Mufettis;
import okul.Ogrenci;
import okul.Ogretmen;
import okul.Okul;
import okul.OkulMuduru;
import okul.SaglikMemuru;

public class Calistir {
	public static void main(String[] args) {
		Okul okul = new Okul();
		okul.getKisiler().add(new Ogrenci("Ali"));
		okul.getKisiler().add(new Ogrenci("Veli"));
		okul.getKisiler().add(new Ogretmen("Kardelen"));
		okul.getKisiler().add(new OkulMuduru("Osman"));

		SaglikMemuru saglikMemuru = new SaglikMemuru();
		okul.visit(saglikMemuru);

		Mufettis mufettis = new Mufettis();
		okul.visit(mufettis);
	}
}
