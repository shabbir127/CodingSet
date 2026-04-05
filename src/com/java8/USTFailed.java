package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class USTFailed {
	
public static void main(String[] args) {
	
	List<Integer> list1= Arrays.asList(12,3,4,5,7); //
	//list.add(22);
	list1.set(1, 22);
	System.out.println(list1);
	
	List<Integer> list2=List.of(12,3,4,5,7); 
	
	//list1.add(22);
	//list1.set(1, 97);
	System.out.println(list2);
	
	List<String> list3 = new ArrayList<>(Arrays.asList("A", "B", "C"));
	list3.add("D");
	System.out.println(list3);
}	

}

