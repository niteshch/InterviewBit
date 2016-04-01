package BitManipulation;
/*
Number of 1 Bits
Write a function that takes an unsigned integer and returns the number of 1 bits it has.

Example:

The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.

Note that since Java does not have unsigned int, use long for Java
 */
public class NumberOf1Bits {
	public int numSetBits(long a) {
	    String binaryString = Long.toBinaryString(a);
	    int count = 0;
	    for(int i = 0; i < binaryString.length(); i++){
	        if(binaryString.charAt(i) == '1'){
	            count++;
	        }
	    }
	    return count;
	}
}
