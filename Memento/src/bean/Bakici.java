package bean;

import java.util.ArrayList;
import java.util.List;

public class Bakici {
	private List<BotMemento> mementolar = new ArrayList<>();

	public BotMemento createMemento(Bot bot) {
		BotMemento memento = new BotMemento();
		memento.setState(bot);
		mementolar.add(memento);
		return memento;
	}

	public Bot restore() {
		BotMemento memento = mementolar.get(mementolar.size() - 1);
		Bot bot = memento.getState();
		mementolar.remove(mementolar.size() - 1);
		return bot;
	}

	public Bot restoreMemento(BotMemento memento) {
		Bot bot = memento.getState();
		return bot;
	}
}
