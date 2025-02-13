package com.MultiThreading;

public class MyThirdThread extends Thread {
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		String threadName = thread.getName();

		int prtry = thread.getPriority();
		for (int i = 0; i < 5; i++) {
			System.out.println("I am third thread..." + threadName + " " + prtry);
		}
	}

}
