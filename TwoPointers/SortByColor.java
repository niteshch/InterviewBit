package TwoPointers;

import java.util.ArrayList;

/*
Sory by Color
Given an array with n objects colored red, white or blue, 
sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: Using library sort function is not allowed.

Example :

Input : [0 1 2 0 1 2]
Modify array so that it becomes : [0 0 1 1 2 2]
 */
public class SortByColor {
	public void sortColors(ArrayList<Integer> a) {
	    int n = a.size();
	    int i = 0;
	    for(int j = 0; j < n; j++){
	        if(a.get(j) == 0){
	            int elementI = a.get(i);
	            a.set(i,a.get(j));
	            a.set(j, elementI);
	            i = i + 1;
	        }
	    }
	    
	    for(int j = i; j < n; j++){
	        if(a.get(j) == 1){
	            int elementI = a.get(i);
	            a.set(i,a.get(j));
	            a.set(j, elementI);
	            i = i + 1;
	        }
	    }
	}
}
