package practicePackage.Algo;

public class BinaryStringStartAndEndWithOne {
    public static int countSuStr(String s){
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)=='1'){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSuStr("1000100100001"));
    }
}
