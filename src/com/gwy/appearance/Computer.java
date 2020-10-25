package com.gwy.appearance;

/**
 * ���ģʽ��
 * ���������֮���������ϵ������ϵͳ��϶ȣ�����ϵͳ�����ԡ�
 * @author Administrator
 *
 */
public class Computer {
	
	CPU cpu;
	Memory memory;
	Disk disk;
	
	public Computer() {
		// TODO Auto-generated constructor stub
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void start(){
		System.out.println("start computer");
		cpu.start();
		memory.start();
		disk.start();
	}
	
	public void shutdown(){
		System.out.println("shutdown computer");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		
	}
	
}
