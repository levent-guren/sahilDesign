package urun;

public class IndirimliUrun extends Urun {
	private Urun urun;

	public IndirimliUrun(Urun urun) {
		super(urun.getAdi(), urun.getFiyat());
		this.urun = urun;
	}

	@Override
	public double getFiyat() {
		return urun.getFiyat() * 0.8;
	}

}
