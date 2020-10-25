package com.gwy.observer;

public class MySub extends MySubject {

	@Override
	public void operation() {
		System.out.println("update self...");
		notifyObservers();
		
	}

}
