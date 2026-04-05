package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	
	
	//
	
	
	List<Integer>list4=new  ArrayList<Integer>(list2);
	
	List<Integer> list5= Collections.unmodifiableList(list4);
	
	list4.add(99);
	System.out.println(list4);
	System.out.println(list5);
	
	
	///
	Set<Integer> set1=new HashSet<>();
	set1.add(1);
	set1.add(2);
	
	Set<Integer> set2=set1; // memory same
	
	if(set2==set1)
	{
		System.out.println("both value was Same");
	}
	
	set2.add(3); //123
	
	if(set2==set1)
	{
		System.out.println("both different was Same");
	}
	
	if (set1.equals(set2)) {
		System.out.println("value same");
	}
	
	System.out.println(set1);
	System.out.println(set2);
			
}	

}

