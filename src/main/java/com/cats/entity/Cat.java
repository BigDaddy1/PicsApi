package com.cats.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="cat")
public class Cat {
    @Id
@GeneratedValue(generator = "increment")
@GenericGenerator(name="increment", strategy="increment")
private int id;
    @Column(name="gender",nullable = false)
    private String gender;


    @Column(name="name",nullable = false)
    private String name;
    @Column(name="age", nullable = false)
    private int age;
    public Cat()
    {}
    public int getId()
    {
        return  id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getAge()
    {
        return  age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return  name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getGender()
    {
        return  gender;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }

}
