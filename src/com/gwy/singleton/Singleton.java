package com.gwy.singleton;

/**
 * ����ģʽ��ֻ��newһ��ʵ����˽�ж������ԡ�˽�й��췽�������ⲿ���ʵĹ�����̬������
 * ����ʽ��
 * �������ʱʵ��������
 * @author Administrator
 *
 */
public class Singleton {

	private static Singleton instance = new Singleton();
	private Singleton(){}
	
	public static Singleton getInstance(){
		return instance;
	}
	
}
