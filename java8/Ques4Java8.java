
//Q4.Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
// and get the instance of the Class using constructor reference

interface Employable
{
    EmployeeJava8 details(String s, int a, String c);
}

class EmployeeJava8
{
    String name;
    int age;
    String city;

    EmployeeJava8(String s, int a, String c)
    {
        name = s;
        age = a;
        city = c;
    }

    String getDetails()
    {
        return this.name+" "+this.age+" "+this.city;
    }
}

public class Ques4Java8
{
    public static void main(String[] args) {

        Employable emp = EmployeeJava8::new;

        //this is the default technique we apply
        /*Employee e1 = new Employee("Ajay Kumar", 22, "Rajasthan");
        Employee e2 = new Employee("Naveen", 25, "New Delhi");
        */

        //here we are using constructor reference, in that we are calling a method of the interface
        //that is compatible with the constructor type defined in Employee class
        EmployeeJava8 e3 = emp.details("Ajay Kumar", 22, "Rajasthan");
        EmployeeJava8 e4 = emp.details("Naveen", 25, "New Delhi");

        System.out.println(e4.getDetails());
        System.out.println(e3.getDetails());

    }
}