package islem;

public class ArsivIslemi extends Islem {

	@Override
	public void islemYap() {
		getDokumanlar()
				.forEach(d -> System.out.println(d + " arşivlendi"));
	}

}
