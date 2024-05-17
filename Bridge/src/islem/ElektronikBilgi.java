package islem;

public class ElektronikBilgi extends Islem {

	@Override
	public void islemYap() {
		getDokumanlar().forEach(
				d -> System.out.println(d + " eposta atıldı"));
	}

}
