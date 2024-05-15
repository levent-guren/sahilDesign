package calistir;

import db.ConnectionPoolEnum;

public class CalistirEnum {
	public static void main(String[] args) {
		ConnectionPoolEnum pool = ConnectionPoolEnum.INSTANCE;
		pool.getConnection();
		ConnectionPoolEnum pool2 = ConnectionPoolEnum.INSTANCE;
		if (pool == pool2) {
			System.out.println("pool == pool2");
		}
	}
}
