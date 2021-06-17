package com.mohith.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreadExecutorsMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService=Executors.newFixedThreadPool(2);
		
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				IntStream.range(1, 5).forEach(i->System.out.println(i));
				
			}
		});
		
		// using future we can check thread executed successfully or not
		Future<?> f=executorService.submit(new Runnable() {
			
			@Override
			public void run() {
				Stream.of("Ave", "Abe", "Aze").sorted().findFirst().ifPresent(System.out::println);
				
			}
		});
		
		System.out.println(f.get());
		
		//Using Callable we can have return type
		Future<String> f2=executorService.submit(new Callable<String>() {
			public String call() throws InterruptedException {
				TimeUnit.MILLISECONDS.sleep(1000);
				return "I am Done";
			}
		});
		
		System.out.println(f2.get());
		
		executorService.shutdown();
		

	}

}
