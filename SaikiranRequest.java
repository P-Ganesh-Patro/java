package com.mt.MultiThreading;

public class SaikiranRequest extends Thread {

	@Override
	public void run() {
		Thread.currentThread().setName("saikiran");
		for (int i = 0; i < 3; i++)

			System.out.println("I am saikiran reqest");
		System.out.println(Thread.currentThread().getName());
	}

}
