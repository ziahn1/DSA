

public class SeperateString {
    
static void seperate(String s){
    StringBuilder alpha = new StringBuilder();
    StringBuilder numeric = new StringBuilder();
    StringBuilder special = new StringBuilder();

    for(int i=0;i<s.length();i++){
        if(Character.isAlphabetic(s.charAt(i))){
            alpha.append(s.charAt(i));
        }
        else if(Character.isDigit(s.charAt(i))){
            numeric.append(s.charAt(i));
        }
        else{
            special.append(s.charAt(i));
        }
    }

    System.out.println(alpha);
    System.out.println(numeric);
    System.out.println(special);
}

public static void main(String[] args) {
    String s = "$%@9*anc1#fghjk34";

    seperate(s);
}


    
}
