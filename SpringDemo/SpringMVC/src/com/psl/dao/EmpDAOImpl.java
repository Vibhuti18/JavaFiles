package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import org.springframework.stereotype.Repository;

import com.psl.beans.Employee;

@Repository
public class EmpDAOImpl implements IEmpDAO {

	@Autowired
	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void createEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		
		String sql="insert into employee values("+e.getId()+",'"+e.getName()+"','"+e.getEmail()+"')";
		System.out.println(sql);
			template.update(sql);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		// TODO Auto-generated method stub
		return template.query("select * from employee",new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int arg1)
					throws SQLException {
				// TODO Auto-generated method stub
				Employee e = new Employee();
				
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setEmail(rs.getString("email"));
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
