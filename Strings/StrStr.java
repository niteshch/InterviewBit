package Strings;
/*
Implement StrStr
Please Note:

Another question which belongs to the category of questions which are intentionally stated vaguely. 
Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.

Implement strStr().

 strstr - locate a substring ( needle ) in a string ( haystack ). 
Try not to use standard library string functions for this question.

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 NOTE: Good clarification questions:
What should be the return value if the needle is empty?
What if both haystack and needle are empty?
For the purpose of this problem, assume that the return value should be -1 in both cases. 
 */
public class StrStr {
	public int strStr(final String haystack, final String needle) {
	    if(haystack.equals(needle)){
	        return 0;
	    }
	    int n = haystack.length();
	    int m = needle.length();
	    int remlength = n- m;
	    for(int i = 0; i < remlength; i++){
            String haystackSubString = haystack.substring(i,i+m);
	        if(haystackSubString.equals(needle)){
	            return i;
	        }
	    }
	    return -1;
	}
}
