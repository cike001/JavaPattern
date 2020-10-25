package com.gwy.builder;

/**
 * Director
 * @author Administrator
 *
 */
public class PersonDirector {

	public Person createPerson(PersonBuilder builder){
		builder.buildHead();
		builder.buildBody();
		builder.buildFoot();
		return builder.getPerson();
	}
	
}
