package calistir;

import mediator.Helikopter;
import mediator.Kaan;
import mediator.Kule;
import mediator.Ucak;
import mediator.Ufo;

public class Calistir {
	public static void main(String[] args) {
		Kule kule = new Kule();
		Ucak ucak = new Ucak("TK-274");
		Kaan kaan = new Kaan("J-23");
		Helikopter helikopter = new Helikopter("TP-123");
		Ufo ufo = new Ufo("X7");

		kule.kuleyeBaglan(ucak);
		kule.kuleyeBaglan(kaan);
		kule.kuleyeBaglan(helikopter);
		kule.kuleyeBaglan(ufo);

		kule.mesajGonder(ucak, null, "Günaydın millet");
		kule.mesajGonder(kaan, "TK-274", "Biraz ciddi olalım");
		kule.kuledenAyril(kaan);
		kule.kuledenAyril(helikopter);
		kule.mesajGonder(ufo, null, "Jkx8-!?#");
	}
}
