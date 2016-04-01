package Strings;
/*
Count And Say
The count-and-say sequence is the sequence of integers beginning as follows:

1, 11, 21, 1211, 111221, ...
1 is read off as one 1 or 11.
11 is read off as two 1s or 21.

21 is read off as one 2, then one 1 or 1211.

Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

Example:

if n = 2,
the sequence is 11.
 */
public class CountAndSay {
	public String countAndSay(int a) {
	    String s = "1";
	    for(int i = 1; i < a; i++){
	        int j = 0;
	        StringBuffer temp = new StringBuffer();
	        while(j < s.length()){
	            char c = s.charAt(j);
	            int k = j + 1;
	            int count = 1;
	            while(k < s.length() && c == s.charAt(k)){
	                count++;
	                k++;
	            }
	            temp.append(count);
	            temp.append(c);
	            j = k;
	        }
	        s = temp.toString();
	    }
	    return s;
	}
}
