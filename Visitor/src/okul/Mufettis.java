package okul;

public class Mufettis implements Visitor {

	@Override
	public void accept(Kisi kisi) {
		System.out.println("Müfettiş: " + kisi.getAdi()
				+ " adlı kişiyi teftiş ediyor");
	}

}
