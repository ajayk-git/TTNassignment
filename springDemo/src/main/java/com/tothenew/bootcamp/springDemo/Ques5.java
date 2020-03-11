//(5) Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary

package com.tothenew.bootcamp.springDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ques5 {
    @Autowired
    Sim sim;
    Ques5(){

    }

    void ques5Show(){
        System.out.println("This method is showing the details of Vodafone class because we used @primary annotation for Vodafone class.");
        sim.messaging();
        sim.calling();
    }
}
