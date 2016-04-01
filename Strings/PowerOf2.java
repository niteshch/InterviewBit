package Strings;
/*
Power of 2
Find if Given number is power of 2 or not. 
More specifically, find if given number can be expressed as 2^k where k >= 1.

Input:

number length can be more than 64, which mean number can be greater than 2 ^ 64 (out of long long range)
Output:

return 1 if the number if a power of 2 else return 0

Example:

Input : 128
Output : 1
 */
public class PowerOf2 {
	public int power(String a) {
	    int quotient = 0, remainder = 0;
	    StringBuffer sb = new StringBuffer();
	    for(int i = 0; i < a.length(); i++){
	        char digit = a.charAt(i);
	        int current = Integer.parseInt(""+remainder+digit);
	        remainder = current%2;
	        quotient = current/2;
	        sb.append(quotient);
	        if(i == a.length() - 1){
	            if(remainder != 0){
	                return 0;
	            }else if("1".equals(removeZeroPrefix(sb)) || sb.length() == 0){
	                break;
	            }else{
	                a = sb.toString();
	                sb = new StringBuffer();
	                i = -1;
	            }
	        }
	    }
	    
	    return 1;
	}
	public String removeZeroPrefix(StringBuffer sb){
	    int i = 0;
	    while(sb.charAt(i) == '0'){
	        i++;
	    }
	    if(i > 0){
	        sb.delete(0,i);
	    }
	    return sb.toString();
	}
}
