//Create a functional interface whose method takes 2 integers and return one integer.

import java.util.function.BiFunction;

public class ques2Java8 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (e1, e2)-> e1+e2;
        System.out.println(biFunction.apply(4,9));

    }
}