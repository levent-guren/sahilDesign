package belge;

public class Dokuman {
	private String baslik;

	public Dokuman() {
	}

	public Dokuman(String baslik) {
		this.baslik = baslik;
	}

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	@Override
	public String toString() {
		return "Dokuman [baslik=" + baslik + "]";
	}

}
