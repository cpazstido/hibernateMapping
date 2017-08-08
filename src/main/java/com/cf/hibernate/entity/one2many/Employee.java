package com.cf.hibernate.entity.one2many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="employee")  
public class Employee {  
    @Id  
    @GeneratedValue  
    private int id;  
    private String name;  
    private long salary;  
  
    public Employee() {}  
      
    public Employee(int id) { this.id = id; }

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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
    
    
}  
