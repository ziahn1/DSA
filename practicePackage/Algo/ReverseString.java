package practicePackage.Algo;

public class ReverseString {
  public static String reverse(String s,int k){
    int l=0,h=k-1;
    char[] ch = s.toCharArray();
    while(h<ch.length){
    int tempL=l;
    int tempH=h;
    while(tempL<=tempH){
        char temp = ch[tempL];
        ch[tempL]=ch[tempH];
        ch[tempH]=temp;
        tempL++;
        tempH--;
    }
    l=h+1;
    h=h+k;
    }


    return String.valueOf(ch);
  }
   
    public static void main(String[] args) {
        System.out.println(reverse("abcdef", 2));
    }
    
}
