package com.gwy.decoration;

/**
 * 装饰模式：
 * 在不必改变原来类文件和使用继承的情况下，动态地扩展一个对象的功能。
 * 特点：
 * 1.装饰对象和真实对象实现相同的接口
 * 2.装饰对象持有真实对象的引用
 * 3.装饰对象转发请求给真实对象
 * 4.装饰对象转发请求给真实对象前后可增加些功能，不用改变原类
 * @author Administrator
 *
 */
public class Decorater implements SourceInter {
	
	private SourceInter source;
	
	public Decorater(SourceInter source) {
		this.source = source;
	}

	@Override
	public void method1() {
		System.out.println("before invoke method1...");
		source.method1();
		System.out.println("after invoke method1...");
	}

}
