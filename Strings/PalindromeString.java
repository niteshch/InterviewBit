package Strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
Palindrome String
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 */
public class PalindromeString {
	public int isPalindrome(String a) {
	    Map<Character,Integer> characterCountMap = new HashMap<Character,Integer>();
	    a = a.toLowerCase();
	    for(int i = 0; i < a.length(); i++){
	        char b = a.charAt(i);
	        if((b >= 'a' && b <='z') || (b >= '0' && b <='9')){
	            Integer count = characterCountMap.get(b);
	            if(count == null){
	                characterCountMap.put(b,1);
	            }else{
	                characterCountMap.put(b,++count);
	            }
	        }
	    }
	    int oddCharacterCount = 0;
	    Collection<Integer>countList = characterCountMap.values();
	    for(Integer count: countList){
	        if(count % 2 != 0){
	            ++oddCharacterCount;
	        }
	    }
	    if(oddCharacterCount > 1){
	        return 0;
	    }else if(oddCharacterCount == 1 && a.length() % 2 !=0){
	        return 1;
	    }
	    return 1;
	}
}
