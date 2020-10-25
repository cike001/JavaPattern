package com.gwy.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class MySubject implements Subject {
	
	private Vector<Observer> vet = new Vector<>();

	@Override
	public void add(Observer observer) {
		vet.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vet.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> elements = vet.elements();
		while (elements.hasMoreElements()) {
			Observer observer = (Observer) elements.nextElement();
			observer.update();
		}
		
	}


}
