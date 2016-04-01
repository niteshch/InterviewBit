package LinkedList;
/*
Remove Nth Node from List End
Given a linked list, remove the nth node from the end of list and return its head.

For example,
Given linked list: 1->2->3->4->5, and n = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.

 Note:
* If n is greater than the size of the list, remove the first node of the list. 
Try doing it using constant additional space.
 */
public class RemoveLastNthNode {
	public ListNode removeNthFromEnd(ListNode head, int n) {
	    int count = 1;
	    ListNode current = head;
	    while(current != null && count < n){
	        current = current.next;
	        count++;
	    }
	    if(current != null){
	        ListNode nThNode = head, prev = null;
	        while(current.next != null){
	            prev = nThNode;
	            nThNode = nThNode.next;
	            current = current.next;
	        }
	        if(prev != null){
	            prev.next = nThNode.next;
	        }else{
	            head = head.next;
	        }
	    }else{
	        head = head.next;
	    }
	    return head;
	}
}
