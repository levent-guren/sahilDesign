package db;

public class ConnectionPool {
	private static ConnectionPool instance;

	private ConnectionPool() {
		if (instance != null) {
			// Reflection Api için yazıldı
			throw new IllegalStateException("Already initialized");
		}
	}

	public void getConnection() {
		System.out.println("get connection");
	}

	public static ConnectionPool getInstance() {
		if (instance == null) {
			// Thread safe için yazıldı
			synchronized (ConnectionPool.class) {
				instance = new ConnectionPool();
			}
		}
		return instance;
	}
}
