package com.MultiThreading;

public class MultiThreadingDemo {
	public static void main(String[] args) {

//		String threadName = Thread.currentThread().getName();
//		System.out.println(threadName);
//		
//		Thread thread = Thread.currentThread();
//		String threadName = thread.getName();
//		System.out.println("thread name:- " + threadName);
		// second thread is created

//		by default a thread priority is 5
//		range 0 to 10

		MyThreadDemo mt = new MyThreadDemo();
		mt.start();

		MyThirdThread mt1 = new MyThirdThread();
		mt1.start();

		MyFourthThread mt4 = new MyFourthThread(); // runnable object
		Thread t3 = new Thread(mt4);
		t3.start();

		Thread thread = Thread.currentThread();
		String threadName = thread.getName();
		int prirotity = thread.getPriority();
		System.out.println("Thread:- " + threadName);
		System.out.println("prirotity:- " + prirotity);

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}

	}

}
