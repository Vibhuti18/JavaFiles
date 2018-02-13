package com.app.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Address;
import com.app.model.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee>employees = populateEmployee();

	SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	
	//Employee empl =  (Employee) session.get(Employee.class,2);
for (Employee employee : employees) {
		session.save(employee);
	}
	
	//Employee e2 = (Employee) session.get(Employee.class,2);
	//session.delete(e2);
	session.getTransaction().commit();
	session.close();
	sessionFactory.close();
	
	System.out.println("*****************************");
	//System.out.println("Name "+empl.getName()+" skills "+empl.getSkills());
	}

	private static List<Employee> populateEmployee() {
		// TODO Auto-generated method stub
		
		List<Employee> emp = new ArrayList<Employee>();
		Employee e1 = new Employee();
		//e1.setId(1);
		e1.setName("vibhuti");
		//e1.setAddress(new Address(2200, "anandi", "goa", 403602));
		//e1.setHome(new Address(2211, "jfj", "tyyyyynj", 451532));
		e1.getAddresses().add(new Address(101,"Bandra","Mumbai",222222));
		e1.getAddresses().add(new Address(102,"Vashi","Mumbai",222222));
		e1.setSkills("java,javascript");
		
		
		Employee e2 = new Employee();
		//e2.setId(2);
		e2.setName("rrr");
		//e2.setAddress(new Address(2200, "any8uandi", "goa", 403602));
		//e2.setHome(new Address(2001, "jjklfj", "tyynj", 456632));
		e2.getAddresses().add(new Address(101,"Bandra","Mumbai",222222));
		e2.getAddresses().add(new Address(102,"Vashi","Mumbai",222222));
		e2.setSkills("java");
		
		
		Employee e3 = new Employee();
		//e3.setId(3);
		e3.setName("rrnkjr");
		e3.getAddresses().add(new Address(101,"Bandra","Mumbai",222222));
		e3.getAddresses().add(new Address(102,"Vashi","Mumbai",222222));
		
		//e3.setAddress(new Address(2200, "anandijhoi", "goa", 403602));
		//e3.setHome(new Address(2121, "jhhj", "tyynj", 456632));
		e3.setSkills("javaij");
		
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		return emp;
	}

}
