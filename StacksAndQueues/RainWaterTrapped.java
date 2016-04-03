package StacksAndQueues;

import java.util.List;

/*
Rain Water Trapped
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

Example :

Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.

http://i.imgur.com/0qkUFco.png

The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
In this case, 6 units of rain water (blue section) are being trapped.
 */
public class RainWaterTrapped {
	// DO NOT MODIFY THE LIST
		public int trap(final List<Integer> A) {
		    int n = A.size();
		    int rightMax[], leftMax[];
		    int left, right;
		    int res = 0;
		    
		    rightMax = new int[n];
		    leftMax = new int[n];
		    
		    left = 0;
		    right = 0;
		    
		    for (int i = 0; i < n; i++) {
		        leftMax[i] = left;
		        if (left < A.get(i))
		            left = A.get(i);
		    }
		    
		    for (int i = n - 1; i >= 0; i--) {
		        rightMax[i] = right;
		        if (right < A.get(i))
		            right = A.get(i);
		    }
		    
		    for (int i = 0; i < n; i++) {
		        
		        res += Math.max(0, Math.min(leftMax[i], rightMax[i]) - A.get(i));
		        
		    }
		    
		    
		    return res;
		}
}
