package com.gwy.iterater;

import org.junit.Test;

/**
 * ������ģʽ��
 * ˳����ʾۼ��еĶ���
 * һ���ۼ�����һ�������ۼ�����ĵ���������
 * @author Administrator
 *
 */
public class IteraterTest {

	@Test
	public void test1(){
		
		
		Collection ct = new MyColl();
		Interater it = ct.inteater();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
		
	}
	
}
