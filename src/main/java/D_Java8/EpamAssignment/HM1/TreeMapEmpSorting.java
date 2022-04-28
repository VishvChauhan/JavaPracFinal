package D_Java8.EpamAssignment.HM1;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeMapEmpSorting {
    public SortedSet<Map.Entry<Integer, Employees>> lamdaEntriesSortedByEmpValues
            (Map<Integer, Employees> map) {

        SortedSet<Map.Entry<Integer, Employees>> sortedEntries = new TreeSet<Map.Entry<Integer, Employees>>(
                (e1, e2) -> {
                    return e1.getValue().getFirstName().compareTo(e2.getValue().getFirstName());
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }


}
