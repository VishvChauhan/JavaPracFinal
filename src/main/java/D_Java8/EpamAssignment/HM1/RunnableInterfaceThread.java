package D_Java8.EpamAssignment.HM1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunnableInterfaceThread {

    public static void main(String[] args) {

// Normal Implementation
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
        thread.run();

//Use Runnable interface to start a new thread and print numbers from
        List<Integer> list = Arrays.asList(1,2,4,5,78,6);
        Thread thread1 = new Thread(()-> {
           List listT = list.stream().sorted().collect(Collectors.toList());
            System.out.println(listT);
        });
        thread1.run();


    }
}
