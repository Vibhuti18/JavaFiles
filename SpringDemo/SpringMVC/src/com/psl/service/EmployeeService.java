package com.psl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.beans.Employee;
import com.psl.dao.IEmpDAO;


@Service
public class EmployeeService {
	
	@Autowired
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
	
	public List<Employee> getAllEmployees() {
		List<Employee> l = new ArrayList<Employee>();
		
		l=dao.getAllEmployees();
		return l;
	}

}
