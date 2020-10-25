package com.gwy.factory;

import org.junit.Test;

public class MyFactoryTest {
	
	@Test
	public void testFactoryOne(){
		AnimalFactory animalFactory = new AnimalFactory();
		Animal produce = animalFactory.produce("Dog");
		produce.call();
	}
	
	@Test
	public void testTwo(){
		AnimalFactory2 factoryTwo = new AnimalFactory2();
		Animal cat = factoryTwo.procedureCat();
		cat.call();
		Animal dog = factoryTwo.procedureDog();
		dog.call();
	}
	
	@Test
	public void test3(){
		Animal cat = AnimalFactory3.procedureCat();
		cat.call();
	}
	
	@Test
	public void test4(){
		AnimalFactoryInter catPro = new CatPro();
		catPro.procedure().call();
	}
	
	
}
