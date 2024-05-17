package editor;

import java.util.ArrayList;
import java.util.List;

public class MetinEditorBakici {
	private MetinEditor editor = new MetinEditor();
	private List<Command> commands = new ArrayList<>();

	public void basaEkle(String metin) {
		BasaEkleCommand command = new BasaEkleCommand(editor);
		command.islemYap(metin);
		commands.add(command);
	}

	public void sonaEkle(String metin) {
		SonaEkleCommand command = new SonaEkleCommand(editor);
		command.islemYap(metin);
		commands.add(command);
	}

	public void bastanSil(int miktar) {
		BastanSilCommand command = new BastanSilCommand(editor);
		command.islemYap(miktar);
		commands.add(command);
	}

	public void sondanSil(int miktar) {
		SondanSilCommand command = new SondanSilCommand(editor);
		command.islemYap(miktar);
		commands.add(command);
	}

	public void geriAl(int islemSayisi) {
		while (islemSayisi < commands.size() && commands.size() > 0) {
			getSonIslem().islemiGeriAl();
		}
	}

	private Command getSonIslem() {
		Command command = commands.get(commands.size() - 1);
		commands.remove(command);
		return command;
	}

	@Override
	public String toString() {
		return editor.toString();
	}

}
