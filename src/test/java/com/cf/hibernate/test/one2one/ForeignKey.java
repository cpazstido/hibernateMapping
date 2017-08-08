package com.cf.hibernate.test.one2one;

import org.junit.Test;

import com.cf.hibernate.entity.one2one.foreignkey.Address;
import com.cf.hibernate.entity.one2one.foreignkey.Employee;
import com.cf.hibernate.test.HibernateBase;

public class ForeignKey extends HibernateBase {
	@Test
	public void foreignkey() {
		Employee employee = new Employee();  
        employee.setName("陈飞3");  
        employee.setSalary(2000);  
          
        Address address = new Address();  
        address.setCity("成都3");  
        address.setState("BJ");  
        address.setStreet("Shuangying");    
        employee.setAddress(address);  
//        session.save(address);
        session.save(employee);
	}
}
