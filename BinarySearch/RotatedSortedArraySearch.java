package BinarySearch;

import java.util.List;

/*
Rotated Sorted Array Search
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7  might become 4 5 6 7 0 1 2 ).

You are given a target value to search. If found in the array, return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Input : [4 5 6 7 0 1 2] and target = 4
Output : 0

NOTE : Think about the case when there are duplicates. Does your current solution work? How does the time complexity change?
 */
public class RotatedSortedArraySearch {
	public int search(final List<Integer> a, int b) {
	    int pivot = findPivot(a);
	    if(a.get(pivot) == b){
	        return pivot;
	    }
	    int searchFirst = binarySearch(a, 0, pivot - 1, b);
	    if(searchFirst != -1){
	        return searchFirst;
	    }
	    int searchSecond = binarySearch(a, pivot + 1, a.size() - 1, b);
	    return searchSecond;
	    
	}
	private int binarySearch(final List<Integer> a, int low, int high, int b){
	    while(low <= high){
	        int mid = low + (high-low)/2;
	        if(a.get(mid) == b){
	            return mid;
	        }
	        if(a.get(mid) < b){
	            low = mid + 1;
	        }else{
	            high = mid - 1;
	        }
	    }
	    return -1;
	}
	private int findPivot(final List<Integer> a){
	    int low = 0;
	    int high = a.size() - 1;
	    int min = 0;
	    while(low <= high){
	        int mid = low + (high - low)/2;
	        if(a.get(min) > a.get(mid)){
	                min = mid;    
	        }
	        if(a.get(mid) > a.get(high)){
	            low = mid + 1;
	        }else{
	            high = mid - 1;
	        }
	    }
	    return min;
	}
}
