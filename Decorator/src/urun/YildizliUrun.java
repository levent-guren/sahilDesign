package urun;

public class YildizliUrun extends Urun {
	private Urun urun;

	public YildizliUrun(Urun urun) {
		super(urun.getAdi(), urun.getFiyat());
		this.urun = urun;
	}

	@Override
	public double getFiyat() {
		return urun.getFiyat() * 0.5;
	}

}
