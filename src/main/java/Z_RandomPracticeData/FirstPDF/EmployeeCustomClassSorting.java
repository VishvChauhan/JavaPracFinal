package Z_RandomPracticeData.FirstPDF;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeCustomClassSorting {

    int sno;
    String name;

    public EmployeeCustomClassSorting(int sno){};

    public EmployeeCustomClassSorting(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                '}';
    }

    public  void test(){
        System.out.println("hello");
    };
    public  void test1(){
        System.out.println("hello2");
    };


}

class Test{
    public static void main(String[] args) {
        ArrayList<EmployeeCustomClassSorting> arrayList = new ArrayList();
     /*   arrayList.add(new EmployeeCustomClassSorting(101, "Chauhan1"));
        arrayList.add(new EmployeeCustomClassSorting(101, "Chauhan2"));
        arrayList.add(new EmployeeCustomClassSorting(991, "Chauhan3"));
        arrayList.add(new EmployeeCustomClassSorting(99, "Chauhan4"));
        arrayList.add(new EmployeeCustomClassSorting(10, "Chauhan5"));
*/
        System.out.println(" " + arrayList);
        Collections.sort(arrayList, (e1, e2) -> {
            if(e1.sno < e2.sno){return +1;}
            else if (e1.sno > e2.sno){return -1;}
            else {return 0;}
        });
        System.out.println(" " + arrayList);
    }
}