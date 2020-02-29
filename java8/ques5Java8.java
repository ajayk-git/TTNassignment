// Q.5implement following functional interfaces from java.util.function using lambdas:
// (1) Consumer
// (2) Supplier
// (3) Predicate
// (4) Function


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ques5Java8 {
    public static void main(String[] args) {

        //Consumer
        Consumer<Integer> consumer = (a)->{
            System.out.println(a);
        };

        consumer.accept(2);

        //Producer

        Supplier<Integer> supplier=()->{
            return 2;
        };

        System.out.println(supplier.get());

        //Predicate

        Predicate<String> predicate = (e)-> e.endsWith("ing");
        System.out.println("predicate test on going: "+predicate.test("going"));
        System.out.println("predicate test on gone: "+predicate.test("gone"));

        //Function

        Function<Integer,Integer> function = (e1)->{
            return e1*7;
        };
        System.out.println(function.apply(8));
    }
}