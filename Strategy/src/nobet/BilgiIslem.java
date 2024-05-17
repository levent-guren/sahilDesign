package nobet;

public class BilgiIslem implements Nobet {

	@Override
	public void nobetTut(Personel personel) {
		System.out.println(
				personel.getAd() + " bilgi işlem nöbeti tutuyor");
	}

}
