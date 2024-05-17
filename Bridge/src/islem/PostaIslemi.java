package islem;

public class PostaIslemi extends Islem {

	@Override
	public void islemYap() {
		getDokumanlar().forEach(d -> System.out
				.println(d + " basılarak posta olarak gönderildi"));
	}

}
