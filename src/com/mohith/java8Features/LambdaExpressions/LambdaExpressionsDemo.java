package com.mohith.java8Features.LambdaExpressions;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LambdaExpressions l=new LambdaExpressions();
//		System.out.println(l.Add(5, 2));
		
		BiFunction<Integer, Integer,Integer> biFunction= (a,b)-> a+b;
		System.out.println(biFunction.apply(5, 5));
		
		//Supplier
		Supplier<Double> supplier = ()->Math.random();
		System.out.println(supplier.get());
		
		//Filters accepts predicates
		Predicate<Integer> p=x->x>5;
		System.out.println(p.test(10));
		
	}
	
//	public int Add(int a,int b) {
//		return a+b;
//	}

}
