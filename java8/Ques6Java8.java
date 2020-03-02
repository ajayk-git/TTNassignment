// Q.6 Create and access default and static method of an interface.

interface InterfaceOne{
    default void display(){
        System.out.println("this is a default method of the interface");
    }

    static  void show(){
        System.out.println("static method of the interface");
    }

}

public class Ques6Java8 implements InterfaceOne {

    public void display(){
        InterfaceOne.super.display();

    }
    public static void main(String[] args) {

        Ques6Java8 obj = new Ques6Java8();
        obj.display(); // calls default method
        InterfaceOne.show(); //calls the static method
    }
}