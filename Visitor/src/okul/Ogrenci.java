package okul;

public class Ogrenci implements Kisi {
	private String adi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public Ogrenci(String adi) {
		this.adi = adi;
	}

	@Override
	public void visit(Visitor visitor) {
		visitor.accept(this);
	}

}
