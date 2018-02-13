package com.psl.service;

import java.util.ArrayList;
import java.util.List;

import com.psl.beans.Employee;
import com.psl.dao.IEmpDAO;

public class EmployeeService {
	
	private IEmpDAO dao;
	
	public IEmpDAO getDao() {
		return dao;
	}

	public void setDao(IEmpDAO dao) {
		this.dao = dao;
	}

	public void createEmployee(Employee e) {
		dao.createEmployee(e);
		
	}
	
	public void updateEmployee(int id,String name) {
		dao.updateEmployee(id, name);
		
	}
	
	public void deleteemployee(int id) {
		dao.deleteEmployee(id);
		
	}
	
	public void getAllEmployees() {
		List<Employee> l = new ArrayList<Employee>();
		
		l=dao.getAllEmployees();
		for (Employee employee : l) {
			System.out.println(employee);
			
		}
		
	}

}
