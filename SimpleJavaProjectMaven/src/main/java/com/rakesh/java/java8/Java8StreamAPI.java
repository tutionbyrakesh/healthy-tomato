package com.rakesh.java.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8StreamAPI {
	public static void main(String args[]){
	
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		
		System.out.println("***********************");
		// map
		List<Integer> numbers1 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers1.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		squaresList.forEach(System.out::println);
		
		System.out.println("***********************");
		//filter
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("count :"+count);
		
		System.out.println("***********************");
		//sorted
		Random random2 = new Random();
		random2.ints().limit(10).sorted().forEach(System.out::println);
		
		System.out.println("************statistic***********");
		//statistic
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		
	}
	
	
}
