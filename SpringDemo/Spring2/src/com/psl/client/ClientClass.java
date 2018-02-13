package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Employee;
import com.psl.service.EmployeeService;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService s = context.getBean("service",EmployeeService.class);
		Employee e=context.getBean("emp",Employee.class);
		//s.createEmployee(e);
		//System.out.println("done");
		//s.updateEmployee(12, "Aditi");
		//System.out.println("done");
		
		//s.deleteemployee(12);
		s.getAllEmployees();
		System.out.println("done");
		

	}

}
