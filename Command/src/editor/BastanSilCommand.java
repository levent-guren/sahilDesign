package editor;

public class BastanSilCommand extends Command {
	private String silinenMetin;

	public BastanSilCommand(MetinEditor editor) {
		super(editor);
	}

	public void islemYap(int miktar) {
		silinenMetin = getEditor().bastanSil(miktar);
	}

	@Override
	public void islemiGeriAl() {
		getEditor().basaEkle(silinenMetin);
	}

}
