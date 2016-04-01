/*Max Sum Contiguous Subarray
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.
*/
public class MaxSumSubArray {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    return findMaxSum(a, 0, a.size() - 1);
	}
	
	private int findMaxSum(List<Integer> a, int low, int high){
	    if(low >= high){
	        return a.get(low);
	    }
	    int mid = low + (high - low)/2;
	    int leftSum = findMaxSum(a, low, mid);
	    int rightSum = findMaxSum(a, mid+1, high);
	    int crossingSum = findMaxCrossingSum(a, low, mid, high);
	    int largestSum = leftSum;
	    if(largestSum <= rightSum){
	        largestSum = rightSum; 
	    }
	    if(largestSum <= crossingSum){
	        largestSum = crossingSum;
	    }
	    return largestSum;
	}
	
	private int findMaxCrossingSum(List<Integer> a,int low, int mid, int high){
	    int leftSum = Integer.MIN_VALUE;
	    int rightSum = Integer.MIN_VALUE;
	    int sum = 0;
	    for(int i = mid; i >= low; i--){
	        sum+=a.get(i);
	        if(leftSum <= sum){
	            leftSum = sum;
	        }
	    }
	    sum = 0;
	    for(int i = mid + 1; i <= high; i++){
	        sum+=a.get(i);
	        if(rightSum <= sum){
	            rightSum = sum;
	        }
	    }
	    return leftSum+rightSum;
	}
}
