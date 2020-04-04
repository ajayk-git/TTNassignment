package com.ajaykumar.RestfullWebServices.filtering.controllers;

import com.ajaykumar.RestfullWebServices.filtering.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//Static Filtering Controller

import java.util.Arrays;
import java.util.List;

@RestController
public class StaticFilterController {
    @GetMapping("/staticFiltering1")
    public User returnStaticFiltering(){
        return new User(1,23,"Ajay Kumar","Ajay@123");
    }
    @GetMapping("/staticFiltering2")
    public List<User> returnStaticFilteringResult(){
        return Arrays.asList(new User(2,25,"Harshit","Harshit@123")
                ,new User(3,33,"vijay Kumar","Vijay@123"));
    }
}

