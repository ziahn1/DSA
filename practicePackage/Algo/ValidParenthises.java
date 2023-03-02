package practicePackage.Algo;

import java.util.Stack;

public class ValidParenthises {
    public static boolean isValidParenthises(String s){
        int i=s.length()-1;
        Stack<Character> stack = new Stack<>();
        while(i>=0){
            if(s.charAt(i)==']' || s.charAt(i)==')' || s.charAt(i)=='}'){
                stack.push(s.charAt(i));
            }
            if(stack.isEmpty()){
                return false;
            }
            if(s.charAt(i)=='{'){
                if(stack.peek()=='}')
                 stack.pop();
            }
            if(s.charAt(i)=='['){
                if(stack.peek()==']')
                 stack.pop();
            }
            if(s.charAt(i)=='('){
                if(stack.peek()==')')
                 stack.pop();
            }
            i--;
        }
       if(stack.isEmpty()){
        return true;
       }
     
       return false;
    }
    public static void main(String[] args) {
        System.out.println(isValidParenthises("((("));
    }
}
