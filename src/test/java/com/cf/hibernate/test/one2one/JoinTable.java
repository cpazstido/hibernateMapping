package com.cf.hibernate.test.one2one;

import org.junit.Test;

import com.cf.hibernate.entity.one2one.jointable.Address;
import com.cf.hibernate.entity.one2one.jointable.Employee;
import com.cf.hibernate.test.HibernateBase;

public class JoinTable extends HibernateBase {
	@Test
	public void joinTable() {
		Employee employee = new Employee();  
        employee.setName("陈飞4");  
        employee.setSalary(2000);  
          
        Address address = new Address();  
        address.setCity("成都4");  
        address.setState("BJ");  
        address.setStreet("Shuangying");    
        employee.setAddress(address);  
//        session.save(address);
        session.save(employee);
	}
}
