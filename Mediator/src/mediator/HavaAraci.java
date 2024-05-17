package mediator;

public abstract class HavaAraci {
	private String ucusNo;

	public HavaAraci(String ucusNo) {
		this.ucusNo = ucusNo;
	}

	public String getUcusNo() {
		return ucusNo;
	}

	public abstract void mesajAl(String mesaj, String kimden,
			String kime);

}
