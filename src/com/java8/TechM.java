package com.java8;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class TechM {
	void deadlock()
	{
		Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("T1 locked lock1");

                try { Thread.sleep(100); } 
                
                catch (Exception e) {
                	System.out.println("Exception....");
                }

                synchronized (lock2) {
                    System.out.println("T1 locked lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("T2 locked lock2");

                try { Thread.sleep(100); } 
                catch (Exception e) {}

                synchronized (lock1) {
                    System.out.println("T2 locked lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }

	public static void main(String[] args) {
       final int a=10;
       System.out.println(a);
       
		Set<Employe> set=new HashSet<>();
		HashSet<Employe> hset=new HashSet<>();
		
		
		Employe e1=new Employe();
		Employe e2=new Employe();
		
		e1.setAge(1);
		e1.setName("Shabbir");
		e2.setAge(1);
		e2.setName("khan");
		set.add(e2);
		set.add(e1);
		
		hset.add(e2);
		hset.add(e1);
		
		System.out.println("hashset "+hset.size());
		System.out.println(set);
		
		HashMap<Integer, Employe> map=new HashMap<>();
		map.put(1, e1);
		map.put(1, e2);
		
		TechM m=new TechM();
		//m.deadlock();
		
		System.out.println(map);
		 Animal am = new Dog(); // ✅ allowed
	        am.sound();
	        am.display();
	       
	        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
	        list.add("A");
	        list.add("B");

	       
	        Iterator<String> it = list.iterator();
	       

	        list.add("C"); // modification allowed

	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	        
		
	}

}

class Employe{
	
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employe [age=" + age + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}


abstract class Animal {
    abstract void sound();
    void display()
    {
    	System.out.println("non abstract method...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

	