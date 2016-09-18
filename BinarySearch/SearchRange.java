package BinarySearch;

import java.util.ArrayList;
import java.util.List;

/*
Search for a Range
Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example:

Given [5, 7, 7, 8, 8, 10]

and target value 8,

return [3, 4].
 */
public class SearchRange {
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    ArrayList<Integer> output = new ArrayList<Integer>();
	    int firstIndex = binarySearch(a, b, true);
	    int lastIndex = binarySearch(a, b, false);
	    output.add(firstIndex);
	    output.add(lastIndex);
	    return output;
	}
	private int binarySearch(final List<Integer> a, int b, boolean searchFirst){
	    int low = 0;
	    int high = a.size()-1;
	    int result = -1;
	    while(low <= high){
	        int mid = low + (high-low)/2;
	        if(a.get(mid) == b){
	            if(searchFirst){
	                result = mid;
	                high = mid - 1;
	            }else{
	                result = mid;
	                low = mid + 1;
	            }
	        }else if(a.get(mid) < b){
	            low = mid + 1;
	        }else{
	            high = mid - 1;
	        }
	    }
	    return result;
	}
}
