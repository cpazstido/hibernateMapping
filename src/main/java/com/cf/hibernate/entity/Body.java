package com.cf.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name = "t_body", schema = "test")
public class Body { 
	private Long id;
	private Heart heart;
	private String content;
    @Id  
    @GeneratedValue
    public Long getId() { return id; }  
  
    @OneToOne(cascade = CascadeType.ALL)  
    @PrimaryKeyJoinColumn
    public Heart getHeart() {  
        return heart;  
    }
    
    @Column
	public String getContent() {
		return content;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void setContent(String content) {
		this.content = content;
	}  
	
	
    
    
}  
