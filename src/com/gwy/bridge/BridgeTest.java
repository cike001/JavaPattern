package com.gwy.bridge;

import org.junit.Test;

public class BridgeTest {

	@Test
	public void test1(){
		Driver driver = new MySqlDriver();
		Driver driver2 = new DB2Driver();
		
		DriverManager driverManager = new MyDriverManager();
		driverManager.setDriver(driver); 
		driverManager.connect();
		
		driverManager.setDriver(driver2);
		driverManager.connect();
		
	}
	
}
