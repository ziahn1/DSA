package practicePackage.OOPsFundamentals.staticConcepts;

import javax.sound.sampled.SourceDataLine;

public class StaticBlock {
    public static int x;
    static {
        x=5;
        System.out.println("Static block fired");
    }
    
    
    public static void main(String[] args) {
        System.out.println("This is main");
    }
}
