package Array;
import java.util.Collections;
import java.util.List;

/*Find Duplicate in Array
Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less then O(n) space and traversing the stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]
Sample Output:

1
If there are multiple possible answers ( like in the sample case above ), output any one.*/
public class ArrayDuplicate {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> A) {
	    Collections.sort(A);
	    
	    for (int i = 0; i < A.size() - 1; i++) {
	        if (A.get(i).intValue() == A.get(i + 1).intValue())
	            return A.get(i);
	    }
	    
	    return -1;
	    
	}

}
