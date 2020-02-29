/*Write the following a functional interface and implement it using lambda:
        (1) First number is greater than second number or not         Parameter (int ,int ) Return boolean
        (2) Increment the number by 1 and return incremented value    Parameter (int) Return int
        (3) Concatination of 2 string                                 Parameter (String , String ) Return (String)
        (4) Convert a string to uppercase and return .                Parameter (String) Return (String) */



@FunctionalInterface
interface Great{
    boolean greaterNumber(int a, int b);
}

@FunctionalInterface
interface Increment
{
    int incrementedValue(int a);
}

@FunctionalInterface
interface Concatenated{
    String concatenatedStrings(String s1 , String s2);
}

@FunctionalInterface
interface Stringupper{
    String toUpperString(String str);

}
public class ques1Java8 {
    public static void main(String[] args) {

        //Ans 1(a)

        Great great = (a,b)->{
            return a>b;
        };
        System.out.println(great.greaterNumber(3,5));

        //Ans 1(b)

        Increment increment = (a)->
        {return a+1;};
        System.out.println(increment.incrementedValue(5));

        //Ans1(c)

        Concatenated concatenated = (str1,str2)->{
            return str1+str2;
        };
        System.out.println(concatenated.concatenatedStrings("Ajay","Kumar"));

        //Ans 1(d)

        Stringupper stringupper = (str1)->{
            return str1.toUpperCase();
        };
        System.out.println(stringupper.toUpperString("ajay kumar"));


    }
}