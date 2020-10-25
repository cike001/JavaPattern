package com.gwy.builder;

import org.junit.Test;


/**
 * ������ģʽ�����Ӷ���Ĵ��������ı�ʾ���룬��ͬ�Ĺ������̿ɴ�����ͬ�ı�ʾ
 * ��Ʒ�ı�ʾ���Ʒ�������̷��룬��ͬ�Ĵ������̿ɴ�����ͬ�Ĳ�Ʒ
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
