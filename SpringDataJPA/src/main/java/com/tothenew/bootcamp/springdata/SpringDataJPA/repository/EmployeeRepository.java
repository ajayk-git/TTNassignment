package com.tothenew.bootcamp.springdata.SpringDataJPA.repository;
import com.tothenew.bootcamp.springdata.SpringDataJPA.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

        Optional<Employee> findByName(String name);

       List<Employee> findByNameLike(String character);
       List<Employee> findByAgeBetween(int age1,int age2);
}
