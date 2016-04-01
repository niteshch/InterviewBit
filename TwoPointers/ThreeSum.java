package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;

/*
3 Sum
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
Return the sum of the three integers. 
You may assume that each input would have exactly one solution.

Example: 
given array S = {-1 2 1 -4}, 
and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
 */
public class ThreeSum {
	public int threeSumClosest(ArrayList<Integer> a, int target) {
	    int n = a.size();
	    int sum = 0;
	    int minDiff = Integer.MAX_VALUE;
	    Collections.sort(a);
	    
	    
	    for(int i = 0; i < n - 2; i++){
	        int j = i + 1;
	        int k = n - 1;
	        while(k > j){
	            int tempSum = a.get(i)+a.get(j)+a.get(k);
                int newDiff = tempSum - target;
                if(Math.abs(newDiff) < Math.abs(minDiff)){
                    sum = tempSum;
                    minDiff = newDiff;
                }
                if(tempSum < target){
                    j++;
                }else{
                    k--;
                }
	        }
	    }
	    return sum;
	}
}
