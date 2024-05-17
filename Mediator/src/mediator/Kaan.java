package mediator;

public class Kaan extends HavaAraci {

	public Kaan(String ucusNo) {
		super(ucusNo);
	}

	@Override
	public void mesajAl(String mesaj, String kimden, String kime) {
		System.out.println(getUcusNo()
				+ " uçuş no'lu Kaan'a mesaj geldi: " + mesaj);
		System.out.println("Kimden: " + kimden);
		System.out.println(
				"Kime: " + (kime == null ? "herkese" : kime));
	}

	@Override
	public String toString() {
		return "Kaan [" + getUcusNo() + "]";
	}

}
