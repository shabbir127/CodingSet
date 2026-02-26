package com.java8;

import java.util.Arrays;
import java.util.List;

public class MapEx {

	public static void main(String[] args) {
		List<List<Integer>> numbers=Arrays.asList(Arrays.asList(1,2,34,4),Arrays.asList(12,45,6,6,6));
		
		numbers.stream().flatMap(s->s.stream()).forEach(System.out::print);
	}
}
