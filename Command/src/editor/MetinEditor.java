package editor;

public class MetinEditor {
	private StringBuilder icerik = new StringBuilder();

	public void basaEkle(String metin) {
		icerik.insert(0, metin);
	}

	public void sonaEkle(String metin) {
		icerik.append(metin);
	}

	public String bastanSil(int miktar) {
		String silinecekMetin = icerik.substring(0, miktar);
		icerik.delete(0, miktar);
		return silinecekMetin;
	}

	public String sondanSil(int miktar) {
		String silinecekMetin = icerik
				.substring(icerik.length() - miktar, icerik.length());
		icerik.delete(icerik.length() - miktar, icerik.length());
		return silinecekMetin;
	}

	@Override
	public String toString() {
		return icerik.toString();
	}

}
