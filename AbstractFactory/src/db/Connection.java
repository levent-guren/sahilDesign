package db;

public interface Connection {
	public PreparedStatement prepareStatement(String sql);
}
