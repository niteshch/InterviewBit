package LinkedList;
/*
List Cycle
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.

Example :

Input : 

                  ______
                 |     |
                 \/    |
        1 -> 2 -> 3 -> 4

Return the node corresponding to node 3. 
 */
public class ListCycle {
	public ListNode detectCycle(ListNode a) {
	    ListNode slow = a, fast = a;
        while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
          if(slow == fast){
              break;
          }
        }
        if(slow == fast){
          slow = a;
          while(slow != fast){
            slow = slow.next;
            fast = fast.next;
          }
          return slow;
        }
        
        return null;
	}
}
