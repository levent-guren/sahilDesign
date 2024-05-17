package editor;

public abstract class Command {
	private MetinEditor editor;

	public Command(MetinEditor editor) {
		this.editor = editor;
	}

	public MetinEditor getEditor() {
		return editor;
	}

	public abstract void islemiGeriAl();
}
