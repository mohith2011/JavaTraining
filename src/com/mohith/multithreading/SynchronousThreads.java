package com.mohith.multithreading;

import java.util.stream.IntStream;

public class SynchronousThreads extends Thread{

	long sum;
	public void run() {
		synchronized (this) {
				IntStream.range(1, 1000000).forEach(p->sum=sum+p);
				notify();
		}
		
	}	
}

