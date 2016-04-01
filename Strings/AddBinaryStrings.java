package Strings;
/*
Add Binary Strings
Given two binary strings, return their sum (also a binary string).

Example:

a = "100"

b = "11"
Return a + b = “111”.
 */
public class AddBinaryStrings {
	public String addBinary(String a, String b) {
	    final char ZERO = '0';
	    final char ONE = '1';
        int m = a.length();
        int n = b.length();
        int i = m - 1, j = n - 1;
        StringBuffer output = new StringBuffer();
        char carry = ZERO;
        while(i >= 0 || j >= 0){
            char c1 = i >= 0 ? a.charAt(i--) : ZERO;
            char c2 = j >= 0 ? b.charAt(j--) : ZERO;
            if(c1 == c2){
                output.insert(0,carry);
                if(c1 == ONE){
                    carry = ONE;
                }else{
                    carry = ZERO;
                }
            }else{
                if(carry == ONE){
                    output.insert(0,ZERO);
                    carry = ONE;
                }else{
                    output.insert(0,ONE);
                    carry = ZERO;
                }
            }
        }
        if(carry == ONE){
            output.insert(0,ONE);
        }
        return output.toString();
	}
}
