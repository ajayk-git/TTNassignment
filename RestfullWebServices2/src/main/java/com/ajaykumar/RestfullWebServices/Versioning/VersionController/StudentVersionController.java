package com.ajaykumar.RestfullWebServices.Versioning.VersionController;

import com.ajaykumar.RestfullWebServices.Versioning.Entity.Student;
import com.ajaykumar.RestfullWebServices.Versioning.Entity.StudentVersion1;
import com.ajaykumar.RestfullWebServices.Versioning.Entity.StudentVersion2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentVersionController {
    @GetMapping("/StudentVersion1")
    public StudentVersion1 getStudentVersion1(){
        StudentVersion1 studentVersion1=new StudentVersion1(1,"Ajay");
        return studentVersion1;
    }

    @GetMapping("/StudentVersion2")
    public StudentVersion2 getStudentVersion2(){
        Student student=new Student(1,"Ajay kumar","Ramesh Chandra","St. Xaviers School");
        StudentVersion2 studentVersion2=new StudentVersion2(student);
        return studentVersion2;
    }

    @GetMapping(value = "Student/param",params = "version=1")
    public  StudentVersion1 getStudentVersion1UsingParam(){
        StudentVersion1 studentVersion1=new StudentVersion1(2,"Shreya Mago");
        return studentVersion1;
    }


    @GetMapping(value = "Student/param",params = "version=2")
    public  StudentVersion2 getStudentVersion2UsingParam(){
        Student student=new Student(20,"Shreya Mago","Subhash Mago","St. Paul School");
        StudentVersion2 studentVersion2=new StudentVersion2(student);
        return studentVersion2;
    }

    @GetMapping(value = "Student/header",headers = "X-API-VERSION=1")
    public  StudentVersion1 getStudentVersion1UsingHeader(){
        StudentVersion1 studentVersion1=new StudentVersion1(10,"Nikhil Mittal");
        return studentVersion1;
    }


    @GetMapping(value = "Student/header",headers = "X-API-VERSION=2")
    public  StudentVersion2 getStudentVersion2UsingHeader(){
        Student student=new Student(10,"Nikhil Mittal","Naresh Mittal","Maranatha School");
        StudentVersion2 studentVersion2=new StudentVersion2(student);
        return studentVersion2;
    }


    @GetMapping(value = "Student/produces",produces = "application/vnd.company.app-v1+json")
    public  StudentVersion1 getStudentVersion1UsingMimetype(){
        StudentVersion1 studentVersion1=new StudentVersion1(17,"Gabbar Singh");
        return studentVersion1;
    }


    @GetMapping(value = "Student/produces",produces= "application/vnd.company.app-v2+json")
    public  StudentVersion2 getStudentVersion2UsingMimetype(){
        Student student=new Student(17,"Gabbar Singh","Kaalia Singh","Dhanno Public School");
        StudentVersion2 studentVersion2=new StudentVersion2(student);
        return studentVersion2;
    }

}
