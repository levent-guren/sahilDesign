package okul;

public class Ogretmen implements Kisi {
	private String adi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public Ogretmen(String adi) {
		this.adi = adi;
	}

	@Override
	public void visit(Visitor visitor) {
		if (visitor instanceof Mufettis) {
			// kabul etmiyorum.
		} else {
			visitor.accept(this);
		}
	}

}
