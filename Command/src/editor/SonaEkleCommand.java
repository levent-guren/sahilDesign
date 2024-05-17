package editor;

public class SonaEkleCommand extends Command {
	private int uzunluk;

	public SonaEkleCommand(MetinEditor editor) {
		super(editor);
	}

	public void islemYap(String metin) {
		getEditor().sonaEkle(metin);
		uzunluk = metin.length();
	}

	@Override
	public void islemiGeriAl() {
		getEditor().sondanSil(uzunluk);
	}

}
