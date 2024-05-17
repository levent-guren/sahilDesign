package calistir;

import java.math.BigDecimal;

import bean.Bakici;
import bean.Bot;
import bean.BotMemento;

public class Calistir {
	public static void main(String[] args) {
		Bot bot = new Bot();
		bot.setHiz(120);
		bot.setKoordinatX(new BigDecimal("13.47"));
		bot.setKoordinatY(new BigDecimal("-48.11"));
		System.out.println("İlk hali: " + bot);
		Bakici bakici = new Bakici();
		BotMemento memento = bakici.createMemento(bot);
		bot.setHiz(200);
		bot.setKoordinatX(new BigDecimal("15.11"));
		bot.setKoordinatY(new BigDecimal("-44.75"));
		System.out.println("Yeni hali: " + bot);
		System.out.println("Fark var mı: " + memento.farkVarMi(bot));
		bot = bakici.restore();
		System.out.println("Geri alınan hali: " + bot);
		System.out.println("Fark var mı: " + memento.farkVarMi(bot));
	}
}
