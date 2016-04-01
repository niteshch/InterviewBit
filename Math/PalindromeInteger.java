package Math;
/*
Palindrome Integer
Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False
 */
public class PalindromeInteger{
	public boolean isPalindrome(int a) {
	    if(a < 0){
	        return false;
	    }
	    String s = ""+a;
	    for(int i =0, j = s.length()-1; i < s.length()/2 && j > s.length()/2-1; i++, j--){
	       if(s.charAt(i) != s.charAt(j)){
	           return false;
	       }
	    }
	    return true;
	}
}
