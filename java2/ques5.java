public class ques5 {

    class Employee {
        private int id =10;
        private String name ="Ajay Kumar";

        public Employee(Employee employee) {
            System.out.println("Copying the object using Copy Construtor");
            this.id = employee.id;
            this.name = employee.name;
        }
    }

    public static void main(String[] args) {

      //  Employee emp =new Employee();



    }
}