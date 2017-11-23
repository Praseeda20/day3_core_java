package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection1 {
	public static void main(String[] args){
		//List list=new ArrayList();
		//Set list=new TreeSet(new EmployeeComparator());
		Set<Employee> list=new TreeSet<Employee>(new EmployeeComparator());
		Employee emp1= new Employee(111,"Sid",10000);
		Employee emp2= new Employee(333,"John",12000);
		Employee emp3= new Employee(222,"George",11000);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		//Collections.sort(list,new EmployeeComparator());
		//list.forEach(p->System.out.println(p));
		
		/*for(Object obj: list)
		{
			Employee emp=(Employee)obj;
			System.out.println(obj);
			System.out.println(emp.getEmpName());
			
		}
		*/
		
		for(Employee emp: list)
		{
			System.out.println(emp);
			System.out.println(emp.getEmpName());
			
		}
		
	}
}
