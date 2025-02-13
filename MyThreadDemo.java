package com.MultiThreading;

public class MyThreadDemo extends Thread {

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		String threadName = thread.getName();
		int prirotity = thread.getPriority();
		thread.setName("MyThreadDemo");
		thread.getName();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hii " + i + "  " + threadName + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

	}

}
