# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        # first find the middle of the list
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        #when fast reach toi end of the list slow points to the middle of the list
        #now we reverse the second half of the list
        prev = None
        #since slow is our current head now
        while slow:
            tmp_nxt = slow.next
            slow.next = prev
            prev = slow
            slow = tmp_nxt
        #at the end prev will point to the start of the reversed list    

        #Now we compare the two halves
        first_half, second_half = head,prev
        while first_half and second_half:
            if(first_half.val != second_half.val):
                return False
            first_half = first_half.next  
            second_half = second_half.next  
        return True    

            
