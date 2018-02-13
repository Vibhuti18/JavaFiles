package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import org.springframework.stereotype.Repository;

import com.psl.beans.Donor;

@Repository
public class BBDAOImpl implements IBBDAO {

	@Autowired
	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void createEmployee(Donor e) {
		// TODO Auto-generated method stub
		
		
		String sql="insert into employee values("+e.getUsername()+",'"+e.getPassword()+"','"+e.getBg()+"',"+e.getAge()+")";
		System.out.println(sql);
			template.update(sql);
		
	}

	@Override
	public List<Donor> getAllEmployees() {
		
		// TODO Auto-generated method stub
		return template.query("select * from employee",new RowMapper<Donor>(){

			@Override
			public Donor mapRow(ResultSet rs, int arg1)
					throws SQLException {
				// TODO Auto-generated method stub
				Donor e = new Donor();
				
				e.setUsername(rs.getString("username"));
						e.setPassword(rs.getString("password"));
				e.setBg(rs.getString("bg"));
				e.setAge(rs.getInt("age"));
				return e;
			}
			
		});
	}

	@Override
	public void updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		String sql="UPDATE employee SET name ='"+name+"'WHERE id ="+id;
		System.out.println(sql);
		template.update(sql);
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String sql="delete from employee WHERE id ="+id;
		System.out.println(sql);
		template.update(sql);
		
	}

}
