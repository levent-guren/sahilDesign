package state;

public class GumusState implements State {

	@Override
	public void hesapla(Uye uye) {
		int satisMiktari = uye.getSatisMiktari();
		if (satisMiktari > 40000) {
			uye.setState(new AltinState());
		} else if (satisMiktari < 7000) {
			uye.setState(new BronzState());
		}
	}

	@Override
	public String toString() {
		return "GümüşState";
	}

	@Override
	public int getAidat() {
		return 2000;
	}
}
