package com.dac.thread;

public class GoodMorningThread extends Thread{
	@Override
	public void run() {
		super.run();
		Thread currentThread = Thread.currentThread();
		String name = currentThread.getName();
		System.out.println("Good Morning :: "+name);
		for(int i=0;i<20;i++)
			System.out.println("Good Morning");
	}
}
