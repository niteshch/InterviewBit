package Math;
/*
Power Of Two Integers
Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Example

Input : 4
Output : True  
as 2^2 = 4. 
 */
public class PowerOfTwoIntegers {
	public boolean isPower(int A) {
        double x=2;
	    double i;
	    if(A==1) return true;
	    for(i=2;(i<33)&&(x<=(double)(Math.pow(2,16)));i++)
	    {   
	        if(Math.pow(x,i)==(double)A) return true;
	        if(Math.pow(x,i) >= (Math.pow(2,32))) {i=1;x++;}
	    }
	    return false;
    }

}
