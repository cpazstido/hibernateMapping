package com.cf.hibernate.test.one2many;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cf.hibernate.entity.one2many.Department;
import com.cf.hibernate.entity.one2many.Employee;
import com.cf.hibernate.entity.one2many.doubleone2many.ClassRoom;
import com.cf.hibernate.entity.one2many.doubleone2many.Student;
import com.cf.hibernate.test.HibernateBase;

public class One2Many extends HibernateBase{

	@Test
	public void one2Many() {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee(); 
        Department dept = new Department();  
        dept.setName("Information");  
  
        List<Employee> employees = new ArrayList<Employee>();  
          
        employee1.setName("frank");  
        employee1.setSalary(2000);  
        employees.add(employee1);  
          
        employee2 = new Employee();  
        employee2.setName("fred");  
        employee2.setSalary(3000);  
        employees.add(employee2);  
        dept.setEmployees(employees);
        session.save(employee1);
        session.save(employee2);
        session.save(dept);
	}
	
	@Test
	public void joinTable() {
		com.cf.hibernate.entity.one2many.jointable.Employee employee = new com.cf.hibernate.entity.one2many.jointable.Employee();  
		com.cf.hibernate.entity.one2many.jointable.Department dept = new com.cf.hibernate.entity.one2many.jointable.Department();  
        dept.setName("Information");  
  
        List<com.cf.hibernate.entity.one2many.jointable.Employee> employees = new ArrayList<com.cf.hibernate.entity.one2many.jointable.Employee>();  
          
        employee.setName("frank");  
        employee.setSalary(2000);  
        employees.add(employee);  
          
        employee = new com.cf.hibernate.entity.one2many.jointable.Employee();  
        employee.setName("fred");  
        employee.setSalary(3000);  
        employees.add(employee);  
        dept.setEmployees(employees);
        session.save(dept);
	}
	
	@Test
	public void doubleone2many() {
		ClassRoom classRoom = new ClassRoom();
		Student student1 = new Student();
		Student student2 = new Student();
		student1.setAge(22);
		student1.setName("chen");
		student1.setRoom(classRoom);
		
		student2.setAge(28);
		student2.setName("fei");
		student2.setRoom(classRoom);
		
		classRoom.setClassName("19");
		classRoom.addStudent(student1);
		classRoom.addStudent(student2);
		
		session.save(classRoom);
		
	}
}
