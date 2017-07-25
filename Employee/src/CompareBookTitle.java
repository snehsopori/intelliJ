/**
 * Created by soporis on 7/19/2017.
 */
public class CompareBookTitle implements Compare {
    @Override
    public boolean isGreaterThan(Object o1, Object o2) {
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;
        int val = b1.getAuthor().compareTo(b2.getAuthor());

        if(val <= 0) {
            return false;
        } else {
            return true;
        }

    }
}
