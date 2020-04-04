package com.ajaykumar.RestfullWebServices.DaoServices;

import com.ajaykumar.RestfullWebServices.Entity.Employee;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDaoServices {
    static public List<Employee> employeeList = new ArrayList<>();
    static int employeeCount = 103;

    static {
        employeeList.add(new Employee(101, 23, "Ajay Kumar"));
        employeeList.add(new Employee(102, 25, "Chirag Bohet"));
        employeeList.add(new Employee(103, 27, "Harsh Beniwal"));
    }

    public List<Employee> findAll() {
        return employeeList;
    }

    public Employee findEmployee(int id) {
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public Employee addEmployee(Employee employee) {
        if (employee.getId() == 0) {
            employee.setId(++employeeCount);
        }
        employeeList.add(employee);
        return employee;
    }

    public Employee deleteEmployee(int id) {
        Iterator<Employee> employeesIterator = employeeList.iterator();
        while (employeesIterator.hasNext()) {
            Employee employee = employeesIterator.next();
            if (employee.getId() == id) {
                employeesIterator.remove();
                return employee;
            }
        }
        return null;
    }

//    public Employee updateEmployee(int id){
//        Iterator<Employee> it=employeeList.iterator();
//        while(it.hasNext()){
//            Employee employee = it.next();
//            if(employee.getId()==id) {
//
//                return employee;
//            }
//        }
//        return null;
//    }


}
