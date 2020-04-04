package com.ajaykumar.RestfullWebServices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonFilter("NewFilter")
@JsonIgnoreProperties(value = {"password"})
public class User {
    private int id;
    private int age;
    private String name;
    //we can also use @JsonIgnore
    private String password;

    public User(int id, int age, String name, String password) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.password = password;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
