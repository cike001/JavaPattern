package com.gwy.command;

import org.junit.Test;

public class CommandTest {

	@Test
	public void test1(){
		
		Receiver receiver = new Receiver();
		Command command = new MyCommand(receiver);
		
		Invoker invoker = new Invoker(command);
		invoker.action();
		
	}
	
}
