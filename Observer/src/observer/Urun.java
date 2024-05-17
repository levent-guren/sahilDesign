package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Urun {
	private List<PropertyChangeListener> musteriler = new ArrayList<>();
	private int stokMiktari;

	public int getStokMiktari() {
		return stokMiktari;
	}

	public void setStokMiktari(int stokMiktari) {
		PropertyChangeEvent evt = new PropertyChangeEvent(this,
				"stok", this.stokMiktari, stokMiktari);
		this.stokMiktari = stokMiktari;
		musteriler.forEach(m -> m.propertyChange(evt));
	}

	public void stokBilgisiIcinMusteriEkle(
			PropertyChangeListener musteri) {
		musteriler.add(musteri);
	}
}
