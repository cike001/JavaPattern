package com.gwy.prototype;

import org.junit.Test;

public class PrototypeTest {

	@Test
	public void testOne() throws Exception{
		Prototype prototype = new Prototype();
		prototype.setBase(1);
		prototype.setObj(new Integer(1));
		
		Prototype p2 = (Prototype) prototype.clone();
		Prototype p3 = (Prototype) prototype.deepClone();
		
		System.out.println(p2.getObj()==prototype.getObj());
		System.out.println(p2.getObj()==p3.getObj());
	}
	
}
