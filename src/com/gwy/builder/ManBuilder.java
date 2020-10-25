package com.gwy.builder;

/**
 * ConcreateBuilder
 * @author Administrator
 *
 */
public class ManBuilder implements PersonBuilder{

	Person person;
	
	public ManBuilder(){
		person = new  Person();
	}

	@Override
	public void buildHead() {
		person.setHead("�������˵�ͷ");
	}

	@Override
	public void buildBody() {
		person.setBody("�������˵�����");
	}

	@Override
	public void buildFoot() {
		person.setFoot("�������˵Ľ�");
	}

	@Override
	public Person getPerson() {
		return person;
	}

}
