package Math;
/*
Grid Unique PathsBookmark
A robot is located at the top-left corner of an A x B grid (marked 'Start' in the diagram below).



The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

http://i.imgur.com/3eaivQ5.png

How many possible unique paths are there?

Note: A and B will be such that the resulting answer fits in a 32 bit signed integer.

Example :

Input : A = 2, B = 2
Output : 2

2 possible routes : (0, 0) -> (0, 1) -> (1, 1) 
              OR  : (0, 0) -> (1, 0) -> (1, 1)
 */
public class GridUniquePaths {
	public int uniquePaths(int a, int b) {
	    int n = a + b - 2;
	    int r = b - 1;
	    
	    int uniquePaths = binomialCoefficient(n,r);
	    return uniquePaths;
	}
	
	private int binomialCoefficient(int n, int k){
	    int res = 1;
	    if(k > n - k){
	        k = n - k;
	    }
	    for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
	}
}
