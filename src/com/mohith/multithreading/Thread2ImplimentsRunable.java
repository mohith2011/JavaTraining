package com.mohith.multithreading;

import java.util.stream.IntStream;

public class Thread2ImplimentsRunable implements Runnable {
	public void run() {
		IntStream.range(1, 1000).forEach(p -> System.out.print("A"));
	}
}
