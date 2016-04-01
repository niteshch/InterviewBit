package LinkedList;

/*
Insertion Sort List
Sort a linked list using insertion sort.

We have explained Insertion Sort at Slide 7 of Arrays

Insertion Sort Wiki has some details on Insertion Sort as well.

Example :

Input : 1 -> 3 -> 2

Return 1 -> 2 -> 3
 */
public class InsertionSortList {
	public ListNode insertionSortList(ListNode a) {
	    ListNode i = a;
	    while(i != null){
	        ListNode j = i.next;
	        while(j != null){
	            if(j.val < i.val){
	                int temp = i.val;
	                i.val = j.val;
	                j.val = temp;
	            }
	            j = j.next;
	        }
	        i = i.next;
	    }
	    return a;
	}
}
