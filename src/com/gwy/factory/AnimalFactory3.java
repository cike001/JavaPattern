package com.gwy.factory;

/**
 * 工厂方法模式之三
 * 静态工厂方法：提供多个静态工厂方法，直接调用创建对象
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
