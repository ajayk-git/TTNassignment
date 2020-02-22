import java.util.Scanner;

class Employee2 implements Cloneable {                                                       //step1 : implementing clonable interface
    private int id ;
    private String name;

    public String toString(){
        return "id : "+id+" name : "+name;
    }
    public Employee2(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public Employee2 clone() throws CloneNotSupportedException                               //step 2 : Overriding the clone method
    {
        return (Employee2) super.clone();

    }
}
public class ques5B {
    public static void main(String[] args) throws CloneNotSupportedException{


        System.out.println("Enter Employee ID : ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        System.out.println("Enter Employee Name : ");
        String Name = input.nextLine();
        Employee2 emp = new Employee2(id, Name);
        System.out.println(emp);
        System.out.println("Original object's Hashcode : " + emp.hashCode());
        System.out.println("-----------------------------");
        System.out.println("clone the object using clonable interface :");
        Employee2 empcopy= emp.clone();                                                         //step3 : call for clone method
        System.out.println(empcopy);
        System.out.println("Copied object's Hashcode : " + empcopy.hashCode());


    }
}