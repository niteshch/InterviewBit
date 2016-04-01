package LinkedList;
/*
Reorder List
Given a singly linked list

    L: L0 -> L1 -> ... -> Ln-1 -> Ln,
reorder it to:

    L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 -> ...
You must do this in-place without altering the nodes’ values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */
public class ReorderList {
	public ListNode reorderList(ListNode a) {
	    ListNode middle = null, slow = a, fast = a;
	    while(fast != null && fast.next != null && fast.next.next != null){
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    middle = slow;
	    ListNode secondHalf = middle.next;
	    middle.next = null;
	    ListNode reversedHalf = reverseList(secondHalf);
	    
	    
	    ListNode firstHalf = a;
	    boolean odd = true;
	    ListNode output = new ListNode(0);
	    ListNode current = output;
	    while(firstHalf != null && reversedHalf != null){
	        if(odd){
	            current.next = firstHalf;
	            odd = false;
	            current = current.next;
	            firstHalf = firstHalf.next;
	        }else{
	            current.next = reversedHalf;
	            odd = true;
	            current = current.next;
	            reversedHalf = reversedHalf.next;
	        }
	    }
	    if(firstHalf != null){
	        current.next = firstHalf;
	    }else if(reversedHalf != null){
	        current.next = reversedHalf;
	    }
	    return output.next;
	}
	public ListNode reverseList(ListNode head){
	    ListNode prev = null, next = null, current = head;
	    while(current != null){
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    }
	    return prev;
	}
}
