/*Set Matrix Zeros
Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.

Do it in place.

Example

Given array A as

1 0 1
1 1 1 
1 1 1
On returning, the array A should be :

0 0 0
1 0 1
1 0 1
Note that this will be evaluated on the extra memory used. Try to minimize the space and time complexity.*/

public class MatrixZeros {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    int m = a.size();
	    if(m > 0){
	        Set<Integer> rows = new HashSet<Integer>();
	        Set<Integer> columns = new HashSet<Integer>();
	        int n = a.get(0).size();
	        
	        for(int i = 0; i < m; i++){
	            for(int j = 0; j < n; j++){
	                int element = a.get(i).get(j);
	                if(element == 0){
	                    rows.add(i);
	                    columns.add(j);
	                }
	            }
	        }
	        
	        for(Integer i:rows){
	            for(int j = 0; j < n; j++){
	                a.get(i).set(j,0);
	            }
	        }
	        
	        for(Integer j:columns){
	            for(int i = 0; i < m; i++){
	                a.get(i).set(j,0);
	            }
	        }
	        
	    }
	}
}