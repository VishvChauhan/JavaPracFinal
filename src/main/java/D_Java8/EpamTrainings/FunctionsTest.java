package D_Java8.EpamTrainings;

import java.util.Locale;
import java.util.function.Function;

public class FunctionsTest {


    public static void main(String[] args) {
        Function<String, Integer> function = s -> s.length();
        System.out.println(function.apply("hello"));
        Function<String, String> function1 = s -> s.substring(1,5);
        Function<String, String> function2 = s -> s.toUpperCase();


        System.out.println(function2.andThen(function1).apply("vishvendra"));




    }
}
