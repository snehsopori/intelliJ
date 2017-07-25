/**
 * Created by soporis on 7/19/2017.
 */
public class CompareDob implements Compare {
    public boolean isGreaterThan(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        if (e1.getDob().after(e2.getDob())) {
            return true;
        } else {
            return false;
        }
    }
}
