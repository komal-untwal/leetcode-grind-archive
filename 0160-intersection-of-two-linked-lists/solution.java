/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        Set<ListNode> pb = new HashSet<>();
        while(headB != null)
        {
            pb.add(headB);
            headB = headB.next;
        } 
        
        while(headA != null)
        {
            if(pb.contains(headA)) return headA;
            headA = headA.next;
        }
        return null;
    }
}
