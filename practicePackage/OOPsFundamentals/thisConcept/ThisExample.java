package practicePackage.OOPsFundamentals.thisConcept;

// This keyword can be use to current object from method 
public class ThisExample {
    int x;
    int y;
    public ThisExample setX(int x){
      this.x=x;

      return this;
    }
    public ThisExample setY(int y){
        this.y=y;
        return this;
    }

    
 public static void main(String[] args) {
    ThisExample example = new ThisExample().setX(3).setY(4);
    System.out.println(example.x);
    System.out.println(example.y);
 }   
}
