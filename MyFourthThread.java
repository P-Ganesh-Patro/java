package com.MultiThreading;

public class MyFourthThread implements Runnable {
//public class MyFourthThread extends MyThreadDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 20; i < 25; i++) {
			System.out.println("Fourth Thread " + i + " bye");
		}

	}

}
