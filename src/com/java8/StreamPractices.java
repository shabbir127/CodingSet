package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractices {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(1,3,4,5,6,6,7,89,78);
		list.stream().mapToInt(Integer::intValue).max().orElse(0);
		 int Second=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
		 Map<Integer, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(map);
		
	}

}
