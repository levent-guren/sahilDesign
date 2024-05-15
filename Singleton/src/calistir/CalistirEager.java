package calistir;

import db.ConnectionPoolEager;

public class CalistirEager {
	public static void main(String[] args) {
		ConnectionPoolEager pool = ConnectionPoolEager.getInstance();
		pool.getConnection();
		ConnectionPoolEager pool2 = ConnectionPoolEager.getInstance();
		if (pool == pool2) {
			System.out.println("pool == pool2");
		}
	}
}
