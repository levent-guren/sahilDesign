package spam;

import email.Email;

public abstract class SpamKontrol {
	private SpamKontrol siradakiFiltre;

	public SpamKontrol getSiradakiFiltre() {
		return siradakiFiltre;
	}

	public void setSiradakiFiltre(SpamKontrol siradakiFiltre) {
		this.siradakiFiltre = siradakiFiltre;
	}

	public abstract boolean spamMi(Email email);
}
