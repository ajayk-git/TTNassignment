//Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management
package com.tothenew.bootcamp.springDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ques3{
    Ques3(){

    }
    @Autowired
    Sim sim;
    void ques3show(){
        System.out.println("--------Showing the Demo of @Autowired and @Component annotations in Ques3--------");
        sim.messaging();
        sim.calling();
    }

}
