package com.cf.hibernate.test.one2one;

import org.junit.Test;

import com.cf.hibernate.entity.one2one.inonetable.Address;
import com.cf.hibernate.entity.one2one.inonetable.Employee;
import com.cf.hibernate.test.HibernateBase;

public class InOneTable extends HibernateBase {
	@Test
	public void inOneTable() {        
        Employee employee = new Employee();  
        employee.setName("frank");  
        employee.setSalary(2000);  
          
        Address address = new Address();  
        address.setCity("Beijing");  
        address.setState("BJ");  
        address.setStreet("Shuangying");    
        employee.setAddress(address);  
        session.save(employee);  
	}
}
