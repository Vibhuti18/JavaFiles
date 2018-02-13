package com.psl.dao;

import java.util.List;

import com.psl.beans.Transaction;

public interface ITransactionDAO {
	
	void deposit(Transaction t);
	void withdraw(Transaction t);
	List<Transaction> getAllTransactions(int id);
	String getUser(int id);

}
