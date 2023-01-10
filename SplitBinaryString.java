

public class SplitBinaryString {
public static int split(String s){
   int balancedSubStr = 0;
   int cntZero=0, cntOne=0;

   for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='0'){
           cntZero++;
       }
       if(s.charAt(i)=='1'){
           cntOne++;
       }
       if(cntOne==cntZero){
           balancedSubStr++;
       }
   }
   if(cntZero!=cntOne){
       return -1;
   }

   return balancedSubStr;
}

public static void main(String[] args) {
    String s = "0100110101";
    int res =split(s);

    System.out.println(res);
}

}
