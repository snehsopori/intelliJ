public class PersonTest {
    public static void main(String[] args) {
     Person p1 = new Person("Suresh", "Male");
     Person p2 = new Person(new String( "Suresh"), "Male");
     Person p3 = new Person("Suresh", "Male");
     Person p4 = new Person("Suresh", "Female");
     Person p5 = new Person(null, null);

     System.out.println(p1.equals(p2));
     System.out.println(p1.equals(null));
     System.out.println(p1.equals(p3));
     System.out.println(p2.equals(p3));
     System.out.println(p3.equals(p2));
     System.out.println(p3.equals(p1));
     System.out.println("********************");
     System.out.println(p1.hashCode());
     System.out.println(p2.hashCode());
     System.out.println(p3.hashCode());
     System.out.println(p4.hashCode());
     System.out.println(p5.hashCode());
    }
}