package com.gwy.observer;

import org.junit.Test;

/**
 * �۲���ģʽ
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
