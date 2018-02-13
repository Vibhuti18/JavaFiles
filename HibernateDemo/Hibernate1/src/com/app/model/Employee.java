package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Employee {
	@Id    //id is primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private int id;
	@Column(name="emp_name")
	private String name;
/*	@Embedded
	private Address address;*/
	
	@ElementCollection
	//@JoinTable(name="address_details",joinColumns=@JoinColumn(name="empId"))
	@JoinTable(name="address_details",joinColumns=@JoinColumn(name="empId"))
	@CollectionId(columns = { @Column(name="address_id") }, generator = "addressIdGen", type = @Type(type = "int"))
	//@CollectionId(columns = {@Column(name="address_id")}, generator = "addressIdGen", 
	//		  type = @Type(type = "int"))
	@GenericGenerator(name = "addressIdGen", strategy = "increment")  
	private List<Address> addresses = new ArrayList<Address>();
	
	
/*	public Address getHome() {
		return home;
	}

	public void setHome(Address home) {
		this.home = home;
	}
*/
/*	@Embedded
	@AttributeOverrides({
		
		
		@AttributeOverride(column=@Column(name="Home_hno"),name="hno"),
		@AttributeOverride(column=@Column(name="Home_locality"),name="locality"),
		@AttributeOverride(column=@Column(name="Home_state"),name="state"),
		@AttributeOverride(column=@Column(name="Home_pin"),name="pin"),
	})
	private Address home;*/
	private String skills;

	public int getId() {
		return id;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
}
