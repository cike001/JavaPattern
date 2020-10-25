package com.gwy.decoration;

import org.junit.Test;

public class DecorationTest {

	@Test
	public void test1(){
		SourceInter sourceInter = new Source();
		SourceInter decorater = new Decorater(sourceInter); 
		decorater.method1();
	}
}
