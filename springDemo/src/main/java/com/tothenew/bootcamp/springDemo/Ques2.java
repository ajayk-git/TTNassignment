//(2) Write a program to demonstrate Loosely Coupled code.

package com.tothenew.bootcamp.springDemo;
import org.springframework.stereotype.Component;

@Component
public class Ques2  {

    public void showLooseCoupling() {
        System.out.println("--------------Implementation of Loose Coupling -----------");
        Sim airtel = new Airtel();
        Sim vodafone = new Vodafone();
        vodafone.calling();
        vodafone.messaging();
        airtel.calling();
        airtel.messaging();
    }
}
