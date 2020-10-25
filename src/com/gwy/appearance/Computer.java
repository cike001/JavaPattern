package com.gwy.appearance;

/**
 * 外观模式：
 * 解决类与类之间的依赖关系，降低系统耦合度，降低系统复杂性。
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
