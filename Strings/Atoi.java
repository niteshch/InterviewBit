package Strings;
/*
Atoi
Please Note:

There are certain questions where the interviewer would intentionally frame the question vague.
The expectation is that you will ask the correct set of clarifications or state your assumptions before you jump into coding.

Implement atoi to convert a string to an integer.

Example :

Input : "9 2704"
Output : 9
Note: There might be multiple corner cases here. Clarify all your doubts using “See Expected Output”.

 Questions: Q1. Does string contain whitespace characters before the number?
A. Yes Q2. Can the string have garbage characters after the number?
A. Yes. Ignore it. Q3. If no numeric character is found before encountering garbage characters, what should I do?
A. Return 0. Q4. What if the integer overflows?
A. Return INT_MAX if the number is positive, INT_MIN otherwise. 
Warning : DO NOT USE LIBRARY FUNCTION FOR ATOI.
If you do, we will disqualify your submission retroactively and give you penalty points.
 */
public class Atoi {
	public int atoi(final String str) {
	    if(str.isEmpty() || str == null){
	        return 0;
	    }
	    int n = str.length();
	    int i = 0;
	    for(; i < n; i++){
	        char c = str.charAt(i);
	        if(c != ' '){
	            break;
	        }
	    }
	    //int res = 0;
	    char sign = '+';
	    if(str.charAt(i) == '-'){
	        sign = '-';
	        i++;
	    }else if(str.charAt(i) == '+'){
	        i++;
	    }
	    
	    
	    StringBuffer sb = new StringBuffer();
	    for(; i < n; i++){
	       char c = str.charAt(i);
	       if(c >= '0' && c <= '9'){
	           if(sb.length() > 0 && Integer.parseInt(sb.toString()) >= Integer.MAX_VALUE/10){
	               if(sign == '-'){
                       return Integer.MIN_VALUE;
                   }else{
                       return Integer.MAX_VALUE;
                   }
	           }
               sb.append(c);
	       }else{
	           break;
	       }
	    }
	    
	    if(sb.length() == 0){
	        return 0;
	    }
	    int res = Integer.parseInt(sb.toString());
	    if(sign == '-'){
	        return -res;
	    }else{
	        return res;
	    }
	    
	    
	}
}
