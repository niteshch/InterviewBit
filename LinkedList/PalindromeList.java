package LinkedList;
/*
Palindrome List
Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.

Notes: 
- Expected solution is linear in time and constant in space.

For example,

List 1-->2-->1 is a palindrome.
List 1-->2-->3 is not a palindrome.
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class PalindromeList {
	public int lPalin(ListNode head) {
        if(head == null || head.next == null){
            return 1;
        }
        
        ListNode middle = null;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        middle = slow;
        middle.next = reverseList(middle.next);
        ListNode pointer1 = head, pointer2 = middle.next;
        while(pointer1 != middle.next && pointer2 != null){
            if(pointer1.val != pointer2.val){
                return 0;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return 1;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev = null, current = head, next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
