package com.gwy.memo;

import org.junit.Test;

public class MemoTest {

	
	@Test
	public void test1(){
		Original original = new Original();
		original.setValue("hello");
		
		Storage storage = new Storage(original.createMemo());
		
		System.out.println("修改前："+original.getValue());
		original.setValue("world");
		System.out.println("修改后："+original.getValue());
		
		original.restoreMemo(storage.getMemo());
		System.out.println("恢复后的状态："+original.getValue());
		
	}
	
}
