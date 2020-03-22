package com.ajaykumar.SpringJPApart2.InheritanceMapping.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TableperclassStrategyFulltime")
//@DiscriminatorValue("Fulltime")
//@PrimaryKeyJoinColumn(name = "id")
//@Table(name = "joinedStrategyFulltime")
public class Fulltime extends EmployeeTTN {

    private int totalLeaves;
    private String position;


    public Fulltime(String name, double salary, int totalLeaves, String position) {
        super( name, salary);
        this.totalLeaves = totalLeaves;
        this.position = position;
    }

    public Fulltime(){

    };

    public int getTotalLeaves() {
        return totalLeaves;
    }

    public void setTotalLeaves(int totalLeaves) {
        this.totalLeaves = totalLeaves;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
