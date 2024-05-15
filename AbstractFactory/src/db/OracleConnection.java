package db;

public class OracleConnection implements Connection {

	public OracleConnection(String url, String username, String password) {
	}

	@Override
	public PreparedStatement prepareStatement(String sql) {
		return new OraclePreparedStatement(sql);
	}

}
