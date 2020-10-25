package com.gwy.responsibility;

import org.junit.Test;

public class ResponsibilityTest {

	@Test
	public void test1(){
		MyHandler handler = new MyHandler("h1");
		MyHandler handler2 = new MyHandler("h2");
		MyHandler handler3 = new MyHandler("h3");
		
		handler.setHandler(handler2);
		handler2.setHandler(handler3);
		
		handler.operator();
	}
	
}
