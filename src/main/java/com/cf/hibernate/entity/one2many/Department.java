package com.cf.hibernate.entity.one2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  
@Table(name="Department")  
public class Department {  
    @Id  
    @Column
    @GeneratedValue 
    private long id;  
      
    @Column(name="name")  
    private String name;  
      
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)  
    @JoinColumn(name="department_id")  
    private List<Employee> employees;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
    
}  
