package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.psl.beans.Transaction;

public class TransactionImplDAO extends JdbcDaoSupport implements ITransactionDAO{



	@Override
	public void deposit(Transaction t) {
		// TODO Auto-generated method stub
		
		String sql="insert into transaction values("+t.getTid()+","+t.getUid()+",'"+t.getAction()+"',"+t.getAmount()+")";
		System.out.println(sql);
		getJdbcTemplate().update(sql);
		 sql="UPDATE user SET balance =balance +"+t.getAmount()+" WHERE id ="+t.getUid();
		System.out.println(sql);
		getJdbcTemplate().update(sql);
	}

	@Override
	public void withdraw(Transaction t) {
		// TODO Auto-generated method stub

		String sql = "SELECT balance from user WHERE id = ?";

		int bal = (Integer)getJdbcTemplate().queryForObject(
				sql, new Object[] { t.getUid() }, Integer.class);
		
		if(bal<t.getAmount())
		{
			System.out.println("No sufficient balance");
		}
		else
		{
			sql="insert into transaction values("+t.getTid()+","+t.getUid()+",'"+t.getAction()+"',"+t.getAmount()+")";
			System.out.println(sql);
			getJdbcTemplate().update(sql);
			 sql="UPDATE user SET balance =balance -"+t.getAmount()+" WHERE id ="+t.getUid();
				System.out.println(sql);
				getJdbcTemplate().update(sql);
		}
		
		
	}

	@Override
	public List<Transaction> getAllTransactions(int id) {
		// TODO Auto-generated method stub
		return getJdbcTemplate().query("select tid,uid,action,amount from transaction where uid="+id,new RowMapper<Transaction>(){

			@Override
			public Transaction mapRow(ResultSet rs, int arg1)
					throws SQLException {
				// TODO Auto-generated method stub
				Transaction e = new Transaction();
				
				e.setTid(rs.getInt("tid"));
				e.setUid(rs.getInt("uid"));
				e.setAction(rs.getString("action"));
				e.setAmount(rs.getInt("amount"));
				return e;
			}
			
		});
	}

	@Override
	public String getUser(int id) {
		// TODO Auto-generated method stub
		
		
		
		String sql = "SELECT NAME FROM user WHERE id = ?";

		String name = (String)getJdbcTemplate().queryForObject(
				sql, new Object[] { id }, String.class);

		return name;
	}
	
	

}
