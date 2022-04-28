package D_Java8.JavaBrains;


import java.util.*;


public class EmployeeTestWithoutLambda {
    public static void main(String[] args) {

        List<Employees> list = Arrays.asList(
                new Employees("vishu3","chauhan3",2533,"testing5"),
                new Employees("vishu4","tchauhan4",2534,"testing6"),
                new Employees("vishu5","bchauhan5",5253,"testing9"),
                new Employees("vishu1","chauhan1",1253,"testing1"),
                new Employees("vishu2","kchauhan2",2253,"testing4")
        );



// Normal Expression - Java 1-7:-

   //Print List.
        System.out.println("============Print List=============================");
           for(Employees e : list){
               System.out.println(e);
           }
    // forEach
        list.forEach(System.out::println);

        System.out.println("============Sort list with LastName.=============================");

    // Sort list with LastName.
            Collections.sort(list, new Comparator<Employees>() {
                @Override
                public int compare(Employees o1, Employees o2) {
                    return o1.LastName.compareTo(o2.LastName);
                }
            });

        System.out.println("===============Print Sorted list with LastName.==========================");

        //Print Sorted list with LastName.
            for(Employees e : list){
                System.out.println(e);
            }

        System.out.println("===================Print Sorted list with LastName starts with c======================");

        //Print Sorted list with LastName starts with c;
            for(Employees e1 : list){
                if(e1.LastName.substring(0,1).equals("c")){
                  //  System.out.println(e1.getFirstName());
                    System.out.println(e1);
                }
            }

        System.out.println("=========================================");

        for(Employees e2 : list){
                if(e2.LastName.startsWith("c")){
                   // System.out.println(e1.getFirstName());
                    System.out.println(e2);
                }
            }


        System.out.println("=================Print Sorted list with LastName starts with c including behaviour========================");
        printConditonally(list, new Conditions() {
            @Override
            public boolean test(Employees e) {
                return e.getLastName().startsWith("c");
            }
        });

    }

    private static void printConditonally(List <Employees> employee, Conditions conditions ){
        for(Employees e3 : employee){
            if(conditions.test(e3))
            {
                System.out.println(e3);
            }
        }
    }

}

interface Conditions{
    boolean test(Employees e);
}
