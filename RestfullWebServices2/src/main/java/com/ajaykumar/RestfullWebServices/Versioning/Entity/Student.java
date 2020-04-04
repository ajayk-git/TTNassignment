package com.ajaykumar.RestfullWebServices.Versioning.Entity;

public class Student {
    private int rollNumber;
    private String name;
    private String fatherName;
    private String school;

    public Student(){

    }
    public Student(int rollNumber, String name, String fatherName, String school) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.school = school;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
