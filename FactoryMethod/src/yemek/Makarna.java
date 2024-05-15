package yemek;

public class Makarna extends Yemek {
	public Makarna() {
		setAdi("Makarna");
		malzemeEkle("Makarna");
		malzemeEkle("Su");
		malzemeEkle("Tuz");
		malzemeEkle("Yağ");
		malzemeEkle("Salça");
	}

	@Override
	public String getTarif() {
		StringBuilder tarif = new StringBuilder();
		tarif.append("Tüm malzemeleri koyup karıştırarak kaynatıyoruz.\n");
		return tarif.toString();
	}

}
