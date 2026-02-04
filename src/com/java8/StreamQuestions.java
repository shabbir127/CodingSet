package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamQuestions {

	public static void main(String[] args) {
	int count=0;
		List<Integer> evenList=Arrays.asList(1,3,5,6,7,8,21,54,68,87,65,45,34,22);
		
		// method reference.....
		evenList.stream().filter(n -> n%2==0).forEach(System.out::print);
		
		//lambda Expression
		evenList.stream().filter(n -> n%2==0).forEach(n->System.out.print(n + " "));
		
		
		int max=evenList.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("\n max value "+max);
		
		
		
		
		
		
	}
}
