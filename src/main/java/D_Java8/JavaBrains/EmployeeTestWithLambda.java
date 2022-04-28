package D_Java8.JavaBrains;


import java.util.*;
import  java.util.function.*;

public class EmployeeTestWithLambda {
    public static void main(String[] args) {

        List<Employees> list = Arrays.asList(
                new Employees("vishu3","chauhan3",2533,"testing5"),
                new Employees("vishu4","tchauhan4",2534,"testing6"),
                new Employees("vishu5","bchauhan5",5253,"testing9"),
                new Employees("vishu1","chauhan1",1253,"testing1"),
                new Employees("vishu2","kchauhan2",2253,"testing4")
        );

/*
// Lambda Expression - Java 8 without behaviour:--
        // Step a :- Sort list by last name

                    Collections.sort(list, (o1, o2) -> o1.LastName.compareTo(o2.LastName));

            System.out.println("=========================================");

        // Step b :- Create a method that prints all element in the list
                    list.forEach(employees -> {
                        //System.out.println(employees.getFirstName());
                        System.out.println((employees));
                    });

            System.out.println("=========================================");
        // Step c :- Create a method that print all employees that have name starts with C:

                    list.forEach(employees -> {
                        if(employees.LastName.startsWith("c")){
                        System.out.println(employees);}
                    });

            System.out.println("=========================================");

*/


            System.out.println("=================Lambda Expression - Java 8 including behaviour:--========================");
// Lambda Expression - Java 8 including behaviour:--

        // Step a :- Sort list by last name
                Collections.sort(list, (o1, o2) -> o1.LastName.compareTo(o2.LastName));

        // Step b :- Create a method that prints all element in the list
                System.out.println("=================PrintAll Lambda");
                printConditonallyC(list, p -> true, p-> System.out.println(p));

        // Step c :- Create a method that print all employees that have name starts with C:
                System.out.println("=================Print Conditions Lambda");

                 System.out.println("  =  Conditions  =   ");
                printConditonallyA(list, new Conditions() {
                    @Override
                    public boolean test(Employees e) {
                        return e.getLastName().startsWith("c");
                    }
                });

                System.out.println("  =  Predicate  =   ");
                printConditonallyB(list, p ->  p.getLastName().startsWith("c"));

                 System.out.println("  =  Consumer  =   ");
                printConditonallyC(list, p -> p.getLastName().startsWith("c"),p-> System.out.println(p.getFirstName()));

            }



    private static void printConditonallyA(List <Employees> employee, Conditions conditions ){
        for(Employees e3 : employee){
            if(conditions.test(e3))
            {
                System.out.println(e3);
            }
        }
    }

    // With existing Interfaces - java.utils.function.Predicate
    private static void printConditonallyB(List <Employees> employee, Predicate<Employees> pridicate ){
        for(Employees e3 : employee){
            if(pridicate.test(e3))
            {
                System.out.println(e3);
            }
        }
    }

    // With existing Interfaces - java.utils.function.Predicate
    private static void printConditonallyC(List <Employees> employee, Predicate<Employees> pridicate, Consumer<Employees> consumer ){
        for(Employees e3 : employee){
            if(pridicate.test(e3))
            {
                consumer.accept(e3);
            }
        }
    }


}
