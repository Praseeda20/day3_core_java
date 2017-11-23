package com.test;

import java.util.Comparator;

public class EmployeeComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Employee e1= (Employee)obj1;
		Employee e2= (Employee)obj2;
		int n=e1.getEmpId()-e2.getEmpId();
		return n;
	}

}
