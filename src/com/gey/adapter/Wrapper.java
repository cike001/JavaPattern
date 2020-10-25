package com.gey.adapter;

/**
 * ¶ÔÏóµÄÊÊÅäÆ÷
 * @author Administrator
 *
 */
public class Wrapper implements Tagetable{
	
	public Source source;
	
    public Wrapper(Source source) {
        this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this a method2");
	}

}
