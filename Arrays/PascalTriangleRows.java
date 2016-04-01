/*Pascal Triangle Rows
Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]
*/
public class PascalTriangleRows {
	public ArrayList<ArrayList<Integer>> generate(int n) {
	    ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
	    if(n == 0){
	        return output;
	    }
	    ArrayList<Integer> firstList = new ArrayList<Integer>();
	    firstList.add(1);
	    output.add(firstList);
	    for(int i = 1; i < n; i++){
	        ArrayList<Integer> innerList = new ArrayList<Integer>();
	        for(int j = 0; j <= i; j++){
	            int prevRowI = 0;
	            int prevRowIMinusOne = 0;
	            if(j < output.get(i - 1).size()){
	                prevRowI = output.get(i - 1).get(j);
	            }
	            if((j - 1) >= 0){
	                prevRowIMinusOne = output.get(i - 1).get(j - 1);
	            } 
	            int current = prevRowI + prevRowIMinusOne;
	            innerList.add(current);
	        }
	        output.add(innerList);
	    }
	    return output;
	}
}
