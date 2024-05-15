package yemek;

public class Pilav extends Yemek {
	public Pilav() {
		setAdi("Pilav");
		malzemeEkle("Pirinç");
		malzemeEkle("Su");
		malzemeEkle("Tuz");
		malzemeEkle("Yağ");
		malzemeEkle("Et");
		malzemeEkle("Şehriye");
	}

	@Override
	public String getTarif() {
		StringBuilder tarif = new StringBuilder();
		tarif.append("Önce sıvı yağda şehriyeleri kavuruyoruz.\n");
		tarif.append("Pirinci kavuruyoruz.\n");
		tarif.append("Tuzunu ve suyu ekliyoruz.\n");
		tarif.append("Eti düdüklüde haşlıyoruz.\n");
		tarif.append("Pilavımıza etimizi ekleyip suyunu çekince ocaktan indirip bekliyoruz.\n");
		return tarif.toString();
	}

}
