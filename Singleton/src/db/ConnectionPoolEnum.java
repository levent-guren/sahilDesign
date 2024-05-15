package db;

public enum ConnectionPoolEnum {
	INSTANCE;

	public void getConnection() {
		System.out.println("get connection");
	}

}
