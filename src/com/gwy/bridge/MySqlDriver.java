package com.gwy.bridge;

public class MySqlDriver implements Driver{

	@Override
	public void connect() {
		System.out.println("mysql connect...");
	}

}
