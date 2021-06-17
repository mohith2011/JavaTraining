package com.mohith.java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaParallelStreams {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(20);
		list.add(60);
		list.add(80);
		list.add(100);
		
	
		
		
		Stream<Integer> n=list.stream();
		
		n.forEach(s->doprocess(s));
		
		 System.out.println("Parallel Stream Execution"); 
		 Stream<Integer> p=list.parallelStream();
		 p.forEach(s->doprocess(s));
		 
	}

	private static void doprocess(Integer s) {
		System.out.println("Processing "+s);
	}

}
