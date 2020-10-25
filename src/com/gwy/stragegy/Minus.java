package com.gwy.stragegy;

public class Minus extends DigitalArr implements AlgInter{

	@Override
	public void calcultate(String num) {
		int[] arr = getDigitalArr(num, "\\-");
		System.out.println(arr[0]-arr[1]);
	}

	

}
