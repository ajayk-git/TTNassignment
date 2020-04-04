package com.ajaykumar.RestfullWebServices.Versioning.Entity;

public class StudentVersion2 {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentVersion2(Student student) {
        this.student = student;

    }

    @Override
    public String toString() {
        return "StudentVersion2{" +
                "student=" + student +
                '}';
    }
}
