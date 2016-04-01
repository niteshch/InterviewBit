package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;

/*
3 Sum Zero
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Note:

 Elements in a triplet (a,b,c) must be in non-descending order. (ie, a <= b <= c)
The solution set must not contain duplicate triplets. For example, given array S = {-1 0 1 2 -1 -4}, A solution set is:
(-1, 0, 1)
(-1, -1, 2) 
 */
public class ThreeSumZero {
	public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
	    Collections.sort(a);
	    int n = a.size();
	    ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
	    for(int i = 0; i < n - 2; i++){
	        int j = i + 1;
	        int k = n - 1;
	        while(k > j){
	            int sum = a.get(i) + a.get(j) + a.get(k);
	            if(sum > 0){
	                k--;
	            }else if (sum < 0){
	                j++;
	            }else{
	                ArrayList<Integer> temp = new ArrayList<Integer>();
	                temp.add(a.get(i));
	                temp.add(a.get(j));
	                temp.add(a.get(k));
	                if(!output.contains(temp)){
	                    output.add(temp);
	                }
	                j++;
	                k--;
	            }
	        }
	    }
	    return output;
	}
}
