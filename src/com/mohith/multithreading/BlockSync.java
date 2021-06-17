package com.mohith.multithreading;


class PrintCount {
	   //print thread counter
	   public void printCounter() {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter ==>  "  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
	}
	//thread class
	class ThreadCounter extends Thread {
	   private Thread t;
	   private String threadName;
	   PrintCount  PD;
	   //class constructor for initialization    
	   ThreadCounter( String name,  PrintCount pd) {
	      threadName = name;
	      PD = pd;
	   }
	   //run () method for thread with synchronized block
	   public void run() {
	      synchronized(PD) {
	         PD.printCounter();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }
	    //start () method for thread
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}
	public class BlockSync {
	   public static void main(String args[]) {
	      PrintCount PD = new PrintCount();
	      //create thread instances
	      ThreadCounter T1 = new ThreadCounter( "Thread_1 ", PD );
	      ThreadCounter T2 = new ThreadCounter( "Thread_2 ", PD );
	      //start both the threads
	      T1.start();
	      T2.start();      // wait for threads to end
	      try {
	         T1.join();
	         T2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	}