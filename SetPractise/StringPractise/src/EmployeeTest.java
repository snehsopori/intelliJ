import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
    @Test
    public void employee() {
        List<Employee> list = createData();
        Collections.sort(list, new SortingClass());
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    public List<Employee> createData() {
        List<Employee> employee = Arrays.asList(new Employee("Ramesh", "Sharma", "RnD", 10, "Pune"),
                new Employee("Ramesh", "Raina", "RnD", 12, "Pune"),
                new Employee("Suresh", "Sharma", "RnD", 14, "Pune"),
                new Employee("Suresh", "Verma", "RnD", 15, "Pune"),
                new Employee("Ramesh", "Sharma", "RnD", 16, "Pune"),
                new Employee("Suresh", "Gupta", "RnD", 17, "Pune"),
                new Employee("Ramesh", "Gupta", "RnD", 18, "Pune"),
                new Employee("Harsh", "Agarwal", "RnD", 20, "Pune"),
                new Employee("Harshit", "Agarwal", "HR", 30, "Pune"),
                new Employee("Mahesh", "Naik", "HR", 40, "Pune"),
                new Employee("Arijit", "Singh", "HR", 50, "Pune"),
                new Employee("Amir", "Khan", "HR", 35, "Pune"),
                new Employee("Kunal", "Khan", "Finance", 23, "Pune"),
                new Employee("Kunal", "Singh", "Finance", 42, "Pune"),
                new Employee("Anmol", "Gupta", "Finance", 28, "Pune"),
                new Employee("Kunal", "Tyagi", "Finance", 33, "Pune"),
                new Employee("Harish", "Chaterjee", "HR", 31, "Pune"),
                new Employee("Yash", "Shah", "HR", 26, "Pune"),
                new Employee("Shubham", "Chauhan", "RnD", 34, "Pune"),
                new Employee("Shubam", "Rathore", "RnD", 32, "Pune"),
                new Employee("Ramesh", "Sharma", "RnD", 48, "Hyderabad"),
                new Employee("Suresh", "Gupta", "HR", 51, "Hyderabad"),
                new Employee("Yash", "Sharma", "Finance", 52, "Hyderabad"),
                new Employee("Anmol", "Sharma", "Finance", 54, "Hyderabad"));
        return employee;
    }
}
