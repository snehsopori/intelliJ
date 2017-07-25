import java.util.Comparator;

public class SortingClass implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int v = o1.getLocation().compareTo(o2.getLocation());
        if (v != 0) {
            return v;
        }
        v = o1.getDeptName().compareTo(o2.getDeptName());
        if (v != 0) {
            return v;
        }
        v = o1.getfName().compareTo(o2.getfName());
        if (v != 0) {
            return v;
        }
        v = o1.getlName().compareTo(o2.getlName());
        if (v != 0) {
            return v;
        }
        v = o1.getEmpId() - o2.getEmpId();
        return v;
    }
}