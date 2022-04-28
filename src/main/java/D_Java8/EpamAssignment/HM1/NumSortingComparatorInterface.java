package D_Java8.EpamAssignment.HM1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumSortingComparatorInterface {

    public static List<Integer> sortList(List<Integer> integers){
        integers.sort((o1, o2) -> {
            if(o1<o2) return +1;
            if(o1>o2) return -1;
            return 0;
        });
        return integers;
    }


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList( 12,53,8,7,59,68,45,9);

        Collections.sort(list, (e1,e2)->{
            if(e1<e2) return +1;
            if(e1>e2) return -1;
            return 0;
        });

        list.forEach(System.out::println);
        System.out.println("=============");
        sortList(list);
        list.forEach(System.out::println);

    }
}