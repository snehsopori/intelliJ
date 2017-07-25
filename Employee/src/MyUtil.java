import java.util.List;

/**
 * Created by soporis on 7/19/2017.
 */
public class MyUtil {

    public static List<Object> sort(List<Object> array, Compare comp) {
        for (int i = 0; i < (array.size() - 1); i++) {
            for (int j = 0; j < (array.size() - i - 1); j++) {
                if(comp.isGreaterThan(array.get(j), array.get(j+1))) {
                    Object swap = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, swap);
                }
            }
        }
        return array;
    }
}