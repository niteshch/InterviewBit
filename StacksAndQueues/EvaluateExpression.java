package StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

/*
Evaluate Expression
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Examples:

  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class EvaluateExpression {
	public static final String ADD = "+";
    public static final String SUBTRACT = "-";
    public static final String DIVIDE = "/";
    public static final String MULTIPLY = "*";
    
	public int evalRPN(ArrayList<String> a) {
	    Stack<Integer> stack = new Stack<Integer>();
	    for(String element : a){
	        if(isOperand(element)){
	            Integer op2 = stack.pop();
	            Integer op1 = stack.pop();
	            Integer output = evaluate(op1, op2, element);
	            stack.push(output);
	        }else{
	            stack.push(Integer.valueOf(element));
	        }
	    }
	    if(stack.isEmpty()){
	        return 0;
	    }
	    return stack.pop();
	}
	public boolean isOperand(String expr){
	    return (ADD.equals(expr) || SUBTRACT.equals(expr) 
	        || DIVIDE.equals(expr) || MULTIPLY.equals(expr));
	}
	public Integer evaluate(Integer op1, Integer op2, String expr){
	    if(ADD.equals(expr)){
	        return op1 + op2;
	    }else if(SUBTRACT.equals(expr)){
	        return op1 - op2;
	    }else if(DIVIDE.equals(expr)){
	        return op1/op2;
	    }else if(MULTIPLY.equals(expr)){
	        return op1*op2;
	    }
	    return 0;
	}
}
