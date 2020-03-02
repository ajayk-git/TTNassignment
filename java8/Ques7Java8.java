//7.Override the default method of the interface.

interface override{
    default void overriding(){
        System.out.println("Hello, Welcome to Terminal");
    }
}
public class Ques7Java8 implements override{
    @Override
    public void overriding(){
        System.out.println("Hello, Welcome to TTN");
    }
    public static void main(String[] args) {
        Ques7Java8 obj=new Ques7Java8();
        obj.overriding();


    }

}