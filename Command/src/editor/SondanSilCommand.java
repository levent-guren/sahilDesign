package editor;

public class SondanSilCommand extends Command {
	private String silinenMetin;

	public SondanSilCommand(MetinEditor editor) {
		super(editor);
	}

	public void islemYap(int miktar) {
		silinenMetin = getEditor().sondanSil(miktar);
	}

	@Override
	public void islemiGeriAl() {
		getEditor().sonaEkle(silinenMetin);
	}

}
