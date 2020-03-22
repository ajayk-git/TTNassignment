package com.ajaykumar.SpringJPApart2;
import com.ajaykumar.SpringJPApart2.ComponentMapping.Entity.EmployeeComponentMapping;
import com.ajaykumar.SpringJPApart2.ComponentMapping.Entity.Salary;
import com.ajaykumar.SpringJPApart2.ComponentMapping.Repository.EmployeeComponentRepository;
import com.ajaykumar.SpringJPApart2.Repositories.EmployeeRepository;
import com.ajaykumar.SpringJPApart2.InheritanceMapping.Repository.EmployeeTTNRepository;
import com.ajaykumar.SpringJPApart2.entities.Employee;
import com.ajaykumar.SpringJPApart2.InheritanceMapping.Entity.EmployeeTTN;
import com.ajaykumar.SpringJPApart2.InheritanceMapping.Entity.Fulltime;
import com.ajaykumar.SpringJPApart2.InheritanceMapping.Entity.Intern;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Objects;

@SpringBootTest
class SpringJpApart2ApplicationTests {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void addEmployeeTest() {
        Employee employee = new Employee();
        employee.setFirstName("Amar Akbar");
        employee.setLastName("ASingh");
        employee.setAge(65);
        employee.setSalary(2000);
        employeeRepository.save(employee);

    }

    @Test
    public void findAEmployeeTest() {
        List<Employee> employeeList = employeeRepository.findAllEmployees();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        employeeList.forEach(e -> System.out.println(e.toString()));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    @Test
    public void findAllEmployeeTest(){
        //Pageable pageable = PageRequest.of(1,1);
        List<Employee> employees = (List<Employee>) employeeRepository.findAll();
        employees.forEach(e-> System.out.println(e));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }



    //Ques 1: Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @Test
    public void findfirstNameAndlastName() {
        Sort sort = Sort.by(Sort.Order.asc("age"),Sort.Order.desc("salary"));
        Pageable pageable = PageRequest.of(0,5,sort);
        List<Object[]> employees = employeeRepository.findfirstNameAndlastName((PageRequest) pageable);
        for (Object[] objects : employees) {
            System.out.println(objects[0]+" "+objects[1]);
        }
    }

    //Ques 2:Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    @Test
    public void updateSalaryTest(){
        Integer avgsalary = employeeRepository.findAvarageSalary();
        employeeRepository.updateSalary(avgsalary,12000.00);
    }

    //BEFORE:
//            mysql> select * from employee_table;
//            +--------+---------+----------------+---------------+------------+
//            | emp_id | emp_age | emp_first_name | emp_last_name | emp_salary |
//            +--------+---------+----------------+---------------+------------+
//            |      1 |      23 | Ajay           | Kumar         |       1000 |
//            |      2 |      20 | Vijay          | Kumar         |       2000 |
//            |      3 |      25 | Shreya         | Mago          |       3000 |
//            |      4 |      22 | Ayush          | Singh         |       1000 |
//            |      5 |      19 | Ayush          | Thomas        |       1000 |
//            |      6 |      29 | Ranbeer        | Singh         |       1000 |
//            |      7 |      26 | Sumit          | Mittal        |       5000 |
//            +--------+---------+----------------+---------------+------------+
//
//   AFTER:
//            mysql> select * from employee_table;
//            +--------+---------+----------------+---------------+------------+
//            | emp_id | emp_age | emp_first_name | emp_last_name | emp_salary |
//            +--------+---------+----------------+---------------+------------+
//            |      1 |      23 | Ajay           | Kumar         |      12000 |
//            |      2 |      20 | Vijay          | Kumar         |       2000 |
//            |      3 |      25 | Shreya         | Mago          |       3000 |
//            |      4 |      22 | Ayush          | Singh         |      12000 |
//            |      5 |      19 | Ayush          | Thomas        |      12000 |
//            |      6 |      29 | Ranbeer        | Singh         |      12000 |
//            |      7 |      26 | Sumit          | Mittal        |       5000 |
//            +--------+---------+----------------+---------------+------------+


    //Ques 3:Delete all employees with minimum salary.
    @Test
    @Rollback(value = false)
    public void delete(){
        double minSalaryresult = employeeRepository.findMinSalary();
        employeeRepository.deleteEmployeeWithMinimumsalary(minSalaryresult);
        System.out.println("Employee with minimum salary is deleted");;
    }
//  BEFORE:
//            mysql> select * from employee_table;
//            +--------+---------+----------------+---------------+------------+
//            | emp_id | emp_age | emp_first_name | emp_last_name | emp_salary |
//            +--------+---------+----------------+---------------+------------+
//            |      1 |      23 | Ajay           | Kumar         |      12000 |
//            |      2 |      20 | Vijay          | Kumar         |       2000 |
//            |      3 |      25 | Shreya         | Mago          |       3000 |
//            |      4 |      22 | Ayush          | Singh         |      12000 |
//            |      5 |      19 | Ayush          | Thomas        |      12000 |
//            |      6 |      29 | Ranbeer        | Singh         |      12000 |
//            |      7 |      26 | Sumit          | Mittal        |       5000 |
//            +--------+---------+----------------+---------------+------------+
//            7 rows in set (0.00 sec)
//
//AFTER
//            mysql> select * from employee_table;
//            +--------+---------+----------------+---------------+------------+
//            | emp_id | emp_age | emp_first_name | emp_last_name | emp_salary |
//            +--------+---------+----------------+---------------+------------+
//            |      1 |      23 | Ajay           | Kumar         |      12000 |
//            |      3 |      25 | Shreya         | Mago          |       3000 |
//            |      4 |      22 | Ayush          | Singh         |      12000 |
//            |      5 |      19 | Ayush          | Thomas        |      12000 |
//            |      6 |      29 | Ranbeer        | Singh         |      12000 |
//            |      7 |      26 | Sumit          | Mittal        |       5000 |
//            +--------+---------+----------------+---------------+------------+
//            6 rows in set (0.00 sec)


    //Ques 4:Display the id, first name, age of all employees where last name ends with "singh"
    @Test
    public void findSinghEmployeeDetailsUsingNativeTest(){
        List<Object[]> objectsList=employeeRepository.findAllSinghUsingNativeQuery();
        for (Object[] objects : objectsList) {
            System.out.println(objects[0]+"** "+objects[1]+" **"+objects[2]);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }

}
//
//            //OUTPUT
//                   4** 22 **Ayush
//                   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//                   6** 29 **Ranbeer
//                   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


//            mysql> select emp_id,emp_age,emp_first_name from employee_table where emp_last_name like '%Singh';
//            +--------+---------+----------------+
//            | emp_id | emp_age | emp_first_name |
//            +--------+---------+----------------+
//            |      4 |      22 | Ayush          |
//            |      6 |      29 | Ranbeer        |
//            +--------+---------+----------------+
//
//

    //Ques 5:Delete all employees with age greater than 45(Should be passed as a parameter)
    @Test
    public void deleteUsingNative(){
        employeeRepository.deleteEmployeeUsingNative(45);

    }
//      BEFORE:
//      select * from employee_table;
//            +--------+---------+----------------+---------------+------------+
//            | emp_id | emp_age | emp_first_name | emp_last_name | emp_salary |
//            +--------+---------+----------------+---------------+------------+
//            |      1 |      23 | Ajay           | Kumar         |       1000 |
//            |      2 |      20 | Vijay          | Kumar         |       2000 |
//            |      3 |      25 | Shreya         | Mago          |       3000 |
//            |      4 |      22 | Ayush          | Singh         |       1000 |
//            |      5 |      19 | Ayush          | Thomas        |       1000 |
//            |      6 |      29 | Ranbeer        | Singh         |       1000 |
//            |      7 |      26 | Sumit          | Mittal        |       5000 |
//            |      8 |      78 | Anil           | Mittal        |       2000 |
//            |      9 |      65 | Sunil          | Jangir        |       2000 |
//            +--------+---------+----------------+---------------+------------+

     //AFTER
//    mysql> select * from employee_table;
//            +--------+---------+----------------+---------------+------------+
//            | emp_id | emp_age | emp_first_name | emp_last_name | emp_salary |
//            +--------+---------+----------------+---------------+------------+
//            |      1 |      23 | Ajay           | Kumar         |       1000 |
//            |      2 |      20 | Vijay          | Kumar         |       2000 |
//            |      3 |      25 | Shreya         | Mago          |       3000 |
//            |      4 |      22 | Ayush          | Singh         |       1000 |
//            |      5 |      19 | Ayush          | Thomas        |       1000 |
//            |      6 |      29 | Ranbeer        | Singh         |       1000 |
//            |      7 |      26 | Sumit          | Mittal        |       5000 |
//            +--------+---------+----------------+---------------+------------+





    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Test cases for Inheritance mapping
    @Autowired
    EmployeeTTNRepository employeeTTNRepository;


    @Test
    void addEmployeeTTNTestInheritanceSingleTable() {
        EmployeeTTN employeeTTN2 = new Fulltime("Narendra Kumar", 120000, 24, "CTO");
        EmployeeTTN employeeTTN3 = new Fulltime("Neeraj Sesan",  100000, 24, "Team Lead");
        EmployeeTTN employeeTTN4 = new Fulltime("Nikhil Mittal",90000, 24, "SDE2");
        EmployeeTTN employeeTTN = new Intern("Ajay Kumar",  10000, "January", "August", "DUCS");
        EmployeeTTN employeeTTN5 = new Intern("Sherya Mago", 10000, "January", "August", "LBS");

        employeeTTNRepository.save(employeeTTN2);
        employeeTTNRepository.save(employeeTTN3);
        employeeTTNRepository.save(employeeTTN4);
        employeeTTNRepository.save(employeeTTN);
        employeeTTNRepository.save(employeeTTN5);

    }

    @Test
    void addEmployeeTTNTestInheritanceTablePerClass() {
        Fulltime employeeTTN2 = new Fulltime("Narendra Kumar", 120000, 24, "CTO");
        Fulltime employeeTTN3 = new Fulltime("Neeraj Sesan",  100000, 24, "Team Lead");
        Fulltime employeeTTN4 = new Fulltime("Nikhil Mittal",90000, 24, "SDE2");
        Intern employeeTTN = new Intern("Ajay Kumar",  10000, "January", "August", "DUCS");
        Intern employeeTTN5 = new Intern("Sherya Mago", 10000, "January", "August", "LBS");

        employeeTTNRepository.save(employeeTTN2);
        employeeTTNRepository.save(employeeTTN3);
        employeeTTNRepository.save(employeeTTN4);
        employeeTTNRepository.save(employeeTTN);
        employeeTTNRepository.save(employeeTTN5);


    }

    @Test
    void addEmployeeTTNTestInheritanceJoinedTable() {
        EmployeeTTN employeeTTN1 = new Fulltime("Neeraj Sesan",  12000, 24, "Team Lead");
        EmployeeTTN employeeTTN = new Intern("Aakash Arya", 10000, "Feb", "August", "BVP");

        employeeTTNRepository.save(employeeTTN1);
        employeeTTNRepository.save(employeeTTN);

    }

    ////////////////////////////////////////////////////////////////////////////////////
	//Test case for component mapping
    @Autowired
    EmployeeComponentRepository employeeComponentRepository;

    @Test
    void createEmployeeComponentMappingtest() {
        EmployeeComponentMapping employeeComponentMapping=new EmployeeComponentMapping();
        employeeComponentMapping.setFirstname("Vijay");
        employeeComponentMapping.setLastname("kumar");
        employeeComponentMapping.setAge(20);
        Salary salary=new Salary();
        salary.setBasicSalary(2000);
        salary.setBonusSalary(2500);
        salary.setSpecialAllowanceSalary(5500);
        salary.setTaxAmount(900);
        employeeComponentMapping.setSalary(salary);
        employeeComponentRepository.save(employeeComponentMapping);



    }

}
