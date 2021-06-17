package com.mohith.multithreading;


class Table{    
	  //synchronized static method to print squares of numbers
	  synchronized static void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.print(n*i + " ");  
	     try{  
	       Thread.sleep(400);
	     }catch(Exception e){}  
	   } 
	   System.out.println();
	 }  
	} 
	  
	//thread class Thread_One  
	class Thread_One extends Thread{  
	    public void run(){  
	        Table.printTable(2);  
	    }  
	}
	   
	//thread class Thread_Two
	class Thread_Two extends Thread{  
	    public void run(){ 
	        Table.printTable(5);  
	    }  
	}  
	   
	public class MethodSync{  
	public static void main(String t[]){
	        //create instances of Thread_One and Thread_Two
	        Thread_One t1=new Thread_One ();  
	        Thread_Two t2=new Thread_Two (); 
	        //start each thread instance
	        t1.start();  
	        t2.start();  
	    }  
	}  