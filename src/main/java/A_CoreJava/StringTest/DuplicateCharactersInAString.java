package A_CoreJava.StringTest;

import com.sun.istack.internal.NotNull;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCharactersInAString {

//How do you find duplicate characters in a string?
// String = "ababcdfsas";
//[a,3][b,2][c,1][d,1][f,1][s,2]


    public static void duplicatecharacter(String str){
    char[] cA = str.toCharArray();
		for( int i =0; i <cA.length; i ++){
        for ( int j = i+1; j <cA.length;j++){
            if(cA[i] == cA[j]){
                System.out.println(cA[j]);

            }}}
    }

    public static Map<Character, Integer> duplicatecharactersA(@NotNull String string) {
        char[] charArray = string.toCharArray();
        HashMap<Character, Integer> hashArray = new HashMap<Character, Integer>();
        for (Character ch : charArray) {
            if (hashArray.containsKey(ch)) {
                hashArray.put(ch, hashArray.get(ch) + 1);
            } else {
                hashArray.put(ch, 1);
            }
        }
        return hashArray;
    }


    public static void main(String[] args) {

        // Traversing is a problem with map
        // so we use set to do it.

        Map mapA =  duplicatecharactersA("ababcdea");
        Set<Character> setA = mapA.keySet();
        for(Character ch1 : setA){
            System.out.println(ch1 + " " + mapA.get(ch1));
        }


        ArrayList<Integer> cp =  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,83,4,5,6,7,8,93,4,53,4,5,6,7,8,6,7,8,10));

        //LinkedHashSet
        System.out.println(cp);
        LinkedHashSet<Integer> lks = new LinkedHashSet<Integer>(cp);
        System.out.println(lks);
        ArrayList<Integer> ar =  new ArrayList<Integer>(lks);
        System.out.println(ar);

        //JDK

        List<Integer> integers = cp.stream().distinct().collect(Collectors.toList());
        System.out.println(integers);

    }
}
