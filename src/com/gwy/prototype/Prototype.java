package com.gwy.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式：将一个对象作为原型，对其复制、克隆，生成一个和原对象类似的新对象
 * 
 * 
 * 浅复制：基本类型重新创建，引用类型还是原对象指向的引用
 * 
 * 深复制：无论是基本类型和引用类型，都会重新创建。
 * 
 * @author Administrator
 *
 */
public class Prototype implements Cloneable,Serializable {

	private int base;
	private Integer obj;
	
	/**
	 * 浅复制
	 */
	public Object clone() throws CloneNotSupportedException{
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}
	
	/**
	 * 深复制
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
