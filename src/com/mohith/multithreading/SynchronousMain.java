package com.mohith.multithreading;

public class SynchronousMain {
	public static void main(String[] args) {

		SynchronousThreads t1=new SynchronousThreads();
		t1.start();
		synchronized (t1) {
			try {
				t1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(t1.sum);
	}
}
