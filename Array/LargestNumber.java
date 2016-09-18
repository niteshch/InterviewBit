package Array;
import java.util.Arrays;
import java.util.List;

/*Largest Number
Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.*/
public class LargestNumber {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> A) {
	    StringBuffer strBuf = new StringBuffer();
	    Node num[];
	    int i = 0;
	    
	    num = new Node[A.size()];
	    
	    for (int n : A) {
	        num[i] = new Node(n);
	        i++;
	    }
	    
	    Arrays.sort(num);
	    
	    for (Node n : num) {
	        if (n.number == 0 && strBuf.length() == 0)
	            continue;
	        strBuf.append(n.number);
	    }
	    
	    if(strBuf.length() == 0){
	    	return "0";
	    }

	    
	    return strBuf.toString();
	}
	
	class Node implements Comparable<Node> {
	    
	    int number;
	    
	    public Node(int number) {
	        this.number = number;
	    }
	    
	    @Override
	    public int compareTo(Node o) {
	        String first = String.valueOf(this.number) + String.valueOf(o.number);
	        String second = String.valueOf(o.number) + String.valueOf(this.number);
	        
	        return second.compareTo(first);
	    }
	    
	}
}