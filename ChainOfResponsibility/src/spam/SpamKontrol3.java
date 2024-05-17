package spam;

import email.Email;

public class SpamKontrol3 extends SpamKontrol {

	@Override
	public boolean spamMi(Email email) {
		// İçerik bilgisi yoksa spam'dır.
		boolean spam = email.getIcerik() == null
				|| email.getIcerik().equals("");
		if (!spam && getSiradakiFiltre() != null) {
			spam = getSiradakiFiltre().spamMi(email);
		}
		return spam;
	}

}
