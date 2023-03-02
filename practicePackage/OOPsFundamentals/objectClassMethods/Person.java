package practicePackage.OOPsFundamentals.objectClassMethods;

import javax.swing.text.AttributeSet.ColorAttribute;

public class Person implements Cloneable{

    private int personVoterId;
    private int age;
    private String  name;
    
    public int getPersonVoterId() {
        return personVoterId;
    }
    public void setPersonVoterId(int personVoterId) {
        this.personVoterId = personVoterId;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
    
    public Person(int personVoterId, int age, String name) {
        this.personVoterId = personVoterId;
        this.age = age;
        this.name = name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString() {
        System.out.println("toString called");
        return super.toString();  
    }
    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return getPersonVoterId();
    }
    @Override
    public boolean equals(Object o) {
       Person p = (Person)o;
       
       if(this.getPersonVoterId()==p.getPersonVoterId()){
        return true;
       }

       return false;
    }

    

    
    
}
