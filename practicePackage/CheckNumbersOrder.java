package practicePackage;

import java.util.ArrayList;

public class CheckNumbersOrder {


    public static boolean check(String s){
        String[] str = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s1 : str){
            if (Character.isDigit(s1.charAt(0))){
               list.add(Integer.valueOf(s1));
            }
        }
        int size = list.size();
        for(int i=1;i<size;i++){
            if(list.get(i)<list.get(i-1)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
         String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
         boolean res = check(s);
        System.out.println(res);
    }
}
