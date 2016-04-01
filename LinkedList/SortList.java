package LinkedList;
/*
Sort List
Sort a linked list in O(n log n) time using constant space complexity.

Example :

Input : 1 -> 5 -> 4 -> 3

Returned list : 1 -> 2 -> 4 -> 5
 */
public class SortList {
	public ListNode sortList(ListNode a) {
	    if(a == null || a.next == null){
	        return a;
	    }
	    ListNode a1 = a;
	    ListNode a2 = null;
	    ListNode middle = findMiddle(a);
	    if(middle != null){
	        a2 = middle.next;
	        middle.next = null;   
	    }
	    a1 = sortList(a1);
	    a2 = sortList(a2);
	    a = mergeTwoLists(a1,a2);
	    return a;
	}
	public ListNode findMiddle(ListNode a){
	    ListNode slow = a, fast = a;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
	}
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
