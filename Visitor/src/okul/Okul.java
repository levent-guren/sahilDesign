package okul;

import java.util.ArrayList;
import java.util.List;

public class Okul {
	private List<Kisi> kisiler = new ArrayList<>();

	public List<Kisi> getKisiler() {
		return kisiler;
	}

	public void visit(Visitor visitor) {
		kisiler.forEach(kisi -> kisi.visit(visitor));
	}

}
