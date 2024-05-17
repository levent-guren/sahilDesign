package bean;

import java.math.BigDecimal;

public class BotMemento {
	private int hiz;
	private BigDecimal koordinatX;
	private BigDecimal koordinatY;

	public void setState(Bot bot) {
		this.hiz = bot.getHiz();
		this.koordinatX = bot.getKoordinatX();
		this.koordinatY = bot.getKoordinatY();
	}

	public Bot getState() {
		Bot bot = new Bot();
		bot.setHiz(this.hiz);
		bot.setKoordinatX(this.koordinatX);
		bot.setKoordinatY(this.koordinatY);
		return bot;
	}

	public boolean farkVarMi(Bot bot) {
		return getHiz() != bot.getHiz()
				|| !getKoordinatX().equals(bot.getKoordinatX())
				|| !getKoordinatY().equals(bot.getKoordinatY());
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public BigDecimal getKoordinatX() {
		return koordinatX;
	}

	public void setKoordinatX(BigDecimal koordinatX) {
		this.koordinatX = koordinatX;
	}

	public BigDecimal getKoordinatY() {
		return koordinatY;
	}

	public void setKoordinatY(BigDecimal koordinatY) {
		this.koordinatY = koordinatY;
	}

}
