package calistir;

import java.util.ArrayList;
import java.util.List;

import urun.Bilgisayar;
import urun.HardDisk;
import urun.IndirimliUrun;
import urun.Urun;
import urun.Yazici;
import urun.YildizliUrun;

public class Calistir {
	public static void main(String[] args) {
		List<Urun> urunler = new ArrayList<>();
		urunler.add(new IndirimliUrun(new Bilgisayar("HP", 30000)));
		urunler.add(new Bilgisayar("Monster", 80000));
		urunler.add(new IndirimliUrun(
				new YildizliUrun(new HardDisk("SeaGate", 2000))));
		urunler.add(new YildizliUrun(new Yazici("Canon", 12000)));

		urunler.forEach(System.out::println);

	}
}
