package LinkedList;
/*
Partition List
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */
public class PartitionList {
	public ListNode partition(ListNode a, int b) {
	    ListNode low = null, high = null, lowTail = null, highTail = null;
	    ListNode current = a;
	    while(current != null){
	        int key = current.val;
	        if(key < b){
	            if(low == null){
	                low = new ListNode(key);
	                lowTail = low;
	            }else{
	                lowTail.next = new ListNode(key);
	                lowTail = lowTail.next;
	            }
	        }else{
	            if(high == null){
	                high = new ListNode(key);
	                highTail = high;
	            }else{
	                highTail.next = new ListNode(key);
	                highTail = highTail.next;
	            }
	        }
	        current = current.next;
	    }
	    if(low == null){
	        return high;
	    }
	    if(lowTail != null){
	        lowTail.next = high;
	    }
	    return low;
	    
	}
}
