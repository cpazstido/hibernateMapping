package com.cf.hibernate.entity.one2one.foreignkey;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @JoinColumn(name="address_id")//不要写成id，不然在数据库中生成不了address_id  
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
