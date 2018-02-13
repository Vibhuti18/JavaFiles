package com.psl.dao;

import java.util.List;

import com.psl.beans.Donor;


public interface IBBDAO {

	void createEmployee(Donor e);
	List<Donor> getAllEmployees();
	void updateEmployee(int id,String name);
	void deleteEmployee(int id);
}
