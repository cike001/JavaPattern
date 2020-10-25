package com.gwy.singleton;

/**
 * 懒汉式：
 * 在使用时实例化对象，防止多个线程同时访问产生线程不安全，要加锁
 * @author Administrator
 *
 */
public class Singleton2 {

	private static Singleton2 instance;
	private Singleton2(){}
	
	public static synchronized Singleton2 getInstance(){
		if(instance==null){
			instance = new Singleton2();
		}
		return instance;
	}
	
}
