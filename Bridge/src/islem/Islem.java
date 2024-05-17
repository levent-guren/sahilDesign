package islem;

import java.util.ArrayList;
import java.util.List;

import belge.Dokuman;

public abstract class Islem {
	private List<Dokuman> dokumanlar = new ArrayList<>();

	public List<Dokuman> getDokumanlar() {
		return dokumanlar;
	}

	public void setDokumanlar(List<Dokuman> dokumanlar) {
		this.dokumanlar = dokumanlar;
	}

	public abstract void islemYap();
}
