package db;

public class MysqlConnection implements Connection {

	public MysqlConnection(String url, String username, String password) {
	}

	@Override
	public PreparedStatement prepareStatement(String sql) {
		return new MySqlPreparedStatement(sql);
	}
}
