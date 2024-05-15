package db;

public class OraclePreparedStatement implements PreparedStatement {
	private String sql;

	public OraclePreparedStatement(String sql) {
		this.sql = sql;
	}

	@Override
	public void execute() {
		System.out.println("Oracle üzerinde " + sql + " sorgusu çalıştırıldı.");
	}

}
