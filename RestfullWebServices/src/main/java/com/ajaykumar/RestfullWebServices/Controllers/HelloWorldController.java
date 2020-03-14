package com.ajaykumar.RestfullWebServices.Controllers;

import com.ajaykumar.RestfullWebServices.Entity.WelcomeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/WelcomeBean")
    public WelcomeBean getWelcomeBean(){
        return new WelcomeBean("Welcome to String boot Bean");
    }
//    @GetMapping("/WelcomeBean/path-variable/{name}")
//    public WelcomeBean getWelcomeBeanPathVariable(@PathVariable= String name){
//        return new WelcomeBean(String.format("Welcome to String boot Bean %s",name));
//    }
}
