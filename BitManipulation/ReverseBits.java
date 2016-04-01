package BitManipulation;
/*
Reverse Bits
Reverse bits of an 32 bit unsigned integer

Example 1:

x = 0,

          00000000000000000000000000000000  
=>        00000000000000000000000000000000
return 0

Example 2:

x = 3,

          00000000000000000000000000000011 
=>        11000000000000000000000000000000
return 3221225472

Since java does not have unsigned int, use long
 */
public class ReverseBits {
	public long reverse(long a) {
	    StringBuffer sb = new StringBuffer(Long.toBinaryString(a));
	    int m = 32-sb.length();
	    for(int i = 0; i < m;i++){
	        sb.insert(0,"0");
	    }
	    String output = sb.reverse().toString();
	    return Long.parseLong(output,2);
	}
}
