package com.gwy.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ԭ��ģʽ����һ��������Ϊԭ�ͣ����临�ơ���¡������һ����ԭ�������Ƶ��¶���
 * 
 * 
 * ǳ���ƣ������������´������������ͻ���ԭ����ָ�������
 * 
 * ��ƣ������ǻ������ͺ��������ͣ��������´�����
 * 
 * @author Administrator
 *
 */
public class Prototype implements Cloneable,Serializable {

	private int base;
	private Integer obj;
	
	/**
	 * ǳ����
	 */
	public Object clone() throws CloneNotSupportedException{
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}
	
	/**
	 * ���
	 * @return
	 * @throws Exception 
	 */
	public Object deepClone() throws Exception{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		return ois.readObject();
	}
	
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public Integer getObj() {
		return obj;
	}
	public void setObj(Integer obj) {
		this.obj = obj;
	}
}
