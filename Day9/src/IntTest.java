public class IntTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i + " : " + (Integer.valueOf(i) == Integer.valueOf(i)));
        }
    }
}