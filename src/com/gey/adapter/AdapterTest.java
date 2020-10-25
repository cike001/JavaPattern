package com.gey.adapter;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void testOne(){
		Tagetable tagetable = new Adapter();
		tagetable.method1();
		tagetable.method2();
	}
	
	@Test
	public void testTwo(){
		
		Wrapper wrapper = new Wrapper(new Source());
		wrapper.method1();
		wrapper.method2();
		
	}
	
	@Test
	public void test3(){
		
		MyCla absInter = new MyCla();
		absInter.method1();
		absInter.method2();
		absInter.method3();
		
	}
	
}
