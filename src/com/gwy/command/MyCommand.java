package com.gwy.command;


public class MyCommand implements Command{

	private Receiver receiver;
	
	public MyCommand(Receiver receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
	}
	
	@Override
	public void exe() {
		receiver.action();
	}

}
