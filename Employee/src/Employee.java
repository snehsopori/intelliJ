import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by soporis on 7/18/2017.
 */

enum Location {
    Pune, Hyderabad
}
public class Employee {
    private String name;
    private String lastName;
    private String firstName;
    private int empId;
    private int age;
    private int deptId;
    private Date dob;
    private Date doj;
    Location location;

    public Employee(String name, int empId, int age, int deptId, Date dob, Date doj, Location location) {
        this.name = name;
        this.empId = empId;
        this.age = age;
        this.deptId = deptId;
        this.dob = dob;
        this.doj = doj;
        this.location = location;
    }

    public Employee(String firstName, String lastName) {
        this.name = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public Date getDob() {
        return dob;
    }

    public Date getDoj() {
        return doj;
    }

    public int getDeptId() {
        return deptId;
    }

    public Location getLocation() {
        return location;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public String toString() {
        return "{" + name + '\'' +
                ", Id=" + empId +
                ", age=" + age +
                ", dId=" + deptId +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", dob=" + df.format(dob) +
//                '}';
//    }
}
