package com.gwy.memo;

import org.junit.Test;

public class MemoTest {

	
	@Test
	public void test1(){
		Original original = new Original();
		original.setValue("hello");
		
		Storage storage = new Storage(original.createMemo());
		
		System.out.println("�޸�ǰ��"+original.getValue());
		original.setValue("world");
		System.out.println("�޸ĺ�"+original.getValue());
		
		original.restoreMemo(storage.getMemo());
		System.out.println("�ָ����״̬��"+original.getValue());
		
	}
	
}
