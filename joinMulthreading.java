package com.joinMulthreading;

//join
public class joinMulthreading {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 7; i++) {
			System.out.println("Main thread");
		}
		JD3 jd3 = new JD3();
		JD2 jd2 = new JD2();
		jd2.jd3 = jd3;

		jd2.start();
		jd3.start();

		jd2.join();

		System.out.println("END...");

	}
}

class JD2 extends Thread {
	JD3 jd3;

	@Override
	public void run() {
		try {
//			jd3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Child thread");
			System.out.println(Thread.currentThread().getName());

		}
	}
}

class JD3 extends Thread {
	@Override
	public void run() {
		System.out.println("this is jd3 data...");
	}
}
