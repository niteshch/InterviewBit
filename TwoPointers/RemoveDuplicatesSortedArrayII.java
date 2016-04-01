package TwoPointers;

import java.util.ArrayList;

/*
Remove Duplicates from Sorted Array II
Remove Duplicates from Sorted Array

Given a sorted array, remove the duplicates in place such that each element appear atmost twice and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

Note that even though we want you to return the new length, make sure to change the original array as well in place

For example,
Given input array A = [1,1,1,2],

Your function should return length = 3, and A is now [1,1,2].
 */
public class RemoveDuplicatesSortedArrayII {
public int removeDuplicates(ArrayList<Integer> A) {
	    
	    int index = 1;
	    int count = 1;
	    int n = A.size();
	    
	    for (int i = 1; i < n; i++) {
	        if (A.get(i).intValue() == A.get(i - 1).intValue() && count < 2) {
	            A.set(index, A.get(i));
	            count++;
	            index++;
	        } else if (A.get(i).intValue() != A.get(i - 1).intValue()) {
	            A.set(index, A.get(i));
	            count = 1;
	            index++;
	        }
	    }
	    
	    
	    return index;
	}
}
