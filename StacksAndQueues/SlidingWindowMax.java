package StacksAndQueues;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
Sliding Window Max
A long array A[] is given to you. There is a sliding window of size w which is moving from the very left of the array to the very right. You can only see the w numbers in the window. Each time the sliding window moves rightwards by one position.

Example :

The array is [1 3 -1 -3 5 3 6 7], and w is 3.

Window position	Max
 	 
[1 3 -1] -3 5 3 6 7	3
1 [3 -1 -3] 5 3 6 7	3
1 3 [-1 -3 5] 3 6 7	5
1 3 -1 [-3 5 3] 6 7	5
1 3 -1 -3 [5 3 6] 7	6
1 3 -1 -3 5 [3 6 7]	7
Input: A long array A[], and a window width w
Output: An array B[], B[i] is the maximum value of from A[i] to A[i+w-1]
Requirement: Find a good optimal way to get B[i]

 Note: If w > length of the array, return 1 element with the max of the array. 
 */
public class SlidingWindowMax {
	public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
	    int n = A.size();
	    int i;
	    ArrayList<Integer> res = new ArrayList<>();
	    int window = Math.min(A.size(), B);
	    Deque<Node> deque = new LinkedList<>();
	    int val;
        Node ans;
	    
	    for (i = 0; i < window - 1; i++) {
	        val = A.get(i);
	        
	        while (!deque.isEmpty() && deque.peekFirst().val <= val) {
	            deque.pollFirst();
	        }
	        
	        deque.addFirst(new Node(i, val));
	    }
	    
	    for (; i < n; i++) {
	        val = A.get(i);
	        
	        while (!deque.isEmpty() && (i - deque.peekLast().index >= window)) {
	            deque.pollLast();
	        }
	        
	        while (!deque.isEmpty() && deque.peekFirst().val <= val) {
	            deque.pollFirst();
	        }
	        
	        deque.addFirst(new Node(i, val));
	        
	        ans = deque.peekLast();
	        
	        res.add(ans.val);
	    }
	    
	    return res;
	}
	
	class Node {
	    int val;
	    int index;
	    
	    public Node(int index, int val) {
	        this.index = index;
	        this.val = val;
	    }
	}
}
