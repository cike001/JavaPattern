package com.gey.adapter;

/**
 * 结构型：
 * 适配器模式：类的适配器
 * 将一个类的功能复制给另一个接口，解决类的兼容性问题
 * @author Administrator
 *
 */
public class Adapter extends Source implements Tagetable{

	@Override
	public void method2() {
		System.out.println("this a method2");
	}

}
