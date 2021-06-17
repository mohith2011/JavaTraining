package com.mohith.multithreading;


public class DeadLock {  
	  public static void main(String[] args) {  
	    //define shared resources
	    final String shared_res1 = "Java tutorials";  
	    final String shared_res2 = "Multithreading";  
	    // thread_one => locks shared_res1 then shared_res2  
	    Thread thread_one = new Thread() {  
	      public void run() {  
	          synchronized (shared_res1) {  
	           System.out.println("Thread one: locked shared resource 1");  
	   
	           try { Thread.sleep(100);} catch (Exception e) {}  
	   
	           synchronized (shared_res2) {  
	            System.out.println("Thread one: locked shared resource 2");  
	           }  
	         }  
	      }  
	    };  
	    // thread_two=> locks shared_res2 then shared_res1  
	    Thread thread_two = new Thread() {  
	      public void run() {  
	      synchronized (shared_res2) {  
	          System.out.println("Thread two: locked shared resource 2");  
	       
	          try { Thread.sleep(100);} catch (Exception e) {}  
	         synchronized (shared_res1) {  
	            System.out.println("Thread two: locked shared resource 1");  
	          }  
	        }  
	      }  
	    };  
	   
	    //start both the threads  
	    thread_one.start();  
	    thread_two.start();  
	  }  
	}