package BinarySearch;

import java.util.ArrayList;

/*
Sorted Insert Position
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.

[1,3,5,6], 5 -> 2
[1,3,5,6], 2 -> 1
[1,3,5,6], 7 -> 4
[1,3,5,6], 0 -> 0
 */
public class SortedInsertPosition {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    return binarySearch(a, b);
	}
	private int binarySearch(ArrayList<Integer> a, int b){
	    int low = 0;
	    int high = a.size() - 1;
	    int target = 0;
	    while(low <= high){
	        int mid = low + (high-low)/2;
	        if(a.get(mid) == b){
	            return mid;
	        }
	        if(a.get(mid) < b){
	            target = mid + 1;
	            low = mid + 1;
	        }else{
	            target = mid;
	            high = mid - 1;
	        }
	    }
	    return target;
	}
}
