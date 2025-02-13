package com.mt.MultiThreading;

public class MultiThreadingMain {
	public static void main(String[] args) throws InterruptedException {
		MyThreadingReqest myT = new MyThreadingReqest();
		myT.start();

		SaikiranRequest skr = new SaikiranRequest();
		skr.start();

		VarmaReqest vr = new VarmaReqest();
		Thread t1 = new Thread(vr);
		t1.start();

		for (int i = 0; i < 5; i++) {
//			Thread.sleep(1000);
			Thread.yield();
			System.out.println("Hello");
			System.out.println(Thread.currentThread().getName());
		}

	}

}
