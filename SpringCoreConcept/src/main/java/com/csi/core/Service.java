package com.csi.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee employee= (Employee) context.getBean("emp");
		employee.setEmpId(101);
		employee.setEmpName("Ashish");
		System.out.println("\n Employee Name:"+employee.getEmpName()+"\n Employee Id:"+employee.getEmpId());
		
		context.registerShutdownHook();// destroy the bean 
	}
}
