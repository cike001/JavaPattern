package com.gwy.builder;

public class WomenBuilder  implements PersonBuilder {
	
	Person p ;
	
	public WomenBuilder() {
		p = new Person();
	}

	@Override
	public void buildHead() {
		p.setHead("建造女人的头");
	}

	@Override
	public void buildBody() {
		p.setBody("建造女人的身体");
	}

	@Override
	public void buildFoot() {
		p.setFoot("建造女人的脚");
	}

	@Override
	public Person getPerson() {
		return p;
	}

}
