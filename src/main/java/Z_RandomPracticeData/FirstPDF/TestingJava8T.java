package Z_RandomPracticeData.FirstPDF;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestingJava8T {

    public static List<String>  filterA(List<String> list, Predicate<String> predicate){
        for(String s : list){
            if(predicate.test(s)){
                System.out.println(s);
            }
        }
        return list;
    }

    public static List<String>  filter(List<String> list, Predicate<String> predicate){
       return list.stream().filter(predicate::test).collect(Collectors.toList());
    }




    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Predicate in filter()
        //A:->
        List<Integer> collect =   list.stream().filter(x->x>5).collect(Collectors.toList());
        System.out.println(collect);

        //B:->
        Predicate<Integer> predicate = x->x>5;
        System.out.println( list.stream().filter(predicate).collect(Collectors.toList()));


        //Predicate.and()
        Predicate<Integer> predicate1 = x-> x>2;
        Predicate<Integer> predicate2 = x->x<8;
        System.out.println(list.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList()));
        System.out.println(list.stream().filter(x-> x>2&&x<8).collect(Collectors.toList()));

        //Predicate.or()
        System.out.println(list.stream().filter(x-> x>2||x<8).collect(Collectors.toList()));
        System.out.println(list.stream().filter(predicate1.or(predicate2)).collect(Collectors.toList()));

        //Predicate.negate()
        System.out.println(list.stream().filter(predicate1.negate()).collect(Collectors.toList()));


        //Predicate.test() in function
        List<String> listS = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBBB");

        System.out.println(filter(listS,s->s.startsWith("A")));
        List<String> output = filter(listS,s->s.length()>3);
        System.out.println(output);

        //Predicate Chaining
        Predicate<String> predicate3 = s-> s.startsWith("a");
        System.out.println(predicate3.or(x->x.endsWith("b")).test("test"));
        System.out.println(predicate3.and(x->x.length()>2).test("attt"));

        //Predicate in Object



    }
}
