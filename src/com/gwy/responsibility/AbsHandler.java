package com.gwy.responsibility;

public abstract class AbsHandler implements Handler{
	
	Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	

}
