package com.cf.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;

@Entity  
@Table(name = "t_heart", schema = "test")
public class Heart {  
	private Long id;
	private String content;
	private Body body;

	@Id
	@GeneratedValue 
	public Long getId() {
		return id;
	}
	
	@Column
	public String getContent() {
		return content;
	}
	
	@OneToOne(mappedBy = "heart")
	public Body getBody() {
		return body;
	}

	public void setId(Long id) {
		this.id = id;
	}	

	public void setContent(String content) {
		this.content = content;
	}
	
	public void setBody(Body body) {
		this.body = body;
	}
	
	
	
	
    
}
