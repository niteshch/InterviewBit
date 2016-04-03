package StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

/*
Nearest Smaller Element
Given an array, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.

More formally,

G[i] for an element A[i] = an element A[j] such that 
    j is maximum possible AND 
    j < i AND
    A[j] < A[i]
Elements for which no smaller element exist, consider next smaller element as -1.

Example:

Input : A : [4, 5, 2, 10]
Return : [-1, 4, -1, 2]

Example 2:

Input : A : [3, 2, 1]
Return : [-1, -1, -1]
 */
public class NearestSmallerElement {
	public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for(Integer element : arr){
            int min = -1;
            while(!stack.isEmpty()){
                if(stack.peek() < element){
                    min = stack.peek();
                    break;
                }else{
                    stack.pop();
                }
            }
            stack.push(element);
            output.add(min);
        }
        return output;
    }
}
