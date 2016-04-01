package Strings;

import java.util.ArrayList;
import java.util.Collections;

/*
Multiply Strings
Given two numbers represented as strings, return multiplication of the numbers as a string.

 Note: The numbers can be arbitrarily large and are non-negative.
Note2: Your answer should not have leading zeroes. For example, 00 is not a valid answer. 
For example, 
given strings "12", "10", your answer should be “120”.

NOTE : DO NOT USE BIG INTEGER LIBRARIES ( WHICH ARE AVAILABLE IN JAVA / PYTHON ). 
We will retroactively disqualify such submissions and the submissions will incur penalties.
 */
public class MultiplyStrings {
	public String multiply(String A, String B) {
	    ArrayList<Character> res = new ArrayList<>();
	    int i;
	    int n, m;
	    
	    n = A.length();
	    for (i = 0; i < n && A.charAt(i) == '0'; i++);
	    if (i == n)
	        return "0";
	        
	    A = A.substring(i, n);
	    
	    n = B.length();
	    for (i = 0; i < n && B.charAt(i) == '0'; i++);
	    if (i == n)
	        return "0";
	        
	    B = B.substring(i, n);
	    
	    int carry = 0;
	    char cA, cB;
	    char c;
	    
	    m = A.length();
	    n = B.length();
	    int index = 0;
	    
	    for (i = m - 1; i >= 0; i--) {
	        
	        cA = A.charAt(i);
	        int a = cA - '0';
	        int b;
	        int num;
	        int curIndex = index;
	        
	        for (int j = n - 1; j >= 0; j--) {
	            cB = B.charAt(j);
	            b = cB - '0';
	            num = a * b + carry;
	            carry = num / 10;
	            num %= 10;
	            c = (char) (num + '0');
	            
	            if (curIndex >= res.size())
	                res.add(c);
	            else {
	                num += res.get(curIndex) - '0';
	                carry += (num / 10);
	                num %= 10;
	                c = (char) (num + '0');
	                res.set(curIndex, c);
	            }
	            
	            curIndex++;
	        }
	        
	        c = (char) (carry + '0');
	        carry = 0;
	        res.add(c);
	        
	        index++;
	    }
	    
	    Collections.reverse(res);
	    
	    StringBuilder str = new StringBuilder();
	    
	    i = 0;
	    n = res.size();
	    
	    while (i < n && res.get(i) == '0')
	        i++;
	    
	    for (; i < n; i++)
	        str.append(res.get(i));
	    
	    return str.toString();
	    
	}
}
