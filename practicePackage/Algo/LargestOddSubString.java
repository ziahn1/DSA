package practicePackage.Algo;

public class LargestOddSubString {
    public static String largestOddSubString(String s){
      Integer num = Integer.parseInt(s);
      while(num>=0){
        if(num%2!=0){
          return String.valueOf(num); 
        }
        num=num/10;
      }
      return String.valueOf(-1);
    }
    public static void main(String[] args) {
        System.out.println(largestOddSubString("23452"));
    }
}


//    String largestOddSubString="";
// for (int i = 0; i < s.length(); i++) {
//     for(int j=i+1;j<=s.length();j++){
//        if(Integer.parseUnsignedInt(s.substring(i, j))%2!=0){
//            if(s.substring(i, j).length()>largestOddSubString.length()){
//              largestOddSubString=s.substring(i, j);
//            }
//        }
//     }
// }
//   if(largestOddSubString.length()==0){
//    return String.valueOf(-1);
//   }
//    return largestOddSubString;