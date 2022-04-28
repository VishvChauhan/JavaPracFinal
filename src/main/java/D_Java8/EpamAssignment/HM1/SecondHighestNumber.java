package D_Java8.EpamAssignment.HM1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber implements SecondHighestNumber10 {

   @Override
   public void getKthHighest(List<Integer> list, int k) {
        Optional<Integer> element = list.stream().sorted(Collections.reverseOrder()).limit(k).skip(k - 1).findFirst();
        if(true) {
            System.out.println(element.get());
        }
    }

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(9, 92, 5, 3, 5, 5, 4, 1, 225, 1);
        SecondHighestNumber sc = new SecondHighestNumber();
        sc.getKthHighest(num,2);

    }
}

