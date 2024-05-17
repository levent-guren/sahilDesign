package urun;

public class Urun {
	private String adi;
	private double fiyat;

	public Urun(String adi, double fiyat) {
		this.adi = adi;
		this.fiyat = fiyat;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Urun [adi=" + getAdi() + ", fiyat=" + getFiyat()
				+ "]";
	}

}
