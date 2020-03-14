
//
//      1. Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".
//      2.Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.
//      3.Implement GET http request for Employee to get list of employees.
//      4.Implement GET http request using path variable top get one employee
//      5.Implement POST http request for Employee to create a new employee.
//      6.Implement Exception Handling for resource not found
//      7.Implement DELETE http request for Employee to delete employee
//      8.Implement PUT http request for Employee to update employee
//      9.Apply validation while create a new employee using POST http Request.
//      10.Configure actuator in your project to check the health of application and get the information about various beans configured in your application
//
        package com.ajaykumar.RestfullWebServices.Controllers;
import com.ajaykumar.RestfullWebServices.DaoServices.EmployeeDaoServices;
import com.ajaykumar.RestfullWebServices.Entity.Employee;
import com.ajaykumar.RestfullWebServices.Exceptions.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeDaoServices employeeDaoServices;

    //Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".
    @GetMapping("/Ques1")
    public String helloWord(){
        return "Welcome To Spring Boot";
    }

    //Question3:Implement GET http request for Employee to get list of employees.
    @GetMapping("/Employees")
    public List<Employee> getAllEmployee() {
        List<Employee> resultEmployee = employeeDaoServices.findAll();
        return resultEmployee;
    }

    //Question4:Implement GET http request using path variable to get one employee
    @GetMapping("/Employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeDaoServices.findEmployee(id);
        return employee;

    }

    //Question5:Implement POST http request for Employee to create a new employee
    @PostMapping("/Employees")
    void saveEmployee(@Valid @RequestBody Employee employee) {
        employeeDaoServices.addEmployee(employee);
    }
    //Question6.Implement Exception Handling for resource not found
    //Implemented the class  "EmployeeNotFoundException"


    //Question7:Implement DELETE http request for Employee to delete employee
    @DeleteMapping("/Employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        Employee employee = employeeDaoServices.deleteEmployee(id);
        if (employee == null)
            throw new EmployeeNotFoundException("id " + id);
    }

    //Question8:Implement PUT http request for Employee to update employee
//    @PutMapping("/UpdateEmployee/{id}")
//    public Employees update(@PathVariable int id,@RequestBody Employees e)
//    {
//        return s.updatemp(id,e);
//    }

//    @PostMapping("/Employees")
//    ResponseEntity<Object> ResponseEntity(@RequestBody Employee employee){
//        employeeDaoServices.addEmployee(employee);
//        URI location= ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(employee.getId())
//                .toUri();
//        return ResponseEntity.created(location).build();
//
//    }
}



//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @GetMapping("/Employees/{id}")
//    public Employee getEmployee(@PathVariable int id)
//    {
//        Employee employee=employeeDaoServices.findEmployee(id);
//        if(employee==null){
//            throw new EmployeeNotFoundExp("id"+id);
//        }
//        return employee;
//
//    }