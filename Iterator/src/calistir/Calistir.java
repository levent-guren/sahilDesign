package calistir;

import java.util.ArrayList;
import java.util.List;

import iterator.IteratorConcrete;

public class Calistir {
	public static void main(String[] args) {
		IteratorConcrete concrete = new IteratorConcrete();
		List<String> degerler = new ArrayList<>();
		degerler.add("İstanbul");
		degerler.add("Ankara");
		degerler.add("İzmir");
		degerler.add("Adana");
		concrete.setDegerler(degerler);
		while (concrete.hasNext()) {
			System.out.println(concrete.next());
		}
	}
}
