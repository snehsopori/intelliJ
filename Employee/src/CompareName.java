/**
 * Created by soporis on 7/19/2017.
 */
public class CompareName implements Compare{
    public boolean isGreaterThan(Object o1, Object o2) {

        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        int val = e1.getName().compareTo(e2.getName());

        if(val <= 0) {
            return false;
        } else {
            return true;
        }

    }
}
