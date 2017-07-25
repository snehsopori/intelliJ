public class Person {
    String name;
    String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        Person p1 = (Person) obj;
        if (p1 == null) {
            return false;
        }
        if (p1.getName().equals(this.getName()) && p1.getGender().equals(this.getGender())) {
            return true;
        }
        else {
            return false;
        }
    }

//    public boolean equals(Object obj) {
//        Person p1 = (Person) obj;
//        if (p1.getName() == this.getName() && p1.getGender() == this.getGender()) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }


//    @Override
//    public int hashCode() {
//        int h = hash;
//        if (h == 0 && value.length > 0) {
//            char val[] = value;
//            for (int i = 0; i < value.length; i++) {
//                h = 31 * h + val[i];
//            }
//            hash = h;
//        }
//        return h;
//    }

//    @Override
//    public int hashCode() {
//        int result = 1;
//        result = 31 * result + ((this.getName() == null) ? 0 : this.getName().hashCode());
//        result = 31 * result + ((this.getGender() == null) ? 0 : this.getGender().hashCode());
//        return result;
//    }

    @Override
    public int hashCode() {
        int result1 = ((this.getName() == null) ? 0 : this.getName().hashCode());
        int result2 = ((this.getGender() == null) ? 0 : this.getGender().hashCode());
        return result1 + result2;
    }

}
