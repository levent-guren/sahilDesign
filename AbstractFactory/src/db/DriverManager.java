package db;

public class DriverManager {
	public static Connection getConnection(String url, String username, String password) {
		if (url.contains("oracle")) {
			return new OracleConnection(url, username, password);
		} else if (url.contains("mysql")) {
			return new MysqlConnection(url, username, password);
		}
		throw new RuntimeException("Driver not found!");
	}
}
