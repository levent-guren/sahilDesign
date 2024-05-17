package calistir;

import nobet.BilgiIslem;
import nobet.Harekat;
import nobet.Karargah;
import nobet.Personel;

public class Calistir {
	public static void main(String[] args) {
		Personel personel = new Personel("Penbe", new Harekat());
		personel.nobetTut();
		personel.setNobet(new BilgiIslem());
		personel.nobetTut();

		Personel personel2 = new Personel("Selvinaz", new Karargah());
		personel2.nobetTut();
	}
}
