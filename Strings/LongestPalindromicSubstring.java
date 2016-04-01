package Strings;
/*
Longest Palindromic SubstringBookmark
Given a string S, find the longest palindromic substring in S.

Substring of string S:

S[i...j] where 0 <= i <= j < len(S)

Palindrome string:

A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.

Incase of conflict, return the substring which occurs first ( with the least starting index ).

Example :

Input : "aaaabaaa"
Output : "aaabaaa"
 */
public class LongestPalindromicSubstring {
	public String longestPalindrome(String a) {
	    int n = a.length();
	    boolean[][] table = new boolean[n][n];
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
        
        // check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n-1; ++i)
        {
            if (a.charAt(i) == a.charAt(i+1))
            {
                table[i][i+1] = true;
                start = i;
                maxLength = 2;
            }
        }
        
        // Check for lengths greater than 2. k is length
        // of substring
        for (int k = 3; k <= n; ++k)
        {
            // Fix the starting index
            for (int i = 0; i < n-k+1 ; ++i)
            {
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;
        
                // checking for sub-string from ith index to
                // jth index iff str[i+1] to str[j-1] is a
                // palindrome
                if (table[i+1][j-1] && a.charAt(i) == a.charAt(j))
                {
                    table[i][j] = true;
        
                    if (k > maxLength)
                    {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        return a.substring(start, start+maxLength);
	}
}
