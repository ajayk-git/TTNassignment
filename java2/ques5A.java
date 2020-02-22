import java.util.Scanner;
 class Employee {
        private int id ;
        private String name;

        public Employee(Employee employee) {
            System.out.println("Copying the object using Copy Construtor");
            this.id = employee.id;
            this.name = employee.name;
        }
        public String toString(){
            return "id : "+id+" name : "+name;
        }
        public Employee(int id,String name) {
         this.id=id;
         this.name=name;
        }
    }

    public class ques5A {
    public static void main(String[] args) {
        System.out.println("Enter Employee ID : ");
        Scanner input =new Scanner(System.in);
        int id=input.nextInt();
        System.out.println("Enter Employee Name : ");
        String Name=input.nextLine();
        Employee emp=new Employee(id,Name);
        System.out.println(emp);
        System.out.println("Original object's Hashcode : "+emp.hashCode());
        System.out.println("-----------------------------");
        Employee copyEmp=new Employee(emp);
        System.out.println(copyEmp);
        System.out.println("Copied object's Hashcode : "+copyEmp.hashCode());







    }
}