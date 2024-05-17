package okul;

public class OkulMuduru implements Kisi {
	private String adi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public OkulMuduru(String adi) {
		this.adi = adi;
	}

	@Override
	public void visit(Visitor visitor) {
		if (visitor instanceof SaglikMemuru) {
			// kabul etmiyorum.
		} else {
			visitor.accept(this);
		}
	}

}
