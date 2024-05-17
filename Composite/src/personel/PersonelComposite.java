package personel;

import java.util.ArrayList;
import java.util.List;

public class PersonelComposite implements Composite {
	private List<Composite> children = new ArrayList<>();

	public void add(Composite c) {
		children.add(c);
	}

	public void print(int level) {
		children.forEach(c -> {
			if (c.getClass().isAssignableFrom(Personel.class)) {
				// C'nin tipi Personel mi?
				printIndent(level);
				System.out.println(c);
			} else {
				PersonelComposite composite = (PersonelComposite) c;
				composite.print(level + 1);
			}
		});
	}

	private void printIndent(int level) {
		for (int i = 0; i < level; i++) {
			System.out.print(' ');
		}
	}
}
