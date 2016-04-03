package StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

/*
Largest Rectangle in Histogram
Given n non-negative integers representing the histogram’s bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.

Example Histogram

http://i.imgur.com/1OutEEI.png

Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].

http://i.imgur.com/F2bePvG.png

The largest rectangle is shown in the shaded area, which has area = 10 unit.

For example,
Given height = [2,1,5,6,2,3],
return 10.
 */
public class LargestRectangleHistogram {
	public int largestRectangleArea(ArrayList<Integer> A) {
	    Stack<Integer> stack = new Stack<>();
	    int n = A.size();
	    int res = 0;
	    int prevMin[], nextMin[];
	    int cur;
	    int idx;
	    int prev, next;
	    
	    prevMin = new int[n];
	    nextMin = new int[n];
	    
	    for (int i = 0; i < n; i++) {
	        
	        cur = A.get(i);
	        
	        while (!stack.isEmpty() && cur <= A.get(stack.peek())) {
	            stack.pop();
	        }
	        
	        if (stack.isEmpty()) {
	            prevMin[i] = -1;
	        } else {
	            prevMin[i] = stack.peek();
	        }
	        
            stack.push(i);
	        
	    }
	    
	    stack.clear();
	    
	    for (int i = n - 1; i >= 0; i--) {
	        cur = A.get(i);
	        
	        while (!stack.isEmpty() && cur <= A.get(stack.peek())) {
	            stack.pop();
	        }
	        
	        if (stack.isEmpty())
	            nextMin[i] = n;
	        else
	            nextMin[i] = stack.peek();
	            
	        stack.push(i);
	    }
	    
	    for (int i = 0; i < n; i++) {
	        prev = prevMin[i];
	        next = nextMin[i];
	        int area = (next - prev - 1) * A.get(i);
	        res = Math.max(res, area);
	    }
	    
	    
	    return res;
	}
}
