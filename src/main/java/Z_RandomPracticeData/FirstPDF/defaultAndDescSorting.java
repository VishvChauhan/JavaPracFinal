package Z_RandomPracticeData.FirstPDF;

import java.util.*;

public class defaultAndDescSorting {


    public static void main(String[] args) {

       // Normal Sorting Elements of Map.(By default)
        TreeMap<Integer, String> tm1 = new TreeMap<>();
        tm1.put(101, "Hello1");
        tm1.put(10, "Hello2");
        tm1.put(1023, "Hello3");
        tm1.put(99, "Hello4");
        tm1.put(85, "Hello5");
        tm1.put(86, "Hello6");

        System.out.println(tm1);


    //Sorting Elements of Map with Lambda Expression.
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> {
            if (o1 < o2) {
                return +1;
            } else if (o1 > o2) {
                return -1;
            } else {
                return 0;
            }
        });
        tm.put(101, "Hello1");
        tm.put(10, "Hello2");
        tm.put(1023, "Hello3");
        tm.put(99, "Hello4");
        tm.put(85, "Hello5");
        tm.put(86, "Hello6");

        System.out.println(tm);












/*
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(0);
        arrayList.add(15);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(7);
        System.out.println(arrayList);


        // Sorting in asc order - Normally
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // Sorting in desc order without lambda
                Collections.sort(arrayList, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if (o1 < o2) {
                            return +1;
                        } else if (o1 > o2) {
                            return -1;
                        } else {
                            return 0;
                        }
                        }
                     });
                System.out.println(arrayList);


            // Sorting in desc order with lambda
                Collections.sort(arrayList, (o1, o2) -> {
                    if (o1 < o2) {
                        return +1;
                    } else if (o1 > o2) {
                        return -1;
                    } else {
                        return 0;
                    }
                    });
                    System.out.println(arrayList);*/
    }
}