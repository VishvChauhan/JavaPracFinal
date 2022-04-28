package C_Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting implements Comparable {

    private String studentname;
    private int rollno;
    private int studentage;

    public ArrayListSorting(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

   /* public static Comparator<ArrayListSorting> StuNameComparator = new Comparator<ArrayListSorting>() {
        public int compare(ArrayListSorting s1, ArrayListSorting s2) {
            String StudentName1 = s1.getStudentname().toUpperCase();
            String StudentName2 = s2.getStudentname().toUpperCase();

            //ascending order
            return StudentName1.compareTo(StudentName2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }};*/



    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

    @Override
    public int compareTo(Object comparestu) {
        int compareage = ((ArrayListSorting) comparestu).getRollno();
        /* For Ascending order*/
        return this.studentage - compareage;
    }
}


class testingSort {
    public static void main(String[] args) {


        List<ArrayListSorting> arraylist = new ArrayList<ArrayListSorting>();
        arraylist.add(new ArrayListSorting(223, "Chaitanya", 26));
        arraylist.add(new ArrayListSorting(245, "Rahul", 24));
        arraylist.add(new ArrayListSorting(209, "Ajeet", 32));

        //Collections.sort(arraylist, ArrayListSorting.StuNameComparator);
        Collections.sort(arraylist);
        for (ArrayListSorting str : arraylist) {
            System.out.println(str);
        }

    }
}

