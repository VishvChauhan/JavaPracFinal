package C_Collections.Map.HashAndLinkedMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class PrintingMapKeysAndValues {


    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        // 1. Using an iterator
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 2. For-each loop
        for (Integer key: map.keySet()) {
            System.out.println(key);
        }

        // 3. Java 8 – Collection.iterator() + Iterator.forEachRemaining()
        map.keySet().iterator()
                .forEachRemaining(System.out::println);

        // 4. Java 8 – Collection.stream() + Stream.forEach()
        map.keySet().stream()
                .forEach(System.out::println);

        // Java 8 – Stream.of() + Collection.toArray() + Stream.forEach()
        Stream.of(map.keySet().toArray())
                .forEach(System.out::println);

        // 5. Convert to a string
        System.out.println(map.keySet().toString());

        // Java 8
        Stream.of(map.keySet().toString())
                .forEach(System.out::println);

//<<===================================================================>>

        // 1. Using an iterator
        Iterator<String> itr1 = map.values().iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        // 2. For-each loop
        for (String key: map.values()) {
            System.out.println(key);
        }

        // 3. Java 8 – Collection.iterator() + Iterator.forEachRemaining()
        map.values().iterator()
                .forEachRemaining(System.out::println);

        // 4. Java 8 – Collection.stream() + Stream.forEach()
        map.values().stream()
                .forEach(System.out::println);

        // Java 8 – Stream.of() + Collection.toArray() + Stream.forEach()
        Stream.of(map.values().toArray())
                .forEach(System.out::println);

        // 5. Convert to a string
        System.out.println(map.values().toString());

        // Java 8
        Stream.of(map.values().toString())
                .forEach(System.out::println);

    }

}
