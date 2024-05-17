package calistir;

import email.Email;
import spam.SpamKontrol;
import spam.SpamKontrol1;
import spam.SpamKontrol2;
import spam.SpamKontrol3;

public class Calistir {
	public static void main(String[] args) {
		SpamKontrol kontrol = spamFiltreleriniOlustur();
		// başlık büyük harf olduğu için spam
		Email email1 = new Email();
		email1.setKimden("alqkjd6723hg@hotmail.com");
		email1.setKime("halil@sirket.com.tr");
		email1.setBaslik("TANISALIM MI?");
		email1.setIcerik("Merhaba");

		Email email2 = new Email();
		email2.setKimden("mahmut@sirket.com.tr");
		email2.setKime("halil@sirket.com.tr");
		email2.setBaslik("Rapor");
		email2.setIcerik("Bu raporu yarına istiyoruz");

		// içerik olmadığı için spam
		Email email3 = new Email();
		email3.setKimden("mahmut@sirket.com.tr");
		email3.setKime("halil@sirket.com.tr");
		email3.setBaslik("Rapor 2");

		if (kontrol.spamMi(email1)) {
			System.out.println("email1 spamdır");
		}
		if (kontrol.spamMi(email2)) {
			System.out.println("email2 spamdır");
		}
		if (kontrol.spamMi(email3)) {
			System.out.println("email3 spamdır");
		}
	}

	private static SpamKontrol spamFiltreleriniOlustur() {
		SpamKontrol1 k1 = new SpamKontrol1();
		SpamKontrol2 k2 = new SpamKontrol2();
		SpamKontrol3 k3 = new SpamKontrol3();

		k1.setSiradakiFiltre(k2);
		k2.setSiradakiFiltre(k3);

		return k1;
	}
}
