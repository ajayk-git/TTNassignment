package com.ajaykumar.SpringJPApart2.InheritanceMapping.Entity;

import javax.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="employeeType", discriminatorType = DiscriminatorType.STRING)
//@Table(name = "EmployeeTTNSingleTableStrategy")
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
@Table(name = "TablePerClassEmployeeTTN")
//@Inheritance(strategy = InheritanceType.JOINED)
//@Table(name = "EmployeeTTNJoinedStrategy")

public abstract class EmployeeTTN {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double salary;

    EmployeeTTN() {

    }

    public EmployeeTTN(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
