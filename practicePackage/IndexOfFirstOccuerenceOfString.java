package practicePackage;

public class IndexOfFirstOccuerenceOfString {

    public static int getIndex(String haystack,String needle){
        int n = haystack.length();
        int m = needle.length();
        int j=needle.length();
        for(int i=0;i<=n-m;i++){
            if(haystack.substring(i,j++).equals(needle)){
        return i;
        }

        }
      return 0;
    }

    public static void main(String[] args) {
       String haystack = "hello", needle = "ll";
      int res = getIndex(haystack,needle);
        System.out.println(res);
    }
}



