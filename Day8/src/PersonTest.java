import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PersonTest {
    @Test
    public void testIDSort(){
        //Comparator<Employee> compareids = new IDComparator();
        List<Person> person = createNameTestData();
        displayCount(person);
    }

    public void displayCount(List<Person> person) {
        HashMap<String, Integer> hash = new HashMap<>();
        int i = 0;
        while (i < person.size()) {
            if (hash.containsKey(person.get(i).getName())) {
                hash.put(person.get(i).getName(), hash.get(person.get(i).getName()) + 1);
            } else {
                hash.put(person.get(i).getName(), 1);
            }
            i++;
        }
        for (String key : hash.keySet()) {
            System.out.println(key + " : " + hash.get(key));
        }
    }


    public static List<Person> createNameTestData() {
        Person p1 = new Person("Rajesh", Gender.M);
        Person p2 = new Person("Ritesh", Gender.M);
        Person p3 = new Person("Arti", Gender.F);
        Person p4 = new Person("Arti", Gender.M);
        Person p5 = new Person("Ritesh", Gender.F);
        Person p6 = new Person("Ritesh", Gender.M);

        List name = new ArrayList();
        name.add(p1);
        name.add(p2);
        name.add(p3);
        name.add(p4);
        name.add(p5);
        name.add(p6);

        return name;
    }
}
