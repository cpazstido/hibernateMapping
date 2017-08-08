package com.cf.hibernate.test.many2one;

import org.junit.Test;

import com.cf.hibernate.entity.many2one.Department;
import com.cf.hibernate.entity.many2one.Employee;
import com.cf.hibernate.test.HibernateBase;

public class Many2One extends HibernateBase{

	@Test
	public void many2One() {
		Employee employee = new Employee();  
        employee.setName("陈飞");  
        employee.setSalary(2000);  
          
        Department department = new Department();
        department.setName("开发");
        employee.setDepartment(department);
//        session.save(address);
        session.save(employee);
	}
	
	@Test
	public void joinTable() {
		com.cf.hibernate.entity.many2one.jointable.Employee employee = new com.cf.hibernate.entity.many2one.jointable.Employee();  
        employee.setName("陈飞");  
        employee.setSalary(2000);  
          
        com.cf.hibernate.entity.many2one.jointable.Department department = new com.cf.hibernate.entity.many2one.jointable.Department();
        department.setName("开发");
        employee.setDepartment(department);
//        session.save(address);
        session.save(employee);
	}
}
