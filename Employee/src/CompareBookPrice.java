/**
 * Created by soporis on 7/19/2017.
 */
public class CompareBookPrice implements Compare {
    @Override
    public boolean isGreaterThan(Object o1, Object o2) {
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;
        return b1.getPrice() > b2.getPrice();
    }
}
