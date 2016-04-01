package Strings;
/*
Roman To Integer
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Read more details about roman numerals at Roman Numeric System

Example :

Input : "XIV"
Return : 14
Input : "XX"
Output : 20
 */
public class RomanToInteger {
	public int romanToInt(String a) {
	    int output = 0;
	    for(int i = 0; i < a.length(); i++){
	        char c1 = a.charAt(i);
	        if(i+1 < a.length()){
	            char c2 = a.charAt(i+1);
	            if(c1 == 'C' && c2 == 'M'){
	                output+= 900;
	                i++;
	            }else if(c1 == 'C' && c2 == 'D'){
	                output+= 400;
	                i++;
	            }else if(c1 == 'X' && c2 == 'C'){
	                output+= 90;
	                i++;
	            }else if(c1 == 'X' && c2 == 'L'){
	                output+= 40;
	                i++;
	            }else if(c1 == 'I' && c2 == 'X'){
	                output+= 9;
	                i++;
	            }else if(c1 == 'I' && c2 == 'V'){
	                output+= 4;
	                i++;
	            }else{
	                output+=convertCharacterToInt(c1);
	            }
	        }else{
	            output+=convertCharacterToInt(c1);
	        }
	    }
	    return output;
	}
	private int convertCharacterToInt(char c){
	    switch(c){
	        case 'M':
	            return 1000;
	        case 'D':
	            return 500;
	        case 'C':
	            return 100;
	        case 'L':
	            return 50;
	        case 'X':
	            return 10;
	        case 'V':
	            return 5;
	        case 'I':
	            return 1;
	    }
	    return 0;
	}
}
