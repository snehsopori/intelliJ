import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by soporis on 7/18/2017.
 */
public class EmployeeTest {
//    public static void main(String[] args) {
//        List<Employee> list = createTestData();
//        Compare comp = new CompareName();
//        MyUtil.sort(list, comp);
//        for(Employee val : list) {
//            System.out.println(val);
//        }
//        System.out.println("***************************************************************************************************");
//        Compare comp2 = new CompareDob();
//        MyUtil.sort(list, comp2);
//        for(Employee val : list) {
//            System.out.println(val);
//        }
////        Arrays.sort();
//    }

    @Test
    public void java8Sort(){
        List<Employee> employees = createTestData();

        List<Employee> result = employees.stream()
                .sorted(comparing(Employee::getEmpId).reversed())
                .collect(toList());

        for(Employee emp : result) {
            System.out.println(emp);
        }

    }

    @Test
    public void testIDSort(){
        //Comparator<Employee> compareids = new IDComparator();
        List<Employee> employees = createTestData();
        Collections.sort(employees, new IntComparator(new IdExtractor()));
        for(Employee emp : employees) {
            System.out.println(emp);
        }
    }

    @Test
    public void testAgeSort(){
        //Comparator<Employee> compareids = new IDComparator();
        List<Employee> employees = createTestData();
        Collections.sort(employees, new AgeComparator());
        for(Employee emp : employees) {
            System.out.println(emp);
        }
    }

    @Test
    public void testDeptIdSort(){
        //Comparator<Employee> compareids = new IDComparator();
        List<Employee> employees = createTestData();
        Collections.sort(employees, new DeptIdComparator());
        for(Employee emp : employees) {
            System.out.println(emp);
        }
    }

    interface IntExtractor {
        public int extractInt(Employee e);
    }

    class IdExtractor implements IntExtractor {
        @Override
        public int extractInt(Employee e) {
            return e.getEmpId();
        }
    }

    class IntComparator implements Comparator<Employee> {
        private IntExtractor ext;
        public IntComparator(IntExtractor ext) {
            this.ext = ext;
        }
        @Override
        public int compare(Employee o1, Employee o2) {
            return ext.extractInt(o1) - ext.extractInt(o2);
        }
    }




    class DeptIdComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            //logic
            return (o1.getDeptId() - o2.getDeptId());
        }
    }
    class AgeComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            //logic
            return (o1.getAge() - o2.getAge());
        }
    }


    public static List<Employee> createTestData() {
        Employee employee1 = new Employee("Ram", 459, 50, 15, new Date(1995-1900, 11-1, 5), new Date(2015, 3, 5), Location.Pune);
        Employee employee2 = new Employee("Sham", 550, 40, 23, new Date(1995-1900, 4-1, 25), new Date(2014, 4, 15), Location.Hyderabad);
        Employee employee3 = new Employee("Bhim", 993, 29, 10, new Date(1994-1900, 9-1, 13), new Date(2013, 7, 25), Location.Pune);
        Employee employee4 = new Employee("Guru", 152, 36, 2, new Date(1996-1900, 9-1, 24), new Date(2012, 2, 4), Location.Hyderabad);
        Employee employee5 = new Employee("Raju", 783, 35, 17, new Date(1995-1900, 2-1, 15), new Date(2016, 10, 24), Location.Pune);

        List list = new ArrayList();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        return list;
    }

    public static List<Employee> createNameTestData() {
        Employee e1 = new Employee("Rajesh", "Agarwal");
        Employee e2 = new Employee("Ritesh", "Sharma");
        Employee e3 = new Employee("Kunal", "Gupta");

        List name = new ArrayList();
        name.add(e1);
        name.add(e2);
        name.add(e3);

        return name;
    }
}