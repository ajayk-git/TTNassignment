package com.ajaykumar.SpringJPApart2.Repositories;

import com.ajaykumar.SpringJPApart2.entities.Employee;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    @Query("select firstName, lastName from Employee where salary >(select AVG(salary) from Employee)")
    List<Object[]> findfirstNameAndlastName(PageRequest pageable);


    @Query("select AVG(salary) from Employee")
    Integer findAvarageSalary();


    @Transactional
    @Query("update Employee set salary=:salarypassed where salary <:avg")
    @Modifying
    void updateSalary(@Param("avg") double avgsalary,@Param("salarypassed") double amount);


    @Query("select MIN(salary) from Employee")
    double findMinSalary();

    @Transactional
    @Query("delete from Employee where salary=:minSalary")
    @Modifying
    void deleteEmployeeWithMinimumsalary(@Param("minSalary") double salary);



    @Query(value = "select emp_id,emp_age,emp_first_name from employee_table  where emp_last_name like '%Singh'", nativeQuery = true)
    List<Object []> findAllSinghUsingNativeQuery();


    @Transactional
    @Query(value = "delete from employee_table where emp_age>:AGE",nativeQuery = true)
    @Modifying
    void deleteEmployeeUsingNative(@Param("AGE") Integer age);

    @Query(" from Employee")
    List<Employee> findAllEmployees();



    // @Test
//    public void findAllEmployeepartialTest() {
//
//        List<Object[]> partialData = employeeRepository.findAllEmployeepartial();
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        for (Object[] partial : partialData) {
//            System.out.println(partial[0]);
//            System.out.println(partial[1]);
//        }
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//    }
//
//    @Test
//    public void findAllEmployeeAVGSalaryTest() {
//
//        List<Object[]> partialData = employeeRepository
//                .findfirstNameANDlastName(PageRequest.of(0, 5, Sort.by("age").and(Sort.by("salary").descending())));
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        for (Object[] partial : partialData) {
//            System.out.println(partial[0]);
//            System.out.println(partial[1]);
//            //System.out.println(partial[2]);
//        }
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//    }
//
//    @Test
//    public void updateAllEmployeeSalaryTest() {
//        employeeRepository.AllEmployeeUpdateSalary(890000.0);
//
//
//    }


}
