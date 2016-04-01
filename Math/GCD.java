package Math;
/*
Greatest Common DivisorBookmark
Given 2 non negative integers m and n, find gcd(m, n)

GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n.
Both m and n fit in a 32 bit signed integer.

Example

m : 6
n : 9

GCD(m, n) : 3 
 NOTE : DO NOT USE LIBRARY FUNCTIONS 
 */
public class GCD {
	public int gcd(int a, int b) {
	    int gcd = 1;
	    int max = a;
	    if(b > max){
	        max = b;
	    }
	    for(int i = 2; i <= max; i++){
	        if( (a%i == 0) && (b%i == 0) ){
	            gcd = i;
	        }
	    }
	    return gcd;
	}
}
