package editor;

public class BasaEkleCommand extends Command {
	private int uzunluk;

	public BasaEkleCommand(MetinEditor editor) {
		super(editor);
	}

	public void islemYap(String metin) {
		getEditor().basaEkle(metin);
		uzunluk = metin.length();
	}

	@Override
	public void islemiGeriAl() {
		getEditor().bastanSil(uzunluk);
	}

}
