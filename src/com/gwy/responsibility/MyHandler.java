package com.gwy.responsibility;

public class MyHandler extends AbsHandler {
	
	private String name;
	
	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println(name+"---deal!");
		if(getHandler()!=null){
			getHandler().operator();
		}
	}

}
