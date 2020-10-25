package com.gwy.iterater;

import org.junit.Test;

/**
 * 迭代子模式：
 * 顺序访问聚集中的对象。
 * 一个聚集对象，一个遍历聚集对象的迭代器对象
 * @author Administrator
 *
 */
public class IteraterTest {

	@Test
	public void test1(){
		
		
		Collection ct = new MyColl();
		Interater it = ct.inteater();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
		
	}
	
}
