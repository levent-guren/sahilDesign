package calistir;

import java.util.ArrayList;
import java.util.List;

import belge.AracSatis;
import belge.Dokuman;
import belge.Ihtarname;
import belge.Vekaletname;
import islem.ElektronikBilgi;
import islem.Islem;

public class Calistir {
	public static void main(String[] args) {
		List<Dokuman> dokumanlar = dokumanlariOlustur();
		Islem islem = getIslem(dokumanlar);
		islem.islemYap();
	}

	private static Islem getIslem(List<Dokuman> dokumanlar) {
		Islem islem = new ElektronikBilgi();
		islem.setDokumanlar(dokumanlar);
		return islem;
	}

	private static List<Dokuman> dokumanlariOlustur() {
		List<Dokuman> dokumanlar = new ArrayList<>();
		dokumanlar.add(new AracSatis("D01"));
		dokumanlar.add(new Ihtarname("D34"));
		dokumanlar.add(new Vekaletname("F3"));
		dokumanlar.add(new Vekaletname("AL29"));
		dokumanlar.add(new AracSatis("M1"));
		return dokumanlar;
	}
}
