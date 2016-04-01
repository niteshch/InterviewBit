/*Kth Row of Pascal's Triangle
Given an index k, return the kth row of the Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Input : k = 3

Return : [1,3,3,1]
 NOTE : k is 0 based. k = 0, corresponds to the row [1]. 
Note:Could you optimize your algorithm to use only O(k) extra space?*/
public class PascalTriangle {
	public ArrayList<Integer> getRow(int a) {
	    int[] complete = new int[a+1];
	    int[] inprog = new int[a+1];
	    complete[0] = 1;
	    for(int i = 1; i <= a; i++){
	        for(int j = 0; j <=i; j++){
	            int prev = 0;
	            int current = 0;
	            if(j - 1 >= 0){
	                prev = complete[j-1];
	            }
	            if( j < complete.length){
	                current = complete[j];
	            }
	            inprog[j] = prev + current;
	        }
	        int[] temp = complete;
	        complete = inprog;
	        inprog = temp;
	    }
	    ArrayList<Integer> pTriangle = new ArrayList<Integer>();
	    for(int i = 0; i<=a; i++){
	        pTriangle.add(complete[i]);
	    }
	    return pTriangle;
	}
}
