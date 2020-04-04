package com.ajaykumar.RestfullWebServices.filtering.controllers;

//Dynamic Filtering Controller

import com.ajaykumar.RestfullWebServices.filtering.User;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DynamicFilterController {
    @GetMapping("DynamicFiltering")
    public MappingJacksonValue returnDynamicFilteringResult(){
        User user=new User(1,23,"Ajay Kumar","Ajay@1234");
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.
                filterOutAllExcept("username","id","age");
        FilterProvider filterProvider = new SimpleFilterProvider().
                addFilter("NewFilter",simpleBeanPropertyFilter);
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(user);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}
