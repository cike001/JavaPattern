package com.gwy.bridge;

/**
 * �Ž�ģʽ��
 * ��������ʵ�ֻ����ʹ���߿��Զ����ر仯
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
