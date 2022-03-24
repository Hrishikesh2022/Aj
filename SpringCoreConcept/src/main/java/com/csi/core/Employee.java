package com.csi.core;

public class Employee {
	private int empId;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	private String empName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void init() {
		System.out.println("Bean Initiated");
	}
	public void destroy() {
		System.out.println("Bean Destroyed");
	}

}
