package calistir;

import db.ConnectionPool;

public class Calistir {
	public static void main(String[] args) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.getConnection();
		ConnectionPool pool2 = ConnectionPool.getInstance();
		if (pool == pool2) {
			System.out.println("pool == pool2");
		}
	}
}
