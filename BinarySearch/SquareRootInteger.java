package BinarySearch;
/*
Square Root of Integer
Implement int sqrt(int x).

Compute and return the square root of x.

If x is not a perfect square, return floor(sqrt(x))

Example :

Input : 11
Output : 3
DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY
 */
public class SquareRootInteger {
	public int sqrt(int a) {
	    int sqrt = 0;
	    int low = 1;
	    int high = a;
	    while(low <= high){
	        int mid = low + (high-low)/2;
	        if(mid == a/mid && (a%mid == 0)){
	            return mid;
	        }
	        if(mid <= a/mid){
	            sqrt = mid;
	            low = mid + 1;
	        }else{
	            high = mid - 1;
	        }
	    }
	    return sqrt;
	}
}
