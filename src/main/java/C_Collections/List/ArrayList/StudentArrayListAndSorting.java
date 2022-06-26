package C_Collections.List.ArrayList;

import java.util.*;

public class StudentArrayListAndSorting {

    private String FirstName;
    private String Lastname;
    private int Age;
    private int rollNumber;


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


    public String getFirstName() {
        return FirstName;
    }

    public StudentArrayListAndSorting(String FirstName, String Lastname, int Age, int rollNumber){

            this.FirstName = FirstName;
            this.Lastname = Lastname;
            this.Age = Age;
            this.rollNumber = rollNumber;
        }

        public static void main(String []args){
            StudentArrayListAndSorting student1 = new StudentArrayListAndSorting("Vishu2", "Chauhan7", 21, 12845);
            StudentArrayListAndSorting student2 = new StudentArrayListAndSorting("Vishu1", "Chauhan11", 2141, 124581);
            StudentArrayListAndSorting student3 = new StudentArrayListAndSorting("Vishu9", "Chauhan18", 2111, 182451);
            StudentArrayListAndSorting student4 = new StudentArrayListAndSorting("Vishu20", "Chauhan91", 2511, 124851);
            StudentArrayListAndSorting student5 = new StudentArrayListAndSorting("Vishu5", "Chauhan19", 2171, 812451);

            List<StudentArrayListAndSorting> list = Arrays.asList(student1,  student2, student3, student4, student5);
            Collections.sort(list, Comparator.comparing(StudentArrayListAndSorting::getFirstName));
           // Collections.sort(list, );

             for(StudentArrayListAndSorting o : list){
                        System.out.println(o.getFirstName() + " " + o.getLastname() + " " + o.getAge() + " " + o.getRollNumber());
                    }
        }
}
