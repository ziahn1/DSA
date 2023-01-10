package practicePackage;

public class RevereseLetters {
    public static String reverseOnlyLetters(String s) {
    char[] ch = s.toCharArray();
    StringBuilder sb = new StringBuilder();
        for(int i=0;i<ch.length;i++){
        if(Character.isAlphabetic(ch[i])){
            sb.append(ch[i]);
        }
    }
    String str = sb.reverse().toString();
    int j=0;
      for(int i=0;i<ch.length;i++){
        if(Character.isAlphabetic(ch[i])){
            ch[i]=str.charAt(j++);
        }
    }
    String res = String.valueOf(ch);
      return res;
}

    public static void main(String[] args) {
        String s = "ad@%xcv--bg";
        String res = reverseOnlyLetters(s);
        System.out.println(res);
    }
}
