package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractices {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(1,3,4,5,6,6,7,89,78);
		list.stream().mapToInt(Integer::intValue).max().orElse(0);
		 int Second=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
		 Map<Integer, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(map);
		 Employee employee1=new Employee(1, 100244, "Sk");
		 Employee employee2=new Employee(1, 10022, "Dk");
		 Employee employee3=new Employee(1, 100242, "Pk");
		 Employee employee4=new Employee(1, 1002442, "RK");
		 Employee employee5=new Employee(1, 1002441, "SRK");
		 employee1.setId(1);
		 employee1.setName("shabbir");
		 employee1.setSalary(1000);
		 System.out.println(employee1.getId()+employee1.getName()+employee1.getSalary());

		 
		 List<Employee> employees=Arrays.asList(employee1,employee2,employee3,employee4,employee5);
		 
		 Employee epEmployee =employees.stream().filter(s->s.getName().startsWith("S")).max(Comparator.comparing(Employee::getSalary)).orElseThrow();
		int secndEmp= employees.stream().map(s->s.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
		 System.out.println(epEmployee);
		 System.out.println(secndEmp);
		
	}

}


class Employee{
	
private	int id;
private	int salary;
private	String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Employee(int id, int salary, String name) {
	super();
	this.id = id;
	this.salary = salary;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
}



	
}