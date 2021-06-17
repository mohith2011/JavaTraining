package com.mohith.multithreading;

public class MainThread {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		
		// to start extend thread class
		Thread1ExtendsThread thread1ExtendsThread=new Thread1ExtendsThread();
		thread1ExtendsThread.start();
		
		// to start implemented runnable thread class
		Thread2ImplimentsRunable thread2ImplimentsRunable=new Thread2ImplimentsRunable();
		Thread t2=new Thread(thread2ImplimentsRunable);
		t2.start();
		
		// goes to runnable state and give chance to others threads to execute 
		t2.yield();
		//waits until thread execution finished
		thread1ExtendsThread.join();
		
		
		
		System.out.println("All threads Finished");

	}

	
}
