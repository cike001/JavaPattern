package com.gwy.proxy;

/**
 * ����ģʽ������ԭ�������һЩ����
 * @author Administrator
 *
 */
public class ProxyCla implements ProxyInter{
	private Source source;
	
	public ProxyCla(Source source) {
		// TODO Auto-generated constructor stubd
		this.source = new Source();
	}

	@Override

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("before proxy");
		source.method1();
		System.out.println("after proxy");
	}
}
