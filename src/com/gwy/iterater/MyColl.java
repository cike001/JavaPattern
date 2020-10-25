package com.gwy.iterater;

public class MyColl implements Collection {
	
	public String[] str = {"A","B","C","D","E"};

	@Override
	public Object get(int i) {
		return str[i];
	}

	@Override
	public int size() {
		return str.length;
	}

	@Override
	public Interater inteater() {
		
		return new MyInter(this);
	}

}
