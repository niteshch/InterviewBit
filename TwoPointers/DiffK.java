package TwoPointers;

import java.util.ArrayList;

/*
Diffk
Given an array ‘A’ of sorted integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

 Example: Input : 
    A : [1 3 5] 
    k : 4
 Output : YES as 5 - 1 = 4 
Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Try doing this in less than linear space complexity.
 */
public class DiffK {
	public int diffPossible(ArrayList<Integer> a, int b) {
	    int j = 0; 
        for (int i = 0; i < a.size(); i++) {
          j = Math.max(j, i+1);
          while (j < a.size() && a.get(j) - a.get(i) < b){
            j++;  
          }    
          if(j < a.size() && a.get(j) - a.get(i) == b){
              return 1;
          }
        }
        return 0;
	}
}
