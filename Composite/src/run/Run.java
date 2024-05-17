package run;

import personel.Personel;
import personel.PersonelComposite;

public class Run {
	public static void main(String[] args) {
		Personel p1 = new Personel("Ahmet");
		Personel p2 = new Personel("Mehmet");
		Personel p3 = new Personel("Ali");
		Personel p4 = new Personel("Ayşe");
		Personel p5 = new Personel("Fatma");
		Personel p6 = new Personel("Piraye");

		PersonelComposite kok = new PersonelComposite();
		kok.add(p1);

		PersonelComposite c1 = new PersonelComposite();
		PersonelComposite c2 = new PersonelComposite();
		c1.add(p2);
		c2.add(p3);

		kok.add(c1);
		kok.add(c2);

		PersonelComposite c3 = new PersonelComposite();
		c3.add(p4);

		c1.add(c3);

		PersonelComposite c4 = new PersonelComposite();
		c4.add(p5);
		c4.add(p6);

		c3.add(c4);
		kok.print(0);
	}
}
