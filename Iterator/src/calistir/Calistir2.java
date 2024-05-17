package calistir;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Calistir2 {
	public static void main(String[] args) {
		Set<String> degerler = new HashSet<>();
		degerler.add("İstanbul");
		degerler.add("Ankara");
		degerler.add("İzmir");
		degerler.add("Adana");
		Iterator<String> itr = degerler.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
