package LinkedList;
/*
Remove Duplicates from Sorted List II
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */
public class RemoveDuplicatesSortedListII {
	public ListNode deleteDuplicates(ListNode a) {
	    ListNode prev = null, current = a;
	    while(current != null && current.next != null){
	        if(current.val == current.next.val){
	            int val = current.val;
	            while(current != null && current.val == val){
	                current = current.next;
	            }
	            if(prev == null){
	                a = current;
	            }else{
	                prev.next = current;
	            }
	        }else{
	            prev = current;
	            current = current.next;
	        }
	    }
	    return a;
	}
}
