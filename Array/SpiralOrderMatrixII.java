package Array;
import java.util.ArrayList;

/*Spiral Order Matrix II
Given an integer n, generate a square matrix filled with elements from 1 to n^2 in spiral order.

Example:

Given n = 3,

You should return the following matrix:
 [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ] */
 public class SpiralOrderMatrixII {
	public ArrayList<ArrayList<Integer>> generateMatrix(int n) {
	    ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
	    for(int i = 0; i < n; i++){
	        ArrayList<Integer> innerList = new ArrayList<Integer>();
	        for(int j = 0; j < n; j++){
	            innerList.add(0);
	        }
	        output.add(innerList);
	    }
	    int j = 1;
	    for(int layer = 0; layer <= n/2; layer++){
	        int first = layer;
	        int last = n - 1 - layer;
	        for(int i = first; i < last; i++){
	            output.get(first).set(i, j);
	            j = j + 1;
	        }
	        for(int i = first; i < last; i++){
	            int offset = i - first;
	            output.get(i).set(last, j);
	            j = j + 1;
	        }
	        for(int i = first; i < last; i++){
	            int offset = i - first;
	            output.get(last).set(last-offset, j);
	            j = j + 1;
	        }
	        for(int i = first; i < last; i++){
	            int offset = i - first;
	            output.get(last-offset).set(first, j);
	            j = j + 1;
	        }
	    }
	    if(n%2 != 0){
	        output.get(n/2).set(n/2, n*n);
	    }
	    return output;
	}
}
