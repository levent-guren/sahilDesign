package bean;

public class Personel2 implements Cloneable {
	private String adi;
	private Adres adres;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Personel [adi=" + adi + ", adres=" + adres + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Personel2 sonuc = (Personel2) super.clone();
		sonuc.setAdres((Adres) adres.clone());
		return sonuc;
	}

}
