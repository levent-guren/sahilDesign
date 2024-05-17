package mediator;

public class Ufo extends HavaAraci {

	public Ufo(String ucusNo) {
		super(ucusNo);
	}

	@Override
	public void mesajAl(String mesaj, String kimden, String kime) {
		System.out.println(getUcusNo()
				+ " uçuş no'lu UFO'ya mesaj geldi: " + mesaj);
		System.out.println("Kimden: " + kimden);
		System.out.println(
				"Kime: " + (kime == null ? "herkese" : kime));
	}

	@Override
	public String toString() {
		return "Ufo [" + getUcusNo() + "]";
	}

}
