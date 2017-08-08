package com.cf.hibernate.entity.one2one.jointable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table(name="employee") 
public class Employee {
	@Id  
	@GeneratedValue
    private int id;  
    private String name;  
    private long salary;  
      
    @OneToOne(cascade=CascadeType.ALL)  
    @JoinTable(name="employee_address",joinColumns=@JoinColumn(name="address_id"),inverseJoinColumns=@JoinColumn(name="employee_id")) 
    private Address address;  
      
    public Address getAddress() {  
        return address;  
    }  
  
    public void setAddress(Address address) {  
        this.address = address;  
    }  
  
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
