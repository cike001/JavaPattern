package com.gwy.builder;

/**
 * Builder
 * @author Administrator
 *
 */
public interface PersonBuilder {

	public void buildHead();
	public void buildBody();
	public void buildFoot();
	public Person getPerson();
}
