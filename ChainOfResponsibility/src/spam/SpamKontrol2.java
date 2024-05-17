package spam;

import email.Email;

public class SpamKontrol2 extends SpamKontrol {

	@Override
	public boolean spamMi(Email email) {
		// kimden bilgisi kime bilgisine eşit ise spam'dır.
		boolean spam = email.getKimden().equals(email.getKime());
		if (!spam && getSiradakiFiltre() != null) {
			spam = getSiradakiFiltre().spamMi(email);
		}
		return spam;
	}

}
