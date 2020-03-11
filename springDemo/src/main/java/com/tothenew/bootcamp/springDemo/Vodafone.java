
package com.tothenew.bootcamp.springDemo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class Vodafone implements Sim{


    void Vodafone(){
        System.out.println("Inside the constructor of Vodafone class");
    }
    @Override
    public void calling() {
        System.out.println("Calling via Vodafone");

    }

    @Override
    public void messaging() {
        System.out.println("Messaging via Vodafone");
    }
}
