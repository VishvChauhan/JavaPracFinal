package D_Java8.EpamAssignment.HM1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetNumSorting {

    public static Set<Integer> sortNumTreeSet(Set<Integer> treeSet){
        TreeSet<Integer> newTreeSet = new TreeSet<Integer>((o1, o2) -> o1 < o2 ? 2 : -1);

        newTreeSet.addAll(treeSet);
        return newTreeSet;
    }

    public static void main(String[] args) {
        Set<Integer> integerSet1 = new TreeSet<Integer>(Arrays.asList(5, 4, 3, 6, 2));
        sortNumTreeSet(integerSet1);

        integerSet1.forEach(System.out::println);
    }
}
