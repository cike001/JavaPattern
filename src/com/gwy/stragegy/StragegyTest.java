package com.gwy.stragegy;

import org.junit.Test;

public class StragegyTest {

	@Test
	public void test1(){
		
		AlgInter ai = new Plus();
		ai.calcultate("8+2");
		
		AlgInter mi = new Minus();
		mi.calcultate("8-2");
		
	}

}
