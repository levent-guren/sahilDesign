package calistir;

import editor.MetinEditorBakici;

public class Calistir {
	public static void main(String[] args) {
		MetinEditorBakici editorBakici = new MetinEditorBakici();
		editorBakici.basaEkle("gün");
		editorBakici.sonaEkle(" hava");
		editorBakici.basaEkle("Bü ");
		editorBakici.basaEkle("Bu ne");
		editorBakici.geriAl(1);
		editorBakici.sonaEkle(" hava");
		editorBakici.sonaEkle(" hava");
		editorBakici.sonaEkle(" hava");
		editorBakici.geriAl(3);
		editorBakici.sonaEkle(" ");
		editorBakici.sonaEkle("çok güzel!");
		editorBakici.sondanSil(1);
		editorBakici.bastanSil(2);
		editorBakici.basaEkle("Bu");
		System.out.println(editorBakici);
		editorBakici.bastanSil(5);
		editorBakici.geriAl(1);
		editorBakici.bastanSil(3);
		editorBakici.basaEkle("Bu");
		System.out.println(editorBakici);
	}
}
