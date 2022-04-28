package D_Java8.EpamAssignment.HM1;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpSortingComparatorInterface {

    public static List<Employees> sortList(List<Employees> employees){
        employees.sort((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        return employees;
    }


    public static void main(String[] args) {

        List<Employees> list = Arrays.asList(
                new Employees("vishu3", "chauhan3", 2533, "testing5"),
                new Employees("vishu4", "tchauhan4", 2534, "testing6"),
                new Employees("vishu5", "bchauhan5", 5253, "testing9"),
                new Employees("vishu1", "chauhan1", 1253, "testing1"),
                new Employees("vishu2", "kchauhan2", 2253, "testing4")
        );

//Use Comparator interface to sort given list of Employees in the alphabetic order of their name

        Collections.sort(list, (o1,  o2)->o1.getFirstName().compareTo(o2.getFirstName()));
        list.forEach((i)-> System.out.println(i));

        sortList(list);
        list.forEach((i)-> System.out.println(i));
    }
}

 class Employees{

    String FirstName;
    String LastName;
    int EmpId;
    String Department;


    public Employees(String FirstName,String LastName,int EmpId,String Department){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.EmpId = EmpId;
        this.Department = Department;
    }

    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String firstName){
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", EmpId=" + EmpId +
                ", Department='" + Department + '\'' +
                '}';
    }
}