package D_Java8.JavaBrains;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    // Normal Method:-
    public static void process(int[] arr, int key) {
        for (Integer i : arr) {
            try {
                System.out.println(i / key);
            } catch (ArithmeticException e) {
                System.out.println("Exception occur normally");

            }
        }
    }

    //With BiConsumer
    public static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : arr) {
            consumer.accept(i, key);
        }
    }

    //By wrapping lambda with Another Lambda

    public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("AException via wrapperLambda");
            }

        };
    }

        public static void main (String[]args){
            int[] num = {1, 5, 8, 7, 6};
            int key = 0;
// Normal Execution:-
        process(num, key);
// Lambda Execution:-
        process(num, key, (v, k)->{
            try {
                System.out.println(v / k);
            }catch (ArithmeticException e){
                System.out.println("ArithmeticException via Lambda block");}
        });

// By wrapping lambda with Another Execution:-
        process(num, key, wrapperLambda((v, k) -> System.out.println(v / k)));


        }

}