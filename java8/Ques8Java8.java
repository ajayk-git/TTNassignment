// Implement multiple inheritance with default method inside  interface.

interface Interface1{
    default void show(){
        System.out.println("In Interface1");
    }
}
interface Interface2{
    default void show(){
        System.out.println("In Interface2");
    }
}

public class Ques8Java8 implements Interface1, Interface2{
    @Override
    public void show(){
        Interface1.super.show();
        Interface2.super.show();
    }

    public static void main(String[] args) {
        Ques8Java8 obj=new Ques8Java8();
        obj.show();
    }
}