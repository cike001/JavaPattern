package com.gwy.factory;


/**
 * ������ģʽ��
 * 1.��������ģʽ֮����
 * 2�������������ģʽ���ṩ������������ֱ𴴽�����
 * @author Administrator
 *
 */
public class AnimalFactory2 {

	public Animal procedureCat(){
		return new Cat();
	}
	
	public Animal procedureDog(){
		return new Dog();
	}
}
