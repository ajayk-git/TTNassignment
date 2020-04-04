package com.ajaykumar.RestfullWebServices.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
@ApiModel(description = "All details about Employees")
public class Employee {
    @ApiModelProperty(notes = "Id of employee must be unique.")
    int id;
    @ApiModelProperty(notes = "Age should be in past.")
    int age;
    //Question:9
    @Size(min=3,message = "Should have length of name greater than 3")
    String name;
  Employee(){

  }
  public Employee(int id, int age, String name){

      this.id=id;
      this.age=age;
      this.name=name;

  }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
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
}
