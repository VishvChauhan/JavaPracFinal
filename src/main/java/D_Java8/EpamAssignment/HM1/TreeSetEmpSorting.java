package D_Java8.EpamAssignment.HM1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEmpSorting {
    public static Set<Employees> lamdaSortEmpTreeSet(Set<Employees> employeeSet) {
        Set<Employees> newEmpSet = new TreeSet<>(
                (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())
        );
        newEmpSet.addAll(employeeSet);
        return newEmpSet;
    }

}




