package com.gwy.state;

import org.junit.Test;

public class StateTest {

	
	@Test
	public void test1(){
		State state = new State();
		
		Context context = new Context(state);
		state.setValue("state1");
		context.method();
		
		state.setValue("state2");
		context.method();
	}
	
}
