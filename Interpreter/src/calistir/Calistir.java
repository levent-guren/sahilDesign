package calistir;

import java.util.Scanner;

import hesap.PostFixHesapMakinesi;

public class Calistir {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out
					.println("Hesaplanacak postfix ifadeyi giriniz:");
			String ifade = scn.nextLine();
			PostFixHesapMakinesi hesapMakinesi = new PostFixHesapMakinesi();
			System.out.println(hesapMakinesi.hesapla(ifade));
		}

	}
}
