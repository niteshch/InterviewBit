package TwoPointers;

import java.util.ArrayList;

/*
Container With Most Water

Given n non-negative integers a1, a2, ..., an,
where each represents a point at coordinate (i, ai).
'n' vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).

Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Your program should return an integer which corresponds to the maximum area of water that can be contained ( Yes, we know maximum area instead of maximum volume sounds weird. But this is 2D plane we are working with for simplicity ).

 Note: You may not slant the container. 
Example :

Input : [1, 5, 4, 3]
Output : 6

Explanation : 5 and 3 are distance 2 apart. So size of the base = 2. Height of container = min(5, 3) = 3. 
So total area = 3 * 2 = 6
 */
public class ContainerWithMostWater {
	public int maxArea(ArrayList<Integer> a) {
	    //Collections.sort(a);
	    int left = 0, right = a.size()-1;
	    int maxVolume = 0;
	    while(left<right){
	        int leftElement = a.get(left);
	        int rightElement = a.get(right);
	        int height = Math.min(leftElement,rightElement);
	        int volume = (right - left)*height;
	        if(volume > maxVolume){
	            maxVolume = volume;
	        }
	        if(rightElement > leftElement){
	            left++;
	        }else{
	            right--;
	        }
	    }
	    return maxVolume;
	}
}
