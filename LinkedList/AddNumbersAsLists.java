package LinkedList;
/*
Add Two Numbers as Lists
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

    342 + 465 = 807
Make sure there are no trailing zeros in the output list
So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.
 */
public class AddNumbersAsLists {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
	    ListNode p1 = a, p2 = b;
	    if(p1 == null){
	        return p1;
	    }
	    if(p2 == null){
	        return p2;
	    }
	    ListNode output = null, current = null;
	    int carry = 0;
	    while(p1 != null && p2 != null){
	        int val = p1.val + p2.val + carry;
	        carry = val/10;
	        val = val%10;
	        if(output == null){
	            output = new ListNode(val);
	            current = output;
	        }else{
	            ListNode temp = new ListNode(val);
	            current.next = temp;
	            current = temp;
	        }
	        p1 = p1.next;
	        p2 = p2.next;
	    }
	    
	    while(p1 != null){
	        int val = p1.val + carry;
	        carry = val/10;
	        val = val%10;
	        ListNode temp = new ListNode(val);
            current.next = temp;
            current = temp;
            p1 = p1.next;
	    }
	    
	    while(p2 != null){
	        int val = p2.val + carry;
	        carry = val/10;
	        val = val%10;
	        ListNode temp = new ListNode(val);
            current.next = temp;
            current = temp;
            p2 = p2.next;
	    }
	    
	    if(carry != 0){
	        ListNode temp = new ListNode(carry);
            current.next = temp;
            current = temp;
	    }
	    
	    return output;
	}
}
