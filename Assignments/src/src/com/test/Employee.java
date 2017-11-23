package com.test;

public class Employee implements Comparable {
	private int empId;
	private String empName;
	private int empSalary;
	
	public Employee(int empId, String empName, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public Employee() {
		}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Object obj) {
		Employee emp=(Employee)obj;
		int n= this.empName.compareTo(emp.empName);
			return n;
		
	}
	
	
	
}
