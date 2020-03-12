package com.tothenew.bootcamp.springdata.SpringDataJPA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int age;
    private String name;
    private String location;

    //Default Constructor
    public Employee(){

     }
   //parameterized constructor
    public Employee(int id, int age, String name, String location) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    //Getters
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}