
//Using (instance) Method reference create and apply add and subtract method and using (Static)
// Method reference create and apply multiplication method for the functional interface created.


@FunctionalInterface
interface Addition{
    int addNumbers(int a, int b);
}

@FunctionalInterface
interface Subtraction{
    int subNumbers(int a, int b);
}

@FunctionalInterface
interface Multiplication{
    int  multiplyNumbers(int a , int b);
}
public class Ques3Java8 {

    public static int numberMultiply(int a , int b){
        return a*b;
    }
    public int numberAdd(int a,int b){
        return a+b;
    }
    public int numberSub(int a,int b){
        return a-b;
    }


    public static void main(String[] args) {
        Ques3Java8 obj1 =new Ques3Java8();
        Addition addition = obj1::numberAdd;
        System.out.println("result of add operation using instance method reference:"+addition.addNumbers(76,101));

        Ques3Java8 obj2 = new Ques3Java8();
        Subtraction subtraction = obj2::numberSub;
        System.out.println("result of subtraction operation using instance method reference:"+subtraction.subNumbers(176,101));




        Multiplication multiplication = Ques3Java8::numberMultiply;
        System.out.println("result of multiply operation using static method reference:"+multiplication.multiplyNumbers(4,5));


    }

}