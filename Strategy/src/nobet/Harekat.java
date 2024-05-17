package nobet;

public class Harekat implements Nobet {

	@Override
	public void nobetTut(Personel personel) {
		System.out.println(
				personel.getAd() + " harekat nöbeti tutuyor");
	}

}
