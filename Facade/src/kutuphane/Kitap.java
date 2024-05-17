package kutuphane;

public class Kitap {
	public static enum TUR {
		OYKU, ROMAN, BILIMKURGU, KISISEL_GELISIM
	}

	private String adi;
	private TUR tur;

	public Kitap(String adi, TUR tur) {
		this.adi = adi;
		this.tur = tur;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public TUR getTur() {
		return tur;
	}

	public void setTur(TUR tur) {
		this.tur = tur;
	}

	@Override
	public String toString() {
		return "Kitap [adi=" + adi + ", tur=" + tur + "]";
	}
}
