package com.gwy.factory;


/**
 * 创建型模式：
 * 1.工厂方法模式之二：
 * 2）多个工厂方法模式：提供多个工厂方法分别创建对象
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
