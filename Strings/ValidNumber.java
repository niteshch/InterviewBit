package Strings;
/*
Valid Number
Please Note:

Note: It is intended for some problems to be ambiguous. You should gather all requirements up front before implementing one.

Please think of all the corner cases and clarifications yourself.

Validate if a given string is numeric.

Examples:

"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Clarify the question using “See Expected Output”

Is 1u ( which may be a representation for unsigned integers valid?
For this problem, no.
Is 0.1e10 valid?
Yes
-01.1e-10?
Yes
Hexadecimal numbers like 0xFF?
Not for the purpose of this problem
3. (. not followed by a digit)?
No
Can exponent have decimal numbers? 3e0.1?
Not for this problem.
Is 1f ( floating point number with f as prefix ) valid?
Not for this problem.
How about 1000LL or 1000L ( C++ representation for long and long long numbers )?
Not for this problem.
How about integers preceded by 00 or 0? like 008?
Yes for this problem
 */
public class ValidNumber {
	public int isNumber(final String s) {
	    if(s == null){
	        return 0;
	    }
	    String a = s.trim();
        if(a.length() == 0){
            return 0;
        }
        if(a.contains(".e") || a.contains("e.")){
            return 0;
        }
	    int countE = 0, countDot = 0, countMinus = 0;
        int indexE = -1, indexDot = -1;
        
        int n = a.length();

        for(int i =0; i < n; i++){
            char c = a.charAt(i);
            if(c == 'e'){
                if(countE == 1 || i == 0 || i == n - 1){
                    return 0;
                }
                countE++;
                indexE = i;
            }else if(c == '.'){
                if(countDot == 1 || (indexE > 0 && i > indexE)  || i == n - 1 ){
                  return 0;
                }
                countDot++;
                indexDot = i;
            }else if(c == '-'){
                if(!(i - 1 == indexE || i == 0) || i == n-1 ){
                    return 0;
                }
                countMinus++;
            }
            else if(!(c >= '0' && c <= '9')){
                return 0;
            }
        }
        return 1;
	}
}
