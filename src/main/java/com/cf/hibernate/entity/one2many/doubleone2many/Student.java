package com.cf.hibernate.entity.one2many.doubleone2many;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_student")
public class Student
{
    private int id;
    private String name;
    private int age;
    private ClassRoom room;
    
    @ManyToOne(fetch=FetchType.LAZY)//　　---> ManyToOne指定了多对一的关系，fetch=FetchType.LAZY属性表示在多的那一方通过延迟加载的方式加载对象(默认不是延迟加载)
    @JoinColumn(name="rid")//　　--->　　通过 JoinColumn 的name属性指定了外键的名称 rid　(注意：如果我们不通过JoinColum来指定外键的名称，系统会给我们声明一个名称)
    public ClassRoom getRoom()
    {
        return room;
    }
    public void setRoom(ClassRoom room)
    {
        this.room = room;
    }
    @Id
    @GeneratedValue
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
}
