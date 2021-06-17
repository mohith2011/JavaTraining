package com.mohith.java8Features.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.*;

public class JavaStreams {

	public static void main(String[] args) throws IOException {
		// Inteager Stream
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		// Inteager STream with skip
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x));
		System.out.println();
		// Inteager stream with sum
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println();

		// Stream.of, sorted and findFirst
		Stream.of("Ave", "Abe", "Aze").sorted().findFirst().ifPresent(System.out::print);
		System.out.println();

		// Array Streams, sort, filter and print
		String[] arr = { "Abc", "Afc", "Aze", "sas", "pas" };
		Arrays.stream(arr).filter(x -> x.startsWith("A")).sorted().forEach(System.out::print);
		System.out.println();

		// Average of squares of an int array
		Arrays.stream(new int[] { 2, 3, 4, 5, 6 }).map(x -> x * x).average().ifPresent(System.out::print);
		System.out.println();

		// Stream from List
		List<String> people = Arrays.asList("Abc", "Afc", "Aze", "sas", "pas");
		people.stream().map(x -> x.toLowerCase()).filter(x -> x.startsWith("a")).sorted().forEach(System.out::print);
		System.out.println();

		// Stream rows of file
		Stream<String> rows = Files.lines(Paths.get("bands.txt"));
		rows.filter(x -> x.length() > 2).forEach(System.out::print);
		rows.close();
		System.out.println();

		// stream rows of file and save to list
		List<String> bands2 = Files.lines(Paths.get("bands.txt")).filter(x -> x.contains("A"))
				.collect(Collectors.toList());
		bands2.forEach(x -> System.out.print(x));
		System.out.println();
		
		//Reduction -Sum
		double total=Stream.of(7.1,5.9,4.1).reduce(0.0, (Double a,Double b)->a+b);
		System.out.println(total);
		
		//Reduction- summarystatistics only for integers
		IntSummaryStatistics summaryStatistics=IntStream.of(7,30,90,85,100).summaryStatistics();
		System.out.println(summaryStatistics);
		
		//List, filter and sum
		
		List<Integer> num=Arrays.asList(1,3,6,20,5,90);
		System.out.println(num.stream().filter(x->x<10).mapToInt(x->x).sum());

	}

}
