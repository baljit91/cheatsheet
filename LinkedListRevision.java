1.Reverse Linked List

Technique: 
ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
        
Time Complexity : O(n)
Space Complexity : O(1)
------------------------------------------------
2..//linked list middle

while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
------------------------------------------------

