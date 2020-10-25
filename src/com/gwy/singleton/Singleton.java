package com.gwy.singleton;

/**
 * 单例模式：只有new一个实例。私有对象属性、私有构造方法、供外部访问的公共静态方法。
 * 饿汉式：
 * 在类加载时实例化对象
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
