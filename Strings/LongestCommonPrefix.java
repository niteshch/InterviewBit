package Strings;

import java.util.ArrayList;

/*
Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.

Example:

Given the array as:

[

  "abcdefgh",

  "aefghijk",

  "abcefgh"
]
The answer would be “a”.
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(ArrayList<String> a) {
	    String longestString = "";
	    for(String s : a){
	        if(s.length() > longestString.length()){
	            longestString = s;
	        }
	    }
	    StringBuffer longestPrefix = new StringBuffer(longestString);
	    for(String s : a){
            for(int i = 0; i < longestPrefix.length(); i++){
	            if(i >= s.length() || s.charAt(i) != longestPrefix.charAt(i)){
	                longestPrefix.delete(i, longestPrefix.length());
	            }
            }
	    }
	    return longestPrefix.toString();
	}
}
