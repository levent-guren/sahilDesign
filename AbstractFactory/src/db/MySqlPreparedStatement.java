package db;

public class MySqlPreparedStatement implements PreparedStatement {
	private String sql;

	public MySqlPreparedStatement(String sql) {
		this.sql = sql;
	}

	@Override
	public void execute() {
		System.out.println("MySql üzerinde " + sql + " sorgusu çalıştırıldı.");
	}

}
