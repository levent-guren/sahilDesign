package spam;

import email.Email;

public class SpamKontrol1 extends SpamKontrol {

	@Override
	public boolean spamMi(Email email) {
		// başlık büyük harf yazılmış ise spam'dır.
		boolean spam = email.getBaslik().toUpperCase()
				.equals(email.getBaslik());
		if (!spam && getSiradakiFiltre() != null) {
			spam = getSiradakiFiltre().spamMi(email);
		}
		return spam;
	}

}
