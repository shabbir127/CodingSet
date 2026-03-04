package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamPractices {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(1,3,4,5,6,6,7,89,78);
		list.stream().mapToInt(Integer::intValue).max().orElse(0);
		
	}

}
