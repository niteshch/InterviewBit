package LinkedList;
/*
Rotate List
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:

Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
 */
public class RotateList {
	public ListNode rotateRight(ListNode A, int B) {
	    int n;
	    ListNode node;
	    ListNode head;
	    
	    if (A == null)
	        return null;
	        
	    node = A;
	    n = 0;
	    
	    while (node != null) {
	        n++;
	        node = node.next;
	    }
	    
	    B = B % n;
	    
	    if (B == 0)
	        return A;
	    
	    node = A;
	    ListNode last = null;
	    
	    for (int i = 0; i < n - B; i++) {
	        last = node;
	        node = node.next;
	    }
	        
	    last.next = null;
	    head = node;
	    
	    while (node.next != null)
	        node = node.next;
	        
	    node.next = A;
	    
	    return head;
	    
	}
}
