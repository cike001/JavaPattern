package com.gwy.factory;


/**
 * ������
 * 1.��������ģʽ֮һ��
 * 1����ͨ����ģʽ��
 * ���������࣬��ʵ��ͬһ�ӿڵ�һЩ����ж���Ĵ���
 * @author Administrator
 *
 */
public class AnimalFactory {

	public Animal produce(String type){
		
		if("Cat".equals(type)){
			return new Cat();
		}else if("Dog".equals(type)){
			return new Dog();
		}else{
			System.out.println("û���ҵ������");
			return null;
		}
		
	}
	
}
