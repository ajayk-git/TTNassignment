package com.ajaykumar.RestfullWebServices.Controllers;

import com.ajaykumar.RestfullWebServices.Entity.WelcomeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {

     @Autowired
    MessageSource messageSource;

    @GetMapping("/WelcomeBean")
    public WelcomeBean getWelcomeBean(){
        return new WelcomeBean("Welcome to String boot Bean");
    }

    @GetMapping("/Internationalisation")
    public String implementInternationalisation(@RequestHeader(name = "Accept-Language",required =false) Locale locale){
        return messageSource.getMessage("Good.Morning.message",null,locale);
    }
//  Ques3. Create a GET request which takes "username" as param and shows a localized message "Hello Username". (Use parameters in message properties)

    @GetMapping("/HelloUser/{username}")
    public String returnHelloUserName(@PathVariable  String username){
        return "Hello "+username+", Welcome to TTN.";
    }
}


//    @GetMapping("/WelcomeBean/path-variable/{name}")
//    public WelcomeBean getWelcomeBeanPathVariable(@PathVariable= String name){
//        return new WelcomeBean(String.format("Welcome to String boot Bean %s",name));
//    }
