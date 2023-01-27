package practicePackage.OOPsFundamentals.objectClassMethods;

public class CloneOfObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1  = new Person(1234567, 26, "Zia");
        Person p2 = (Person)p1.clone();

        p1.setName("Maarif");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
