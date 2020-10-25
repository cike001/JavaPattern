package com.gwy.factory;


/**
 * 创建型
 * 1.工厂方法模式之一：
 * 1）普通工厂模式：
 * 建立工厂类，对实现同一接口的一些类进行对象的创建
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
			System.out.println("没有找到这个类");
			return null;
		}
		
	}
	
}
