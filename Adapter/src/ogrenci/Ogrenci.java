package ogrenci;

import java.util.HashMap;
import java.util.Map;

public class Ogrenci {
	private Map<String, Object> ozellikler = new HashMap<>();

	public void setOzellik(String key, Object value) {
		ozellikler.put(key, value);
	}

	public Object getOzellik(String key) {
		return ozellikler.get(key);
	}

}
