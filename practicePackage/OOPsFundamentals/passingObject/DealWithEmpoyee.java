package practicePackage.OOPsFundamentals.passingObject;

public class DealWithEmpoyee {
    public static void displayEmp(Employee e){
        System.out.println(e.hashCode());
         System.out.println("employee age in display method "+e.getAge());
         System.out.println("employee name in display method "+e.getName());

         e.setAge(400);
         System.out.println("changed value of age inside display "+e.getAge());
    }

    public static void main(String[] args) {
        int age=23;
        String name="zia";
        Employee e= new Employee(age,name);
        displayEmp(e);
        System.out.println(e.hashCode());
        System.out.println("age after calling display "+age);
        System.out.println("age after calling display "+name);
    }
}
