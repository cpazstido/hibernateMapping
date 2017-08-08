package com.cf.hibernate.entity.many2one.jointable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  
@Table(name="Employee")  
public class Employee {  
    @Id  
    @GeneratedValue
    private int id;  
    private String name;  
    private long salary;  
      
    @ManyToOne(cascade=CascadeType.ALL)  
    @JoinColumn(name="department_id")
    //@JoinColumn可以不写，默认以department_id作为外键关联
    private Department department;  
  
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}  
    
}  
