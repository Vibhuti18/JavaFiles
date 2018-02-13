package com.psl.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.psl.beans.Transaction;
import com.psl.dao.ITransactionDAO;

public class TransactionService {
	private ITransactionDAO dao;

	public ITransactionDAO getDao() {
		return dao;
	}

	public void setDao(ITransactionDAO dao) {
		this.dao = dao;
	}
	
	public void withdraw(Transaction t) {
		dao.withdraw(t);
	}
	public void deposit(Transaction t) {
		dao.deposit(t);
		
	}
	public void getAllTransactions(int id) {
		
		List<Transaction> l = new ArrayList<Transaction>();
		l=dao.getAllTransactions(id);
		System.out.println("Mini Balance statement uid:"+id+" name:"+getUser(id));
		int count=0;
		for (Transaction employee : l) {
			if(count<5)
			{
				System.out.println(employee);
				count++;
			}
			else
				break;
			
		}
		
		
	}
	
	public String getUser(int id) {
		return dao.getUser(id);
		
	}

}


