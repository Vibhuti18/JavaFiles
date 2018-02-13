package com.psl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.beans.Donor;
import com.psl.dao.IBBDAO;


@Service
public class BloodBankService {
	
	@Autowired
	private IBBDAO dao;
	
	public IBBDAO getDao() {
		return dao;
	}

	public void setDao(IBBDAO dao) {
		this.dao = dao;
	}

	public void createEmployee(Donor e) {
		dao.createEmployee(e);
		
	}
	
	public void updateEmployee(int id,String name) {
		dao.updateEmployee(id, name);
		
	}
	
	public void deleteemployee(int id) {
		dao.deleteEmployee(id);
		
	}
	
	public List<Donor> getAllEmployees() {
		List<Donor> l = new ArrayList<Donor>();
		
		l=dao.getAllEmployees();
		return l;
	}

}
