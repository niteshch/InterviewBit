package TwoPointers;

import java.util.ArrayList;

/*
Max Continuous Series of 1s
You are given with an array of 1s and 0s. And you are given with an integer M, which signifies number of flips allowed.
Find the position of zeros which when flipped will produce maximum continuous series of 1s.

For this problem, return the indices of maximum continuous series of 1s in order.

Example:

Input : 
Array = {1 1 0 1 1 0 0 1 1 1 } 
M = 1

Output : 
[0, 1, 2, 3, 4] 

If there are multiple possible solutions, return the sequence which has the minimum start index.
 */
public class MaxSeriesOf1s {
public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
	    
	    ArrayList<Integer> zeroPos = new ArrayList<>();
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    if (A == null)
	        return res;
	    
	    int n = A.size();
	    
	    for (int i = 0; i < n ; i++) {
	        int num = A.get(i);
	        if (num == 0)
	            zeroPos.add(i);
	    }
	    
	    if (B >= zeroPos.size()) {
	        for (int i = 0; i < n; i++)
	            res.add(i);
	        return res;
	    }
	    
	    int i = 0;
	    int j = B;
	    int maxSize = 0;
	    int start, end;
	    start = 0;
	    
	    while (j <= zeroPos.size()) {
	        
	        if (j == zeroPos.size())
    	        end = n - 1;
    	    else
    	        end = zeroPos.get(j) - 1;
	        
	        int size = end - start + 1;
	        
	        if (size > maxSize) {
	            maxSize = size;
	            res.clear();
	            res.add(start);
	            res.add(end);
	        }
	        
	        if (j == zeroPos.size())
	            break;
	        
	        start = zeroPos.get(i) + 1;
	        i++;
	        j++;
	    }
	    
	    
	    start = res.get(0);
	    end = res.get(1);
	    
	    res.clear();
	    
	    for (i = start; i <= end; i++)
	        res.add(i);
	    
	    return res;
	    
	}
}
