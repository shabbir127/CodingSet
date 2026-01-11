package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIEx {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Apple","banana","cheery");
		Stream<String> stream=list.stream();
		 
		String [] arr={"grapes","mango","pineapple"};
		
		Stream<String> stream1=Arrays.stream(arr);
		
		Stream<Integer> stream2=Stream.of(1,3,4,5,6);
		
		Stream<Integer> limit=Stream.iterate(0, n->n +1).limit(34);
		System.out.println(limit.toList());
		
		Stream<Double> stream3=Stream.generate(()->Math.random()*100).limit(5);
		
		Stream<String> stream4=Stream.generate(()->"Shabbir").limit(5);
		
		List<Integer> list2=Arrays.asList(1,3,4,5,6,45,667,8,90,2);
		
		System.out.println(list2.stream().filter(i-> i % 2==0).toList());
		System.out.println(1+2+"3"+4+5);
		
		System.out.println(list2.stream().filter(i-> i % 2==0).map(x->x /2).toList());
		
		
		
		
		
		
	}
}
