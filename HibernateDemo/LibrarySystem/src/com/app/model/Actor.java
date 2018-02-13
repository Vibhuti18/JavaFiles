package com.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="actor_details")
@NamedQuery(name = "findActorByRank", query = "from Actor where rank <= :rank")   
public class Actor implements Serializable{
	
	private static final long serialVersionUID = 167074913024325792L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="actor_id")
	private int id;
	@Column(name="actor_name")
	private String name;
	@Column(name="actor_performance")
	private String performance;
	@Column(name="actor_rank")
	private int rank;
	
	public int getId() {
		return id;
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

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	

}
