package com.headout.demo;

import java.util.Stack;

public class StackBalance {
    Stack<Character>stack = new Stack<Character>();

    public boolean balance(String str){
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i)=='{' || (str.charAt(i))=='[' || (str.charAt(i))=='('){
                stack.push(str.charAt(i));
            }else if ((str.charAt(i))=='}' || (str.charAt(i))==']' || (str.charAt(i))==')' ) {
                if(stack.empty())
                    return false;
                else if((stack.peek()=='{' && str.charAt(i)=='}') || (stack.peek()=='[' && str.charAt(i)==']') || (stack.peek()=='(' && str.charAt(i)==')'))
                    stack.pop();
                    else
                        return false;
            }
        }
        return stack.empty()?true:false;
    }

    public static void main(String args[]){
        String str ="{{[()]}}";
        System.out.println(new StackBalance().balance(str));
    }
}
