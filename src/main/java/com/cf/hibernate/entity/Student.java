package com.cf.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // 将一个类声明为一个实体bean(即一个持久化POJO类)
@Table(name = "t_student", schema = "test") // 注解声明了该实体bean映射指定的表（table）schema
public class Student {
	public Student(int id, String name, String password, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public Student() {
	}

	@Id // 用来注册主属性，@GeneratedValue用来注册主属性的生成策略，@Column用来注册属性，@Version用来注册乐观锁
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_id", nullable = false, unique = true)
	private int id;

	@Column(name = "t_name")
	private String name;

	@Column(name = "t_pwd")
	private String password;

	@Column(name = "age")
	private int age;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "[id:" + id + ",name:" + name + ",age:" + age + "]";
	}

}
