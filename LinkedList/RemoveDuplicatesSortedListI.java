package LinkedList;

/*
Remove Duplicates from Sorted List
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesSortedListI {
	public ListNode deleteDuplicates(ListNode a) {
		ListNode current = a;
		while (current != null) {
			ListNode runner = current.next;
			while (runner != null && runner.val == current.val) {
				runner = runner.next;
			}
			current.next = runner;
			current = current.next;
		}
		return a;
	}
}
