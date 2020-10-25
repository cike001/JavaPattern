package com.gwy.builder;

public class WomenBuilder  implements PersonBuilder {
	
	Person p ;
	
	public WomenBuilder() {
		p = new Person();
	}

	@Override
	public void buildHead() {
		p.setHead("����Ů�˵�ͷ");
	}

	@Override
	public void buildBody() {
		p.setBody("����Ů�˵�����");
	}

	@Override
	public void buildFoot() {
		p.setFoot("����Ů�˵Ľ�");
	}

	@Override
	public Person getPerson() {
		return p;
	}

}
