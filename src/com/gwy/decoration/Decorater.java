package com.gwy.decoration;

/**
 * װ��ģʽ��
 * �ڲ��ظı�ԭ�����ļ���ʹ�ü̳е�����£���̬����չһ������Ĺ��ܡ�
 * �ص㣺
 * 1.װ�ζ������ʵ����ʵ����ͬ�Ľӿ�
 * 2.װ�ζ��������ʵ���������
 * 3.װ�ζ���ת���������ʵ����
 * 4.װ�ζ���ת���������ʵ����ǰ�������Щ���ܣ����øı�ԭ��
 * @author Administrator
 *
 */
public class Decorater implements SourceInter {
	
	private SourceInter source;
	
	public Decorater(SourceInter source) {
		this.source = source;
	}

	@Override
	public void method1() {
		System.out.println("before invoke method1...");
		source.method1();
		System.out.println("after invoke method1...");
	}

}
