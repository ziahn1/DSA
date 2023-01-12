package practicePackage.Algo;

public class ReverseOnlyAlphabets {
    public static String reverseAlphabets(String str){
        
        char[] ch = str.toCharArray();
       int l=0,h=ch.length-1;
       reverse(l, h, ch);
       String result = String.valueOf(ch);
        
        return result;
    }

    public static void reverse(int l,int h,char[] arr){
        while(l<=h){
        if(isVowel(arr[l]) && isVowel(arr[h])){
           swap(l, h, arr);
           l++;
           h--;
        }
        else if(isVowel(arr[l])){
            h--;
        }
        else if(isVowel(arr[h])){
            l++;
        }
        else if(!isVowel(arr[l]) && !isVowel(arr[h])){
            l++;
            h--;
        }
    }
}

    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c== 'u'){
            return true;
        }
        else if(c=='A' || c=='E' || c=='I' || c=='O' || c== 'U'){
            return true;
        }
        return false;
    }
    public static void swap(int l,int h,char[] ch){
        char temp = ch[l];
        ch[l]=ch[h];
        ch[h]=temp;
    }

    public static void main(String[] args) {
        String s= "leetcode";
        String res = reverseAlphabets(s);
        System.out.println(res);
    }
}
