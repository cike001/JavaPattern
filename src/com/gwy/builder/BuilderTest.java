package com.gwy.builder;

import org.junit.Test;


/**
 * 建造者模式：复杂对象的创建与它的表示隔离，相同的构建过程可创建不同的表示
 * 产品的表示与产品创建过程分离，相同的创建过程可创建不同的产品
 * @author Administrator
 *
 */
public class BuilderTest {

	@Test
	public void testOne(){
		PersonDirector pd = new PersonDirector();
		Person person = pd.createPerson(new ManBuilder());
		System.out.println(person.getHead());
		System.out.println(person.getBody());
		System.out.println(person.getFoot());
		
		Person person2 = pd.createPerson(new WomenBuilder());
		System.out.println(person2.toString());
		
	}
	
}
