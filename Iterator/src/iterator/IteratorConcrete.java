package iterator;

import java.util.List;

public class IteratorConcrete implements Iterator {
	private List<String> degerler;

	public void setDegerler(List<String> degerler) {
		this.degerler = degerler;
	}

	@Override
	public boolean hasNext() {
		return degerler.size() > 0;
	}

	@Override
	public Object next() {
		Object deger = degerler.get(0);
		degerler.remove(0);
		return deger;
	}

}
