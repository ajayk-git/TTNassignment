package com.tothenew.bootcamp.springDemo;

import org.springframework.stereotype.Component;

class Travel{
    Travel(){
        System.out.println("In Travel class");
    }
    Car c=new Car();
    public void startJourney(){

        c.move();

    }

}

class Car{
    Car(){
        System.out.println("In Car class");
    }
    public void move(){
        System.out.println("Moving in 4 wheeler");

    }

}


@Component
public class Ques1 {

    public void showTightCoupling() {
        System.out.println("--------------Implementation of tight Coupling -----------");
        Travel travel=new Travel();
        travel.startJourney();
    }
}
