package D_Java8.JavaBrains;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleTest {
    public static void main(String[] args) {

        List<Employees> list = Arrays.asList(
                new Employees("vishu3", "chauhan3", 2533, "testing5"),
                new Employees("vishu4", "tchauhan4", 2534, "testing6"),
                new Employees("vishu5", "bchauhan5", 5253, "testing9"),
                new Employees("vishu1", "chauhan1", 1253, "testing1"),
                new Employees("vishu2", "kchauhan2", 2253, "testing4")
        );


      List<Employees> listA = list.parallelStream()
                .filter(employees -> employees.getLastName().startsWith("c"))
               .collect(Collectors.toList());


    }
}