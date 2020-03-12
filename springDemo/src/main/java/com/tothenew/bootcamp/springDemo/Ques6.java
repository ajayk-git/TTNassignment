///Perform Constructor Injection in a Spring Bean
package com.tothenew.bootcamp.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ques6 {

    Ques6(){

    }
    Sim sim ;
    @Autowired
    Ques6(Sim sim){
        this.sim=sim;

    }

    void ques6Show(){
	sim.calling();
        System.out.println("-----Implementation of constructor injection. We have injected  the  constructor dependency in Ques6 class.-----");

    }

}
