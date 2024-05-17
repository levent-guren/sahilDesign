package personel;

public class Personel implements Composite {
	private String adi;

	public Personel(String adi) {
		this.adi = adi;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@Override
	public String toString() {
		return getAdi();
	}

}
