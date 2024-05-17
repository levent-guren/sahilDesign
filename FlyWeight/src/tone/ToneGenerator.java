package tone;

import java.util.HashMap;
import java.util.Map;

public class ToneGenerator {
	private Map<Character, ITone> toneList = new HashMap<>();

	public ITone getTone(char t) {
		ITone tone = toneList.get(t);
		if (tone == null) {
			// tone bulunamadı. Yaratılacak.
			System.out.println(t + " tonu uretiliyor");
			tone = createTone(t);
			toneList.put(t, tone);
		}
		return tone;
	}

	private ITone createTone(char t) {
		switch (t) {
		case '0': {
			return new Tone0();
		}
		case '1': {
			return new Tone1();
		}
		case '2': {
			return new Tone2();
		}
		case '3': {
			return new Tone3();
		}
		case '4': {
			return new Tone4();
		}
		case '5': {
			return new Tone5();
		}
		case '6': {
			return new Tone6();
		}
		case '7': {
			return new Tone7();
		}
		case '8': {
			return new Tone8();
		}
		case '9': {
			return new Tone9();
		}

		}
		return null;
	}

	public void dial(String number) {
		System.out.println(number + " ceviriliyor:");
		for (int i = 0; i < number.length(); i++) {
			ITone tone = getTone(number.charAt(i));
			tone.dial();
		}
	}
}
