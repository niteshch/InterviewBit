package StacksAndQueues;

import java.util.Stack;

/*
Redundant Braces
Write a program to validate if the input string has redundant braces?
Return 0/1 
 0 -> NO 1 -> YES 

Input will be always a valid expression

and operators allowed are only + , * , - , /

Example:

((a+b)) has redundant braces so answer will be 1
(a + (a + b)) doesn't have have any redundant braces so answer will be 0

 */
public class RedundantBraces {
	public static final Character OPEN_BRACE = '(';
    public static final Character CLOSE_BRACE = ')';
	public int braces(String a) {
	    int n = a.length();
	    Stack<Character> stack = new Stack<Character>();
	    for(int i = 0; i < n; i++){
	        char c = a.charAt(i);
	        if(CLOSE_BRACE.equals(c)){
	            if(stack.peek() == '('){
	                return 1;
	            }else{
	                boolean isOperatorPresent = false;
	                while(!stack.isEmpty() && !OPEN_BRACE.equals(stack.peek())){
	                    char op = stack.pop();
	                    if(isOperator(op)){
	                        isOperatorPresent = true;
	                    }
	                }
	                if(!stack.isEmpty() && OPEN_BRACE.equals(stack.peek())){
	                    if(!isOperatorPresent){
	                        return 1;
	                    }
	                    stack.pop();
	                }
	            }
	        }else{
	            stack.push(c);
	        }
	    }
	    return 0;
	}
	public boolean isOperator(char c){
	    return (c == '+' || c == '-' || c =='/' || c == '*');
	}
}
