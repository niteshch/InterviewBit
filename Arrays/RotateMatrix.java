import java.util.ArrayList;

/*Rotate Matrix
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note that if you end up using an additional array, you will only receive partial score.

Example:

If the array is

[
    [1, 2],
    [3, 4]
]
Then the rotated array becomes:

[
    [3, 1],
    [4, 2]
]*/
public class RotateMatrix {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
	    int n = a.size();
	    if(n > 0){
	        //int n = a.get(0).size();
	        for(int layer = 0; layer < n/2; layer++){
	            int first = layer;
	            int last = n - 1 - layer;
	            for(int i = first; i < last; i++){
	                int offset = i - first;
	                int top = a.get(first).get(i);
	                int left = a.get(last-offset).get(first);
	                int bottom = a.get(last).get(last-offset);
	                int right = a.get(first+offset).get(last);
	                a.get(first).set(i, left);
	                a.get(last-offset).set(first,bottom);
	                a.get(last).set(last-offset,right);
	                a.get(first+offset).set(last,top);
	            }
	        }
	    }
	}
}
