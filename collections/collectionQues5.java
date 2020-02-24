import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1 {
    String Name;
    Double Age;
    Double Salary;
    Employee1(String n, Double a, Double s){
        this.Name=n;
        this.Age=a;
        this.Salary=s;
    }
    public String toString(){
        return Name+" "+Age+" "+Salary;
    }
}
public class collectionQues5 {
    public static void main(String[] args) {
        ArrayList<Employee1> employeeList=new ArrayList<Employee1>();
        employeeList.add(new Employee1("Ajay",23.0,22000.0));
        employeeList.add(new Employee1("Chirag",21.0,15000.0));
        employeeList.add(new Employee1("Jatin",15.0,35000.0));
        employeeList.add(new Employee1("Mohit",26.0,22000.0));
        employeeList.add(new Employee1("Ishika",24.0,32000.0));
        employeeList.add(new Employee1("Shreya",23.0,41000.0));
        System.out.println("Employee list before sorting : ");
        System.out.println("---------------------------------------");
        for(int i=0;i<employeeList.size();i++){
            System.out.println(employeeList.get(i));}
        System.out.println("---------------------------------------");
        System.out.println("Employee list after sorting : ");
        Collections.sort(employeeList, new CompareBySalary());
        //System.out.println(employeeList);
        for(int i=0;i<employeeList.size();i++){
            System.out.println(employeeList.get(i));
        }
    }
}

class CompareBySalary implements Comparator<Employee1> {
    public int compare(Employee1 e1, Employee1 e2){
        if(e1.Salary>e2.Salary)
            return -1;
        else if(e1.Salary<e2.Salary)
            return 1;
        else
            return 0;
    }
}