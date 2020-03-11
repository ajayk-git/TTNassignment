//(4) Get a Spring Bean from application context and display its properties.

package com.tothenew.bootcamp.springDemo;
import org.springframework.stereotype.Component;

@Component
public class Ques4 {

    private String name ="Ajay Kumar";
    private int Id =3979;

    public Ques4(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


    public void ques4Show(){
        System.out.println("-------------Getting a Bean from application configuration and showing its properties-----------");
        System.out.println("Name : "+getName()+" Id :  "+getId());

    }


}
