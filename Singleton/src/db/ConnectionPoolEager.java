package db;

// Eager Loading
public class ConnectionPoolEager {
	private static ConnectionPoolEager instance = new ConnectionPoolEager();

	private ConnectionPoolEager() {
		if (instance != null) {
			// Reflection Api için yazıldı
			throw new IllegalStateException("Already initialized");
		}
	}

	public void getConnection() {
		System.out.println("get connection");
	}

	public static ConnectionPoolEager getInstance() {
		return instance;
	}
}
