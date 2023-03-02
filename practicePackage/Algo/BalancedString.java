package practicePackage.Algo;

import java.util.Stack;

public class BalancedString {
    public static boolean isBalancedString(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }

            if(stack.isEmpty()){
                return false;
            }
           char temp;
           if(s.charAt(i)==')'){
            temp = stack.pop();
            if(temp=='{' || temp=='[')
             return false;
           }
           
           if(s.charAt(i)=='}'){
            temp = stack.pop();
            if(temp=='(' || temp=='[')
             return false;
           }

           if(s.charAt(i)==']'){
            temp = stack.pop();
            if(temp=='(' || temp=='{')
             return false;
           }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="]";
        System.out.println(isBalancedString(s));
    }
}
