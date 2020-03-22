package com.ajaykumar.SpringJPApart2.InheritanceMapping.Entity;
import javax.persistence.*;

@Entity
//@DiscriminatorValue("Intern")
@Table(name = "TablePerClassStrategyIntern")
//@PrimaryKeyJoinColumn(name ="id")
//@Table(name="JoinedStrategyIntern")
public class Intern extends EmployeeTTN {

  private  String joinMonth;
  private  String endMonth;
  private String college;

  Intern(){

  }
    public Intern(String name, double salary, String joinMonth, String endMonth, String college) {
        super(name, salary);
        this.joinMonth = joinMonth;
        this.endMonth = endMonth;
        this.college = college;
    }

    public String getJoinMonth() {
        return joinMonth;
    }

    public void setJoinMonth(String joinMonth) {
        this.joinMonth = joinMonth;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
