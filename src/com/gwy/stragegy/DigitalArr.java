package com.gwy.stragegy;

/**
 * ��Ϊ��
 * ����ģʽ��Ϊʵ�����ṩһ��ͳһ�ķ���
 * 
 * @author Administrator
 *
 */
public abstract class DigitalArr {

	public int[] getDigitalArr(String chart,String exp){
		String[] strArr = chart.split(exp);
		int[] intArr = new int[2];
		intArr[0] = Integer.parseInt(strArr[0]);
		intArr[1] = Integer.parseInt(strArr[1]);
		return intArr;
		
	}
	
}
