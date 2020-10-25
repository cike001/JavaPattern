package com.gwy.factory;

public class DogPro implements AnimalFactoryInter{

	@Override
	public Animal procedure() {
		return new Dog();
	}
	
	

}
