package com.java8;

import java.util.Arrays;
import java.util.Comparator;
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
		
		
		int SecondMax=evenList.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElseThrow();
		System.out.println("\n second max value "+SecondMax);
		
		
		Student student1=new Student(1, 10000, "Shabbir", false);
		Student student2=new Student(2, 34000, "Rohit", true);
		Student student3=new Student(3, 67000, "Vivek", false);
		Student student4=new Student(4, 780000, "Sujit", true);
		Student student5=new Student(5, 89000, "Altaf", true);
		Student student6=new Student(6, 33000, "Amit", false);
		Student student7=new Student(7, 45000, "Dani", true);
		Student student8=new Student(8, 45000, "Savita", true);
		Student student9=new Student(9, 45000, "Ram", true);
		Student student10=new Student(10, 45000, "Mahtest", false);
		Student student11=new Student(11, 35000, "Shivam", true);
		Student student12=new Student(13, 93000, "Ramesh", true);
		Student student13=new Student(14, 25000, "Suresh", false);
		Student student14=new Student(15, 33500, "Danish", true);
		Student student15=new Student(16, 82330, "Jiberal", false);
		
		
		List<Student>studentlList=Arrays.asList(student1,student2,student3,student4,
				student5,student6,student7,student8,student9,student10,student11,
				student12,student13,student14,student15);
		
		
		List<Student> reStudents=studentlList.stream().filter(Student::isFees).filter(s-> s.getSalary() > 10000).sorted(Comparator.comparing(Student::getSalary).reversed()).toList();
		reStudents.stream().forEach(System.out::println);
		System.out.println(reStudents.stream().count());
		
	}
}


class Student{
	
	private int id;
	private long salary;
	private String name;
	private boolean fees;
	
	public Student(int id, long salary, String name, boolean fees) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFees() {
		return fees;
	}
	public void setFees(boolean fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", salary=" + salary + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
	
}
