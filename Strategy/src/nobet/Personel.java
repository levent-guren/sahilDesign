package nobet;

public class Personel {
	private String ad;
	private Nobet nobet;

	public Personel(String ad, Nobet nobet) {
		this.ad = ad;
		this.nobet = nobet;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Nobet getNobet() {
		return nobet;
	}

	public void setNobet(Nobet nobet) {
		this.nobet = nobet;
	}

	public void nobetTut() {
		getNobet().nobetTut(this);
	}

}
