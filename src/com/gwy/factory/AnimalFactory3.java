package com.gwy.factory;

/**
 * ��������ģʽ֮��
 * ��̬�����������ṩ�����̬����������ֱ�ӵ��ô�������
 * @author Administrator
 *
 */
public class AnimalFactory3 {

	public static Animal procedureCat(){
		return new Cat();
	}
	public static Animal procedureDog(){
		return new Dog();
	}
	
}
