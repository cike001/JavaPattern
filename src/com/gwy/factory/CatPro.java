package com.gwy.factory;


/**
 * 创建型
 * 抽象工厂模式：
 * 创建多个工厂类，新增功能可直接增加新的工厂类，不需要改变原来的代码
 * @author Administrator
 *
 */
public class CatPro implements AnimalFactoryInter {

	@Override
	public Animal procedure() {
		return new Cat();
	}

}
