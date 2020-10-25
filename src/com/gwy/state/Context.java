package com.gwy.state;

public class Context {

	private State state;

	public Context(State state) {
		// TODO Auto-generated constructor stub
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void method(){
		if(state.getValue().equals("state1")){
			state.method1();
		}
		if(state.getValue().equals("state2")){
			state.method2();
		}
	}
	
}
