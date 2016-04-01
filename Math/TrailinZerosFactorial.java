package Math;
/*
Trailing Zeros in Factorial
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

Example :

n = 5
n! = 120 
Number of trailing zeros = 1
So, return 1
 */
public class TrailinZerosFactorial {
	public int trailingZeroes(int a) {
	    int numZeros = 0;
        int x = 0;
        int n = 1;
        while (((int)a/Math.pow(5,n)) != 0) {
          numZeros+= a/Math.pow(5,n);
          n++;
        }
        return numZeros;
	}
}
