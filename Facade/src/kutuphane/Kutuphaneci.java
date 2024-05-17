package kutuphane;

public class Kutuphaneci {
	private Kutuphane kutuphane;

	public Kutuphaneci(Kutuphane kutuphane) {
		this.kutuphane = kutuphane;
	}

	public Kitap kitapCikar(String adi, Kitap.TUR tur) {
		return kutuphane.kitapCikar(adi, tur);
	}

	public void kitapEkle(Kitap kitap) {
		kutuphane.kitapEkle(kitap);
	}
}
