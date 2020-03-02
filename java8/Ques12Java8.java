//Q12.Find the first even number in the integer list which is greater than 3.

import java.util.Arrays;
import java.util.List;

public class Ques12Java8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,7,8,9,10);
        System.out.println(
                list.
                        stream()
                        .filter(e->e>3)
                        .filter(e->e%2==0)
                        .findFirst().get()


        );


    }
}