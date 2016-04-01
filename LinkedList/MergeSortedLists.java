package LinkedList;
/*
Merge Two Sorted Lists
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.

For example, given following linked lists :

  5 -> 8 -> 20 
  4 -> 11 -> 15
The merged list should be :

4 -> 5 -> 8 -> 11 -> 15 -> 20
 */
public class MergeSortedLists {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
	    ListNode prev = null, p1 = a, p2 = b,next = null;
	    while(p2 != null){
	        while(p1 != null && p1.val < p2.val){
	            prev = p1;
	            p1 = p1.next;
	        }
	        if(prev != null){
	            prev.next = p2;
                prev = p2;
                next = p2.next;
                p2.next = p1;
                p2 = next;
	        }else{
	            a = p2;
	            prev = p2;
                next = p2.next;
                p2.next = p1;
                p2 = next;
	        }
	    }
	    return a;
	}
}
