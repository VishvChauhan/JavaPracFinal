package C_Collections.List.ArrayList;

import java.util.*;

/*
    * Java ArrayList class can contain duplicate elements.
    * Java ArrayList class maintains insertion order.
    * Java ArrayList class is non synchronized.
    * Java ArrayList allows random access because the array works on an index basis.
    * In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed
    from the array list.
    * We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases.
    For example:
    * ArrayList<int> al = ArrayList<int>(); // does not work
    * ArrayList<Integer> al = new ArrayList<Integer>(); // works fine
    *
    *
*/



public class ListTestA {

     //ArrayList Interview Questions and Answers
        // 1. removing duplicate from ArrayList
            public static Set<Integer> remDupFromAL(ArrayList<Integer> arr){
                Set<Integer> swet = new HashSet<>();
                swet.addAll((arr));
                return swet;
            }

        // 2. Reverse ArrayList in Java


    public static void  revArrList (List<Object> arr){
       // Collections.reverse();


    }


    public static void main(String[] args) {
        //ArrayList Interview Questions and Answers
        ArrayList<Integer> primes = new ArrayList<>();
                primes.add(2);
                primes.add(3);
                primes.add(3);
                primes.add(7);  //duplicate
                primes.add(7);
                primes.add(11);
               Set<Integer> out = remDupFromAL(primes);
                System.out.println(out);

        // 2. Reverse ArrayList in Java


/*

        List<Object> listA = new ArrayList<>() ;
        listA.add(1);
        List<Object> listB = Arrays.asList(5, 1, 2, 5, 3, 'n', 4, 5, 6);


//        //singletonList
//        List<List<Object>> listC = Collections.singletonList(new ArrayList<Object>());
//
//        listC.addAll(Collections.singleton(listA));
//        // For Loop
//        for( int i=0;i< listC.size();i++){
//            System.out.println( listC.get(i));
//        }

        System.out.println(listB.size());
        System.out.println(listB.get(3));
        System.out.println(listB.contains(2));
        System.out.println(listB.indexOf('n'));
        System.out.println(listB.contains(listA));
        System.out.println(listB.equals(listA));
        System.out.println(listB.hashCode());
        System.out.println(listB.set(3,"Hello"));
        System.out.println(listB);

        // For Loop
        for( int i=0;i< listB.size();i++){
            System.out.println( listB.get(i));
        }
        // For Each
        for(Object e : listB){
            System.out.println(e);
        }
        // iterator
        Iterator it = listB.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
*/






    }

}
