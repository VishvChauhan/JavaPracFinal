package D_Java8.StreamJ8;

import java.util.*;
import java.util.stream.Collectors;

public class NaveenAutoJava8StreamQuestions {


    public static void main(String[] args) {

        //Java Stream :-Sum of Number
        List<Integer> list = Arrays.asList(1, 2, 2, 4, 5, 5, 74, 8, 4, 2);
        System.out.println(list.size());
        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
        System.out.println(sum.get());

//Java Stream :-Print Average of All number.

        List<Integer> listB = Arrays.asList(2, 4, 5, 5, 74, 8, 4, 2);
        double avg = listB.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(avg);

        //Java Stream :-NumberSquareAverage.
        double avg1 = listB.stream()
                .map(e -> e * e)
                .filter(e -> e > 100)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println(avg1);

//Java Stream :-Odd and Even


        List<Integer> ListC = Arrays.asList(9, 92, 5, 3, 5, 5, 4, 1, 225, 1);

        List<Integer> EvenNum = ListC.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(EvenNum);

        List<Integer> OddNum = ListC.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

        System.out.println(OddNum);

//Java Stream :-Number Start With

        List<Integer> NumstartWith = ListC.stream().map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2"))
                .map(Integer::valueOf).collect(Collectors.toList());

        System.out.println(NumstartWith);

//Java Stream :-Duplicate Numbers

        List<Integer> DuplicateVal = ListC.stream()
                .filter(e -> Collections.frequency(ListC, e) > 1)
                .collect(Collectors.toList());
        System.out.println(DuplicateVal);

        // using set
        Set<Integer> dupset = new HashSet<>();
        Set<Integer> dup1 = ListC.stream().filter(e -> !dupset.add(e)).collect(Collectors.toSet());
        System.out.println(dup1);

//Java Stream :-Max and Min Num

        int minNum = ListC.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(minNum);

        int maxNum = ListC.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(maxNum);

//Java Stream :-Sort Number


        List<Integer> sortAsc = ListC.stream().sorted().collect(Collectors.toList());
        System.out.println(sortAsc);

        List<Integer> sortDesc = ListC.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortDesc);

        //Java Stream :-Limit Number
        //Limit
        List<Integer> l = ListC.stream().limit(5).collect(Collectors.toList());
        System.out.println(l);

        int sumN = ListC.stream().limit(5).reduce((a, b) -> a + b).get();
        System.out.println(sumN);

        //skip4
        List<Integer> sk = ListC.stream().skip(5).collect(Collectors.toList());
        System.out.println(sk);

        int sumSK = ListC.stream().skip(5).reduce((a, b) -> a + b).get();
        System.out.println(sumSK);

//Java Stream :- Second lowest and Highest Number

        int secH = ListC.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();

        int secL = ListC.stream().sorted().limit(2).skip(1).findFirst().get();
        System.out.println(secL + "  " + secH);
    }
}