package run;

import db.Connection;
import db.DriverManager;
import db.PreparedStatement;

public class Run {
	public static void main(String[] args) {
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@192.168.1.1:1521/orcl", "oracle",
				"password");
		PreparedStatement stmt = conn
				.prepareStatement("select * from personel");
		stmt.execute();

		Connection conn2 = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "admin",
				"password");
		PreparedStatement stmt2 = conn2
				.prepareStatement("select * from personel");
		stmt2.execute();
	}
}
