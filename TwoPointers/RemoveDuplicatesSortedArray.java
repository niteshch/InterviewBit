package TwoPointers;

import java.util.ArrayList;

/*
Remove duplicates from Sorted Array
Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.

Note that even though we want you to return the new length, make sure to change the original array as well in place

Do not allocate extra space for another array, you must do this in place with constant memory.

 Example: 
Given input array A = [1,1,2],
Your function should return length = 2, and A is now [1,2]. 
 */
public class RemoveDuplicatesSortedArray {
	public int removeDuplicates(ArrayList<Integer> a) {
	    int n = a.size();
	    int i = 0;
	    int j = i + 1;
	    while(i < n && j < n){
	        int currentElement = a.get(i);
	        int newElement = a.get(j);
	        if(currentElement < newElement){
	            i = i + 1;
	            a.set(i, newElement);
	        }
	        j = j + 1;
	    }
	    /*for(int k = (i + 1); k < a.size(); k++){
	        a.remove(k);
	    }*/
	    return i + 1;
	}
}
