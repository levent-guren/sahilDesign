package state;

public class Uye {
	private State state;
	private String ad;
	private int satisMiktari;

	public Uye(String ad) {
		this.ad = ad;
		this.state = new BronzState();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getSatisMiktari() {
		return satisMiktari;
	}

	public void setSatisMiktari(int satisMiktari) {
		this.satisMiktari = satisMiktari;
		this.state.hesapla(this);
	}

	@Override
	public String toString() {
		return "Uye [state=" + state + ", ad=" + ad
				+ ", satisMiktari=" + satisMiktari + "]";
	}

	public int getAidat() {
		return this.state.getAidat();
	}

}
