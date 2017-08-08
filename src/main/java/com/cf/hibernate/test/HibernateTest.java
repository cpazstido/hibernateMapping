package com.cf.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cf.hibernate.entity.Student;

public class HibernateTest {
	public void addEntity() {
//      加载hibernate.cfg.xml配置文件  
        Configuration configuration =  
            new Configuration().configure("hibernate.cfg.xml");  
//      创建SessionFactory  
        SessionFactory sessionFactory =   
            configuration.buildSessionFactory();  
//      通过SessionFactory创建session  
//      session:hibernate所有的操作都围绕session来实现  
//      sessionFactory.openSession():创建一个新的sesssion对象  
        Session session = sessionFactory.openSession();  
//      保存(student对象)  
//      创建对象  
          
          
//      事务:对表的任何修改,必须要开启事务  
//      Hibernate:手动提交事务  
//      开启事务(Transaction)  
        Transaction transation = session.getTransaction();//获得事务  
        transation.begin();//开启事务  
        Student student = new Student();  
        student.setName("shishi");  
        student.setPassword("123456");  
        student.setAge(33);   
        session.save(student);      
        
        transation.commit();//提交事务  
        session.close();
	}
}
