package LinkedList;
/*
Reverse Link List II
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

 Note:
Given m, n satisfy the following condition:
1 <= m <= n <= length of list. Note 2:
Usually the version often seen in the interviews is reversing the whole linked list which is obviously an easier version of this question. 
 */
public class ReverseLinkListII {
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    ListNode current = a;
	    int count = 1;
	    while(current != null && count < m - 1){
	        current = current.next;
	        count++;
	    }
	    if(m != 1){
	        current.next = reverseRange(current.next, n - m + 1);
	    }else{
	        a = reverseRange(current, n - m + 1);
	    }
	    return a;
	}
	private ListNode reverseRange(ListNode head, int end){
	    int count = 1;
	    ListNode prev = null, current = head, next = null;
	    while(current != null && count <= end){
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	        count++;
	    }
	    
	    ListNode temp = prev;
	    if(temp != null){
	        while(temp.next != null){
    	        temp = temp.next;
    	    }
    	    temp.next = current;
	    }
	    
	    return prev;
	}
}
