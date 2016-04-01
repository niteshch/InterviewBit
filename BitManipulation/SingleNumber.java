package BitManipulation;

import java.util.List;

/*
Single Number
Given an array of integers, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example :

Input : [1 2 2 3 1]
Output : 3
 */
public class SingleNumber {
	// DO NOT MODIFY THE LIST
		public int singleNumber(final List<Integer> a) {
		    String output = null;
		    for(Integer element : a){
		        String binaryString = Integer.toBinaryString(element);
		        if(output == null){
		            output = binaryString;
		        }else{
		            int n = output.length();
		            int m = binaryString.length();
		            if(n < m){
		                StringBuffer temp = new StringBuffer(output);
		                for(int i = 0; i < m-n; i++){
		                    temp.insert(0,"0");
		                }
		                output = temp.toString();
		            }else if(n > m){
		                StringBuffer temp = new StringBuffer(binaryString);
		                for(int i = 0; i < n-m; i++){
		                    temp.insert(0,"0");
		                }
		                binaryString = temp.toString();
		            }
		            
		            StringBuffer temp = new StringBuffer();
		            for(int i = 0; i < output.length(); i++){
		                char c1 = output.charAt(i);
		                char c2 = binaryString.charAt(i);
		                if((c1 == '0' && c2 == '1') || (c1 == '1' && c2 == '0')){
		                    temp.append("1");
		                }else{
		                    temp.append("0");
		                }
		            }
		            output = temp.toString();
		        }
		    }
		    
		    return Integer.parseInt(output,2);
		}
}
