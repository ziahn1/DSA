




public class ReverseOnlyAlphabet {
    public static String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        char[] ch = s.toCharArray();
        StringBuilder str = new StringBuilder();
        
        while(i<=j){
            if(Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j])){
                char temp = ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else if(Character.isAlphabetic(ch[i])){
                j--;

            }
          else {
              i++;
          }
        }
        
        for(char c : ch){
            str.append(c);
        }
        
        return str.toString();
    }

    public static void main(String[] args) {
        String str = "a-bC-dEf-ghIj";

        String res = reverseOnlyLetters(str);

        System.out.println(res);
    }
}
