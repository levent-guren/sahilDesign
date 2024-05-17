package calistir2;

public class Calistir {
	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.setAdi("Kerim");
		System.out.println(personel);

		Personel p2 = Personel.builder().adi("Osman").soyadi("UZUN")
				.email("ouzun@gmail.com").yas(23).build();
		System.out.println(p2);
	}
}
