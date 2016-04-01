package Strings;
/*
Integer To Roman
Please Note:

Another question which belongs to the category of questions which are intentionally stated vaguely. 
Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.

Given an integer, convert it to a roman numeral, and return a string corresponding to its roman numeral version

Input is guaranteed to be within the range from 1 to 3999.

Example :

Input : 5
Return : "V"

Input : 14
Return : "XIV"
 Note : This question has a lot of scope of clarification from the interviewer. Please take a moment to think of all the needed clarifications and see the expected response using “See Expected Output” For the purpose of this question, https://projecteuler.net/about=roman_numerals has very detailed explanations. 
 */
public class IntegerToRoman {
	public String intToRoman(int a) {
	    StringBuffer output = new StringBuffer();
	    while(a >= 1000){
	        output.append("M");
	        a = a - 1000;
	    }
	    if(a >= 900){
	        output.append("CM");
	        a = a - 900;
	    }
	    if(a >= 500){
	        output.append("D");
	        a = a - 500;
	    }
	    if(a >= 400 && !output.toString().contains("D")){
	        output.append("CD");
	        a = a - 400;
	    }
	    while(a >= 100){
	        output.append("C");
	        a = a - 100;
	    }
	    if(a >= 90){
	        output.append("XC");
	        a = a - 90;
	    }
	    if(a >= 50){
	        output.append("L");
	        a = a - 50;
	    }
	    if(a >= 40 && !output.toString().contains("L")){
	        output.append("XL");
	        a = a - 40;
	    }
	    while(a >= 10){
	        output.append("X");
	        a = a - 10;
	    }
	    if(a >= 9){
	        output.append("IX");
	        a = a - 9;
	    }
	    if(a >= 5){
	        output.append("V");
	        a = a - 5;
	    }
	    if(a >= 4 && !output.toString().contains("V")){
	        output.append("IV");
	        a = a - 4;
	    }
	    while(a > 0){
	        output.append("I");
	        a = a - 1;
	    }
	    return output.toString();
	}
}
