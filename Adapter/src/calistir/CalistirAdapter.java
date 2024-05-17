package calistir;

import ogrenci.Ogrenci;
import ogrenci.OgrenciAdapter;

public class CalistirAdapter {
	public static void main(String[] args) {
		OgrenciAdapter ogrenciAdapter = new OgrenciAdapter();
		ogrenciAdapter.setOgrenci(new Ogrenci());
		ogrenciAdapter.setAdi("Kerim");
		ogrenciAdapter.setNo(148);

		System.out.println(ogrenciAdapter.getAdi());
		System.out.println(ogrenciAdapter.getNo());
	}
}
