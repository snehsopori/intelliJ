/**
 * Created by soporis on 7/19/2017.
 */
public class CompareEmpId implements Compare {
    public boolean isGreaterThan(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        if (e1.getEmpId() > e2.getEmpId()) {
            return true;
        } else {
            return false;
        }
    }
}
