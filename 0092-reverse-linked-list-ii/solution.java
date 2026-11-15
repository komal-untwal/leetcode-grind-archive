/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       //define a dummy node always to maintain starting point of list i.e.head.
       ListNode dummy = new ListNode(0,head);

       //1. Reach till the left pointer
       ListNode leftPrev = dummy, curr = head;
       for(int i=0; i<left-1; i++){
            leftPrev = leftPrev.next;
            curr = curr.next;
       }

       //2.reverse the list from left to right nodes
       // currently leftPrev is pointing to node before left & leftPrev.next is left
       // And curr = left
       ListNode prev = null;
       for(int i=0; i<(right-left+1); i++){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
       }

       //finally update the remaining pointers 
       //at the end of above loop, prev= right pointer, curr = the next node of right
       //leftPrev is still node before left
       leftPrev.next.next = curr;
       leftPrev.next = prev;

       return dummy.next; 

    }
}
