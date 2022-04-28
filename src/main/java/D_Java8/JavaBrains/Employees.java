package D_Java8.JavaBrains;

public class Employees {

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
