/*Max Non Negative SubArray
Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:

A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]
NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
NOTE 2: If there is still a tie, then return the segment with minimum starting index*/
public class MaxNonNegativeSubArray {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    ArrayList<Integer> max = null;
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    long  sum = -1;
	    for(int i:a){
	        if( i >= 0){
	            temp.add(i);
	        }else{
	            //sum over the current list and check with max sum
	            long tempsum = 0;
	            for(int j:temp){
	                tempsum += j;
	            }
	            if(tempsum > sum){
	                sum = tempsum;
	                max = temp;
	            }else if(tempsum == sum){
	                if(temp.size() > max.size()){
	                    max = temp;
	                }
	            }
	            temp = new ArrayList<Integer>();
	        }
	    }
	    if(max == null){
	        max = temp;
	    }else{
	        //sum over the current list and check with max sum
            long tempsum = 0;
            for(int j:temp){
                tempsum += j;
            }
            if(tempsum > sum){
                sum = tempsum;
                max = temp;
            }else if(tempsum == sum){
                if(temp.size() > max.size()){
                    max = temp;
                }
            }
	    }
	    return max;
	}
}
