package bean;

import java.math.BigDecimal;

public class Bot {
	private int hiz;
	private BigDecimal koordinatX;
	private BigDecimal koordinatY;

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

	@Override
	public String toString() {
		return "Bot [hiz=" + hiz + ", koordinatX=" + koordinatX
				+ ", koordinatY=" + koordinatY + "]";
	}

}
