package com.gwy.observer;

import org.junit.Test;

/**
 * 观察者模式
 * @author Administrator
 *
 */
public class ObserverTest {

	@Test
	public void test1(){
		
		Subject subject = new MySub();
		subject.add(new Observer1());
		subject.add(new Observer2());
		
		subject.operation();
	}
}
