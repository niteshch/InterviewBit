package Strings;
/*
Zigzag String
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P.......A........H.......N
..A..P....L....S....I...I....G
....Y.........I........R
And then read line by line: PAHNAPLSIIGYIR
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR"
**Example 2 : **
ABCD, 2 can be written as

A....C
...B....D
and hence the answer would be ACBD.
 */
public class ZigZagString {
	public String convert(String a, int b) {
	    if(b == 1){
	        return a;
	    }
	    boolean goingUp = false;
	    boolean goingDown = true;
	    StringBuffer[] sb = new StringBuffer[b];
	    int idx = 0;
	    for(int i = 0; i < a.length(); i++){
	        if(sb[idx] == null){
	            sb[idx] = new StringBuffer();
	        }
	        sb[idx].append(a.charAt(i));
	        if(goingDown){
	            if(idx == b - 1){
	                idx--;
	                goingDown = false;
	                goingUp = true;
	            }else{
	                idx++;
	            }
	        }else if(goingUp){
	            if(idx == 0){
	                idx++;
	                goingDown = true;
	                goingUp = false;
	            }else{
	                idx--;
	            }
	        }
	    }
	    StringBuffer output = new StringBuffer();
	    for(int i = 0; i < b; i++){
	        if(sb[i] != null){
	            output.append(sb[i]);
	        }
	    }
	    
	    return output.toString();
	}
}
