package state;

public class BronzState implements State {

	@Override
	public void hesapla(Uye uye) {
		int satisMiktari = uye.getSatisMiktari();
		if (satisMiktari > 30000) {
			uye.setState(new AltinState());
		} else if (satisMiktari > 10000) {
			uye.setState(new GumusState());
		}
	}

	@Override
	public String toString() {
		return "BronzState";
	}

	@Override
	public int getAidat() {
		return 800;
	}
}
