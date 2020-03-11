package com.tothenew.bootcamp.springDemo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
class Airtel implements Sim{
//    Airtel(){
//        System.out.println("Inside the Default contructor of Airtel class");
//    }
    void airtelShow(){
        System.out.println("Inside the constructor of Airtel class");
    }
    @Override
    public void calling() {
        System.out.println("Calling via airtel");
    }

    @Override
    public void messaging() {
        System.out.println("Messaging via airtel");
    }
}
