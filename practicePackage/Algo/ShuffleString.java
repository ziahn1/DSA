package practicePackage.Algo;

public class ShuffleString {
    public static String shuffle(String s,int[] indices){
     char[] res = new char[indices.length];

     for(int i=0;i<s.length();i++){
        res[indices[i]]=s.charAt(i);
     }
        
        
        
        return String.valueOf(res);
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr= {4,5,6,7,0,2,1,3};
        String res = shuffle(s, arr);
        System.out.println(res);
    }
}
