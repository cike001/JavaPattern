package com.gwy.proxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void test1(){
		Source s = new Source();
		ProxyInter pi = new ProxyCla(s);
		pi.method1();
	}
	
}
