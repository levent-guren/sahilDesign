package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Musteri implements PropertyChangeListener {
	private String adi;

	public Musteri(String adi) {
		this.adi = adi;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("Musteri " + adi + ", "
				+ evt.getSource().getClass().getName() + " sınıfında "
				+ evt.getPropertyName() + " değeri "
				+ evt.getOldValue() + " den " + evt.getNewValue()
				+ " dene değişti.");
	}

}
