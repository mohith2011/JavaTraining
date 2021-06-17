package com.mohith.multithreading;

import java.util.stream.IntStream;

public class Thread1ExtendsThread extends Thread {
	public void run() {
		IntStream.range(1, 1000).forEach(p -> System.out.print(p));
	}
}
