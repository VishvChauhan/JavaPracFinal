package A_AssessmentTest;

import java.util.*;
import java.util.stream.Collectors;

public class mapComparision {




    public static void main(String[] args) {
        // New HashMap1
        HashMap<Integer, String> map1 = new HashMap<>();

        // Add Entry to map
        map1.put(1, "Akshay");
        map1.put(2, "Bina");
        map1.put(3, "Chintu");

        // New HashMap2
        HashMap<Integer, String> map2 = new HashMap<>();

        // Add Entry to map
        map2.put(3, "Chintu");
        map2.put(2, "Bina2");
        map2.put(1, "Akshay2");

        // New HashMap3
        HashMap<Integer, String> map3 = new HashMap<>();

        // Add Entry to map
        map3.put(1, "Akshay");
        map3.put(2, "Binod");
        map3.put(3, "Chintu");

        HashSet<String> hset = new HashSet<>(map1.values());
        HashSet<String> hset2 = new HashSet<>(map2.values());


        // Compare map1 and map2
        System.out.println("map1 == map2 : "
                + map1.equals(map2));

        // Compare map1 and map3
        System.out.println("map1 == map3 : "
                + hset.equals(hset2));


    }


}
