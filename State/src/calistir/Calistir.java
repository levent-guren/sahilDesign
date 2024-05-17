package calistir;

import state.Uye;

public class Calistir {
	public static void main(String[] args) {
		Uye uye = new Uye("Ecrin");
		System.out.println("Uye: " + uye);
		System.out.println("Aidat: " + uye.getAidat());
		System.out.println();
		uye.setSatisMiktari(9000);
		System.out.println("Uye: " + uye);
		System.out.println("Aidat: " + uye.getAidat());
		System.out.println();
		uye.setSatisMiktari(15000);
		System.out.println("Uye: " + uye);
		System.out.println("Aidat: " + uye.getAidat());
		System.out.println();
		uye.setSatisMiktari(9000);
		System.out.println("Uye: " + uye);
		System.out.println("Aidat: " + uye.getAidat());
	}
}
