package com.gwy.bridge;

/**
 * 桥接模式：
 * 将抽象化与实现化脱耦，使两者可以独立地变化
 * @author Administrator
 *
 */
public abstract class DriverManager {

	private Driver driver;
	
	public void connect(){
		driver.connect();
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
	
	
}
