package com.psl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component("emp")
public class Employee implements BeanNameAware,ApplicationContextAware,BeanFactoryAware,InitializingBean,DisposableBean {
	

	@Value(value="101")
	private int empId;
	@Value(value="Vibhuti")
	private String empName;
	@Autowired
	//@Qualifier("address2")
	private Address address;
	
	public Employee() {
		// TODO Auto-generated constructor stub.
		System.out.println("In default constructor of Employee");
	}
	
	public Employee(int empId, String empName, Address address) {
		System.out.println("In Employee Param constructor");
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", address=" + address + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		System.out.println("In employee.setId");
		this.empId = empId;
	}
	public String getEmpName() {
		
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("In employee.setNAme");
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("In Employee.setaddress");
		
		this.address = address;
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName "+arg0);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("Inside setApplicationContext "+arg0);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Inside setBeanFactory "+arg0);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Inside afterPropertiesSet"+empName);
		

		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Employee.destroy() ");
		
	}

}
