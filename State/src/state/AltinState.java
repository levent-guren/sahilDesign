package state;

public class AltinState implements State {

	@Override
	public void hesapla(Uye uye) {
		int satisMiktari = uye.getSatisMiktari();
		if (satisMiktari < 4000) {
			uye.setState(new BronzState());
		} else if (satisMiktari < 9000) {
			uye.setState(new GumusState());
		}
	}

	@Override
	public String toString() {
		return "AltinState";
	}

	@Override
	public int getAidat() {
		return 13000;
	}

}
