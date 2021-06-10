package com.javatechie.report.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROVICE")
public class Employee {
	
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    
    @Column(name = "NAME")
	private String name;


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


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Employee() {
		super();
	}
    
    
    
   
}
