package D_Java8.JavaBrains;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceLambda {


    // With existing Interfaces - java.utils.function.Predicate
    private static void printConditonallyC(List <Employees> employee, Predicate<Employees> pridicate, Consumer<Employees> consumer ){
        for(Employees e3 : employee){
            if(pridicate.test(e3))
            {
                consumer.accept(e3);
            }
        }
    }

        public static void printT(){
            System.out.println("hello 3");
        }

    public static void main(String[] args) {

            List<Employees> list = Arrays.asList(
                    new Employees("vishu3","chauhan3",2533,"testing5"),
                    new Employees("vishu4","tchauhan4",2534,"testing6"),
                    new Employees("vishu5","bchauhan5",5253,"testing9"),
                    new Employees("vishu1","chauhan1",1253,"testing1"),
                    new Employees("vishu2","kchauhan2",2253,"testing4")
            );

            list.forEach(System.out::println); //MethodReferenceLambda
            list.forEach(i-> System.out.println(i));



        System.out.println("  =  Consumer  =   ");
        printConditonallyC(list, p -> p.getLastName().startsWith("c"),System.out::println); //MethodReferenceLambda

        Thread t1 = new Thread ( () -> {System.out.println("hello 2");}); t1.start();
        Thread t2 = new Thread (MethodReferenceLambda::printT);t2.start(); // MethodReferenceLambda

    }

}
