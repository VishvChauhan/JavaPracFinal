package D_Java8.EpamTrainings;

import D_Java8.JavaBrains.Employees;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {

public static void testP(Predicate<Integer> predicate, int[] number){
    for(Integer i :number){
        if(predicate.test(i)){
            System.out.println(i);
        }
    }
}


    public static void main(String[] args) {


        Predicate<String>stringPredicate = Predicate.isEqual("test");
        System.out.println(stringPredicate.test("test"));
        System.out.println("------");
        Predicate<String> pre0 = str -> str.length()>3;
        System.out.println(pre0.test("hello"));
        System.out.println(pre0.test("hel"));

        System.out.println("------");
        int [] num = {1,2,5,7,8,9,10,22,85};
        Predicate<Integer> pre1 = i -> i>10;
        Predicate<Integer> pre2 = i -> i%2 ==0;

        System.out.println(pre2.test(201));
        System.out.println(pre1.test(100));
        System.out.println("------");
            testP(pre1.and(pre2), num);
        System.out.println("------");
            testP(pre2.negate(),num);



//Where to use:- While working with stream and wants to filter.

        List<Employees> listPred = Arrays.asList(
                new Employees("vishu3","chauhan3",2533,"testing5"),
                new Employees("vishu4","tchauhan4",2534,"testing6"),
                new Employees("vishu5","bchauhan5",5253,"testing9"),
                new Employees("vishu1","chauhan1",1253,"testing1"),
                new Employees("vishu2","kchauhan2",2253,"testing4")
        );

        System.out.println(listPred.stream().filter(employees -> employees.getFirstName().equals("vishu3")).collect(Collectors.toList()));


        List<String> arrayList = Arrays.asList("tom", "bob", "hello");
        List<String> list = arrayList.stream().filter(st -> st.startsWith("b")).collect(Collectors.toList());
        System.out.println(list);

    }
}
