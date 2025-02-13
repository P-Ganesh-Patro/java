package com.mt.MultiThreading;

public class MyThreadingReqest extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setName("this is my thread...");
		System.out.println("this is my threading");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
