package com.test;

import java.util.Collection;
import java.util.HashMap;

public class TestMap {
	public static void main(String[] args) {
		HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
		Employee emp1= new Employee(2001,"Sid",10000);
		Employee emp2= new Employee(1001,"John",12000);
		Employee emp3= new Employee(3001,"George",11000);
		
		map.put(1001, emp2);
		map.put(2001, emp1);
		map.put(3001, emp3);
		
		if(map.containsKey(2001))
		{
			System.out.println(map.get(2001));
		}
		else
		{
			System.out.println("Employee not found.");
		}
		System.out.println("\n................");
		Collection clc=map.values();
		clc.forEach(p->System.out.println(p)); 
		System.out.println("\n................");
		System.out.println(map.values());
		
	}
}
